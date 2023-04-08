package de.fabulousfox.gvox_java;

import de.fabulousfox.gvox_java.consumerapi.GvoxAdapter;
import de.fabulousfox.gvox_java.consumerapi.GvoxAdapterContext;
import de.fabulousfox.gvox_java.consumerapi.GvoxBaseAdapterInfo;
import de.fabulousfox.gvox_java.consumerapi.GvoxContext;
import de.fabulousfox.gvox_java.consumerapi.config.input.GvoxByteBufferInputAdapterConfig;
import de.fabulousfox.gvox_java.consumerapi.config.input.GvoxFileInputAdapterConfig;
import de.fabulousfox.gvox_java.consumerapi.config.output.GvoxByteBufferOutputAdapterConfig;
import de.fabulousfox.gvox_java.consumerapi.config.output.GvoxFileOutputAdapterConfig;
import de.fabulousfox.gvox_java.consumerapi.config.parse.GvoxVoxlapParseAdapterConfig;
import de.fabulousfox.gvox_java.consumerapi.config.serialize.GvoxColoredTextSerializeAdapterConfig;
import de.fabulousfox.gvox_java.enums.GvoxChannelBit;
import de.fabulousfox.gvox_java.enums.GvoxResult;
import de.fabulousfox.gvox_java.errors.GvoxAdapterContextNullException;
import de.fabulousfox.gvox_java.errors.GvoxAdapterNullException;
import de.fabulousfox.gvox_java.errors.GvoxContextNullException;
import de.fabulousfox.gvox_java.nativelayer.__GvoxNativeIncludeInterface;
import de.fabulousfox.gvox_java.nativelayer.__GvoxNativeRuntimeHelper;
import de.fabulousfox.gvox_java.structs.GvoxRegionRange;

import java.io.IOException;
import java.io.InputStream;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.List;

import static java.lang.foreign.ValueLayout.*;

/**
 * The main class of the gvox-java library.
 * It provides the static methods to create a context and to load and save voxels.
 * It also provides the static methods to create the adapter configurations.
 **/
public class GVOX {
    private GVOX() {
    }

    /**
     * The version of the gvox-java library.
     **/
    public static final String VERSION = "1.2.5";

    private static boolean initialized = false;

    private static HashMap<GvoxContext, MemorySegment> contexts = new HashMap<>();
    private static HashMap<GvoxAdapter, MemorySegment> adapters = new HashMap<>();
    private static HashMap<GvoxBaseAdapterInfo, MemorySegment> adapterInfos = new HashMap<>();
    private static HashMap<GvoxAdapterContext, MemorySegment> adapterContexts = new HashMap<>();

    private static void checkInit() {
        if (initialized) return;
        contexts = new HashMap<>();
        adapters = new HashMap<>();
        adapterInfos = new HashMap<>();
        adapterContexts = new HashMap<>();

        String osName = System.getProperty("os.name");

        if (osName.startsWith("Windows")) {
            try {
                Path temp = Files.createTempFile("resource-", ".dll");
                String path = "win64/gvox" + VERSION.replace(".", "_") + ".dll";

                InputStream is = GVOX.class.getClassLoader().getResourceAsStream(path);
                if (is == null) throw new RuntimeException("Failed to load native library");

                Files.copy(is, temp, StandardCopyOption.REPLACE_EXISTING);
                System.load(temp.toAbsolutePath().toString());
            } catch (IOException e) {
                throw new RuntimeException("Failed to load native library", e);
            }
        } else {
            throw new IllegalStateException("Unsupported OS: " + osName);
        }

        initialized = true;
    }

    /**
     * Frees all resources used by the gvox-java library.
     */
    public static void close() {
        if (!initialized) return;
        for (MemorySegment mem : contexts.values()) {
            __GvoxNativeIncludeInterface.gvox_destroy_context(mem);
        }
        __GvoxNativeRuntimeHelper.arena.close();
        initialized = false;
    }

    /**
     * Creates a new context.
     *
     * @return The new context.
     */
    public static GvoxContext create_context() {
        checkInit();
        MemorySegment mem = __GvoxNativeIncludeInterface.gvox_create_context();
        GvoxContext ctx = new GvoxContext();
        contexts.put(ctx, mem);
        return ctx;
    }

    /**
     * Destroys the given context.
     *
     * @param context The context to destroy.
     */
    public static void destroy_context(GvoxContext context) {
        checkInit();
        MemorySegment mem = contexts.getOrDefault(context, null);
        if (mem == null) throw new GvoxContextNullException();
        __GvoxNativeIncludeInterface.gvox_destroy_context(mem);
        contexts.remove(context);
    }

    /**
     * Gets the result status of the last operation.
     *
     * @param ctx The context to get the result from.
     * @return The result status.
     */
    public static GvoxResult get_result(GvoxContext ctx) {
        checkInit();
        MemorySegment mem = contexts.getOrDefault(ctx, null);
        if (mem == null) throw new GvoxContextNullException();
        return GvoxResult.fromInt(__GvoxNativeIncludeInterface.gvox_get_result(mem));
    }

    ;

    /**
     * Gets the result message of the last operation.
     *
     * @param ctx The context to get the result message from.
     * @return The result message.
     */
    public static String get_result_message(GvoxContext ctx) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(ctx, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment str_size = __GvoxNativeRuntimeHelper.arena.allocate(ValueLayout.OfLong.JAVA_LONG);
        __GvoxNativeIncludeInterface.gvox_get_result_message(contextMem, null, str_size);
        long size = str_size.get(ValueLayout.OfLong.JAVA_LONG, 0);
        MemorySegment str_buffer = __GvoxNativeRuntimeHelper.arena.allocateArray(ValueLayout.OfByte.JAVA_CHAR, size);
        __GvoxNativeIncludeInterface.gvox_get_result_message(contextMem, str_buffer, str_size);
        return str_buffer.getUtf8String(0);
    }

    ;

    /**
     * Pops the result status of the last operation.
     *
     * @param ctx The context to pop the result from.
     */
    public static void pop_result(GvoxContext ctx) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(ctx, null);
        if (contextMem == null) throw new GvoxContextNullException();
        __GvoxNativeIncludeInterface.gvox_pop_result(contextMem);
    }

    ;

    /**
     * Gets the input adapter object from the given name.
     *
     * @param context The context to get the adapter from.
     * @param name    The name of the adapter.
     * @return The adapter object.
     */
    public static GvoxAdapter get_input_adapter(GvoxContext context, String name) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(context, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment mem = __GvoxNativeIncludeInterface.gvox_get_input_adapter(contextMem, __GvoxNativeRuntimeHelper.arena.allocateUtf8String(name));
        GvoxAdapter adapter = new GvoxAdapter();
        adapters.put(adapter, mem);
        return adapter;
    }

    /**
     * Gets the output adapter object from the given name.
     *
     * @param context The context to get the adapter from.
     * @param name    The name of the adapter.
     * @return The adapter object.
     */
    public static GvoxAdapter get_output_adapter(GvoxContext context, String name) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(context, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment mem = __GvoxNativeIncludeInterface.gvox_get_output_adapter(contextMem, __GvoxNativeRuntimeHelper.arena.allocateUtf8String(name));
        GvoxAdapter adapter = new GvoxAdapter();
        adapters.put(adapter, mem);
        return adapter;
    }

    /**
     * Gets the parsing adapter object from the given name.
     *
     * @param context The context to get the adapter from.
     * @param name    The name of the adapter.
     * @return The adapter object.
     */
    public static GvoxAdapter get_parse_adapter(GvoxContext context, String name) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(context, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment mem = __GvoxNativeIncludeInterface.gvox_get_parse_adapter(contextMem, __GvoxNativeRuntimeHelper.arena.allocateUtf8String(name));
        GvoxAdapter adapter = new GvoxAdapter();
        adapters.put(adapter, mem);
        return adapter;
    }

    /**
     * Gets the serialization adapter object from the given name.
     *
     * @param context The context to get the adapter from.
     * @param name    The name of the adapter.
     * @return The adapter object.
     */
    public static GvoxAdapter get_serialize_adapter(GvoxContext context, String name) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(context, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment mem = __GvoxNativeIncludeInterface.gvox_get_serialize_adapter(contextMem, __GvoxNativeRuntimeHelper.arena.allocateUtf8String(name));
        GvoxAdapter adapter = new GvoxAdapter();
        adapters.put(adapter, mem);
        return adapter;
    }

    /**
     * Creates an adapter context from the given adapter and its settings.
     *
     * @param context The context to create the adapter context from.
     * @param adapter The adapter to create the adapter context from.
     * @param config  The configuration of the adapter.
     * @return The adapter context.
     */
    public static GvoxAdapterContext create_adapter_context(GvoxContext context, GvoxAdapter adapter, GvoxBaseAdapterInfo config) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(context, null);
        MemorySegment adapterMem = adapters.getOrDefault(adapter, null);
        MemorySegment configMem = adapterInfos.getOrDefault(config, null);
        if (contextMem == null) throw new GvoxContextNullException();
        if (adapterMem == null) throw new GvoxAdapterNullException();

        if (configMem == null && config != null) {
            if (config instanceof GvoxByteBufferInputAdapterConfig config1) {
                StructLayout layout = MemoryLayout.structLayout(
                        ADDRESS.withBitAlignment(64).asUnbounded().withName("data"),
                        JAVA_LONG.withName("size")
                );
                configMem = __GvoxNativeRuntimeHelper.arena.allocate(layout);
                configMem.set(ADDRESS, 0, MemorySegment.ofAddress(config1.buffer.address()));
                configMem.set(JAVA_LONG, 8, config1.buffer.byteSize());
            }
            if (config instanceof GvoxFileInputAdapterConfig config1) {
                StructLayout layout = MemoryLayout.structLayout(
                        ADDRESS.withBitAlignment(64).asUnbounded().withName("filepath"),
                        JAVA_LONG.withName("byte_offset")
                );
                configMem = __GvoxNativeRuntimeHelper.arena.allocate(layout);
                configMem.set(ADDRESS, 0, MemorySegment.ofAddress(__GvoxNativeRuntimeHelper.arena.allocateUtf8String(config1.filepath).address()));
                configMem.set(JAVA_LONG, 8, config1.byteOffset);
            }
            if (config instanceof GvoxFileOutputAdapterConfig config1) {
                StructLayout layout = MemoryLayout.structLayout(
                        ADDRESS.withBitAlignment(64).asUnbounded().withName("filepath")
                );
                configMem = __GvoxNativeRuntimeHelper.arena.allocate(layout);
                configMem.set(ADDRESS, 0, MemorySegment.ofAddress(__GvoxNativeRuntimeHelper.arena.allocateUtf8String(config1.filepath).address()));
            }
            if (config instanceof GvoxVoxlapParseAdapterConfig config1) {
                StructLayout layout = MemoryLayout.structLayout(
                        JAVA_LONG.withName("size_x"),
                        JAVA_LONG.withName("size_y"),
                        JAVA_LONG.withName("size_z"),
                        JAVA_LONG.withName("make_solid"),
                        JAVA_LONG.withName("is_ace_of_spades")
                );
                configMem = __GvoxNativeRuntimeHelper.arena.allocate(layout);
                configMem.set(JAVA_LONG, 0, config1.sizeX);
                configMem.set(JAVA_LONG, 8, config1.sizeY);
                configMem.set(JAVA_LONG, 16, config1.sizeZ);
                configMem.set(JAVA_LONG, 24, config1.make_solid ? 1 : 0);
                configMem.set(JAVA_LONG, 32, config1.is_ace_of_spades ? 1 : 0);
            }
            if (config instanceof GvoxColoredTextSerializeAdapterConfig config1) {
                StructLayout layout = MemoryLayout.structLayout(
                        JAVA_LONG.withName("downscale_factor"),
                        JAVA_LONG.withName("downscale_mode"),
                        JAVA_LONG.withName("non_color_max_value"),
                        JAVA_LONG.withName("vertical")
                );
                configMem = __GvoxNativeRuntimeHelper.arena.allocate(layout);
                configMem.set(JAVA_LONG, 0, config1.downscale_factor);
                configMem.set(JAVA_LONG, 8, config1.downscale_mode.ordinal());
                configMem.set(JAVA_LONG, 16, config1.non_color_max_value == -1 ? 255 : config1.non_color_max_value);
                configMem.set(JAVA_INT, 24, config1.vertical ? 1 : 0);
            }
            if (config instanceof GvoxByteBufferOutputAdapterConfig config1) {
                StructLayout layout = MemoryLayout.structLayout(
                        ADDRESS.withBitAlignment(64).asUnbounded().withName("out_size"),
                        ADDRESS.withBitAlignment(64).asUnbounded().withName("out_byte_buffer_ptr"),
                        ADDRESS.withBitAlignment(64).asUnbounded().withName("allocate")
                );
                configMem = __GvoxNativeRuntimeHelper.arena.allocate(layout);
                configMem.set(ADDRESS, 0, MemorySegment.ofAddress(MemorySegment.NULL.address()));
                configMem.set(ADDRESS, 8, MemorySegment.ofAddress(MemorySegment.NULL.address()));
                configMem.set(ADDRESS, 16, MemorySegment.ofAddress(MemorySegment.NULL.address()));
            }
        }

        if (configMem == null)
            configMem = /*nullptr*/ __GvoxNativeRuntimeHelper.arena.allocate(ADDRESS, MemorySegment.ofAddress(MemorySegment.NULL.address()));

        MemorySegment mem = __GvoxNativeIncludeInterface.gvox_create_adapter_context(contextMem, adapterMem, configMem);
        GvoxAdapterContext ctx = new GvoxAdapterContext();
        adapterContexts.put(ctx, mem);
        return ctx;
    }

    /**
     * Destroys the given adapter context.
     *
     * @param adapterContext The adapter context to destroy.
     */
    public static void destroy_adapter_context(GvoxAdapterContext adapterContext) {
        checkInit();
        MemorySegment adapterContextMem = adapterContexts.getOrDefault(adapterContext, null);
        if (adapterContextMem == null) throw new GvoxAdapterContextNullException();
        __GvoxNativeIncludeInterface.gvox_destroy_adapter_context(adapterContextMem);
    }

    /**
     * Blits a region of the input context to the output context.
     *
     * @param inputContext     The input context.
     * @param outputContext    The output context.
     * @param parseContext     The parse context.
     * @param serializeContext The serialize context.
     * @param range            The region range.
     * @param channels         The channels to blit.
     */
    public static void blit_region(
            GvoxAdapterContext inputContext,
            GvoxAdapterContext outputContext,
            GvoxAdapterContext parseContext,
            GvoxAdapterContext serializeContext,
            GvoxRegionRange range,
            List<GvoxChannelBit> channels
    ) {
        checkInit();
        MemorySegment inputContextMem = adapterContexts.getOrDefault(inputContext, null);
        MemorySegment outputContextMem = adapterContexts.getOrDefault(outputContext, null);
        MemorySegment parseContextMem = adapterContexts.getOrDefault(parseContext, null);
        MemorySegment serializeContextMem = adapterContexts.getOrDefault(serializeContext, null);
        if (inputContextMem == null) throw new GvoxAdapterContextNullException("inputContext");
        if (outputContextMem == null) throw new GvoxAdapterContextNullException("outputContext");
        if (parseContextMem == null) throw new GvoxAdapterContextNullException("parseContext");
        if (serializeContextMem == null) throw new GvoxAdapterContextNullException("serializeContext");

        MemorySegment regionRange = fromGvoxRegionRange(range);
        int targetChannels = fromGvoxChannelBit(channels);

        __GvoxNativeIncludeInterface.gvox_blit_region(inputContextMem, outputContextMem, parseContextMem, serializeContextMem, regionRange, targetChannels);
    }

    /**
     * Blits a region of the input context to the output context.
     *
     * @param inputContext     The input context.
     * @param outputContext    The output context.
     * @param parseContext     The parse context.
     * @param serializeContext The serialize context.
     * @param range            The region range.
     * @param channels         The channels to blit.
     */
    public static void blit_region_parse_driven(
            GvoxAdapterContext inputContext,
            GvoxAdapterContext outputContext,
            GvoxAdapterContext parseContext,
            GvoxAdapterContext serializeContext,
            GvoxRegionRange range,
            List<GvoxChannelBit> channels
    ) {
        checkInit();
        MemorySegment inputContextMem = adapterContexts.getOrDefault(inputContext, null);
        MemorySegment outputContextMem = adapterContexts.getOrDefault(outputContext, null);
        MemorySegment parseContextMem = adapterContexts.getOrDefault(parseContext, null);
        MemorySegment serializeContextMem = adapterContexts.getOrDefault(serializeContext, null);
        if (inputContextMem == null) throw new GvoxAdapterContextNullException("inputContext");
        if (outputContextMem == null) throw new GvoxAdapterContextNullException("outputContext");
        if (parseContextMem == null) throw new GvoxAdapterContextNullException("parseContext");
        if (serializeContextMem == null) throw new GvoxAdapterContextNullException("serializeContext");

        MemorySegment regionRange = fromGvoxRegionRange(range);
        int targetChannels = fromGvoxChannelBit(channels);

        __GvoxNativeIncludeInterface.gvox_blit_region_parse_driven(inputContextMem, outputContextMem, parseContextMem, serializeContextMem, regionRange, targetChannels);
    }

    /**
     * Blits a region of the input context to the output context.
     *
     * @param inputContext     The input context.
     * @param outputContext    The output context.
     * @param parseContext     The parse context.
     * @param serializeContext The serialize context.
     * @param range            The region range.
     * @param channels         The channels to blit.
     */
    public static void blit_region_serialize_driven(
            GvoxAdapterContext inputContext,
            GvoxAdapterContext outputContext,
            GvoxAdapterContext parseContext,
            GvoxAdapterContext serializeContext,
            GvoxRegionRange range,
            List<GvoxChannelBit> channels
    ) {
        checkInit();
        MemorySegment inputContextMem = adapterContexts.getOrDefault(inputContext, null);
        MemorySegment outputContextMem = adapterContexts.getOrDefault(outputContext, null);
        MemorySegment parseContextMem = adapterContexts.getOrDefault(parseContext, null);
        MemorySegment serializeContextMem = adapterContexts.getOrDefault(serializeContext, null);
        if (inputContextMem == null) throw new GvoxAdapterContextNullException("inputContext");
        if (outputContextMem == null) throw new GvoxAdapterContextNullException("outputContext");
        if (parseContextMem == null) throw new GvoxAdapterContextNullException("parseContext");
        if (serializeContextMem == null) throw new GvoxAdapterContextNullException("serializeContext");

        MemorySegment regionRange = fromGvoxRegionRange(range);
        int targetChannels = fromGvoxChannelBit(channels);

        __GvoxNativeIncludeInterface.gvox_blit_region_serialize_driven(inputContextMem, outputContextMem, parseContextMem, serializeContextMem, regionRange, targetChannels);
    }

    private static MemorySegment fromGvoxRegionRange(GvoxRegionRange range) {
        StructLayout layout = MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                        JAVA_LONG.withName("x"),
                        JAVA_LONG.withName("y"),
                        JAVA_LONG.withName("z")
                ).withName("offset"),
                MemoryLayout.structLayout(
                        JAVA_LONG.withName("x"),
                        JAVA_LONG.withName("y"),
                        JAVA_LONG.withName("z")
                ).withName("extent")
        );
        MemorySegment mem = __GvoxNativeRuntimeHelper.arena.allocate(layout);
        mem.set(JAVA_LONG, 0, range.offset().x());
        mem.set(JAVA_LONG, 8, range.offset().y());
        mem.set(JAVA_LONG, 16, range.offset().z());
        mem.set(JAVA_LONG, 24, range.extent().x());
        mem.set(JAVA_LONG, 32, range.extent().y());
        mem.set(JAVA_LONG, 40, range.extent().z());
        return mem;
    }

    private static int fromGvoxChannelBit(List<GvoxChannelBit> iterable) {
        if (iterable.size() == 0) return 0;
        if (iterable.size() == 1) return iterable.get(0).getGVOXIntValue();
        int result = iterable.get(0).getGVOXIntValue();
        for (int i = 1; i < iterable.size(); i++) {
            result |= iterable.get(i).getGVOXIntValue();
        }
        return result;
    }
}
