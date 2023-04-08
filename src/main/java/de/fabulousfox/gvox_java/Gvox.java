package de.fabulousfox.gvox_java;

import de.fabulousfox.gvox_java.consumerapi.GvoxAdapter;
import de.fabulousfox.gvox_java.consumerapi.GvoxAdapterContext;
import de.fabulousfox.gvox_java.consumerapi.GvoxBaseAdapterInfo;
import de.fabulousfox.gvox_java.consumerapi.GvoxContext;
import de.fabulousfox.gvox_java.consumerapi.config.input.GvoxByteBufferInputAdapterConfig;
import de.fabulousfox.gvox_java.consumerapi.config.input.GvoxFileInputAdapterConfig;
import de.fabulousfox.gvox_java.consumerapi.config.output.GvoxFileOutputAdapterConfig;
import de.fabulousfox.gvox_java.consumerapi.config.parse.GvoxVoxlapParseAdapterConfig;
import de.fabulousfox.gvox_java.consumerapi.config.serialize.GvoxColoredTextSerializeAdapterConfig;
import de.fabulousfox.gvox_java.enums.GvoxChannelBit;
import de.fabulousfox.gvox_java.enums.GvoxResult;
import de.fabulousfox.gvox_java.errors.GvoxAdapterContextNullException;
import de.fabulousfox.gvox_java.errors.GvoxAdapterNullException;
import de.fabulousfox.gvox_java.errors.GvoxContextNullException;
import de.fabulousfox.gvox_java.jextract.RuntimeHelper;
import de.fabulousfox.gvox_java.jextract.gvox_h;
import de.fabulousfox.gvox_java.structs.GvoxRegionRange;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.util.HashMap;
import java.util.List;

import static java.lang.foreign.ValueLayout.*;

public class Gvox {
    private Gvox() {
    }

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
        initialized = true;
    }

    public static void close() {
        if (!initialized) return;
        for (MemorySegment mem : contexts.values()) {
            gvox_h.gvox_destroy_context(mem);
        }
        RuntimeHelper.arena.close();
        initialized = false;
    }

    public static GvoxContext create_context() {
        checkInit();
        MemorySegment mem = gvox_h.gvox_create_context();
        GvoxContext ctx = new GvoxContext();
        contexts.put(ctx, mem);
        return ctx;
    }

    public static void destroy_context(GvoxContext context) {
        checkInit();
        MemorySegment mem = contexts.getOrDefault(context, null);
        if (mem == null) throw new GvoxContextNullException();
        gvox_h.gvox_destroy_context(mem);
        contexts.remove(context);
    }

    public static GvoxResult get_result(GvoxContext ctx) {
        checkInit();
        MemorySegment mem = contexts.getOrDefault(ctx, null);
        if (mem == null) throw new GvoxContextNullException();
        return GvoxResult.fromInt(gvox_h.gvox_get_result(mem));
    }

    ;

    public static String get_result_message(GvoxContext ctx) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(ctx, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment str_size = RuntimeHelper.arena.allocate(ValueLayout.OfLong.JAVA_LONG);
        gvox_h.gvox_get_result_message(contextMem, null, str_size);
        long size = str_size.get(ValueLayout.OfLong.JAVA_LONG, 0);
        MemorySegment str_buffer = RuntimeHelper.arena.allocateArray(ValueLayout.OfByte.JAVA_CHAR, size);
        gvox_h.gvox_get_result_message(contextMem, str_buffer, str_size);
        return str_buffer.getUtf8String(0);
    }

    ;

    public static void pop_result(GvoxContext ctx) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(ctx, null);
        if (contextMem == null) throw new GvoxContextNullException();
        gvox_h.gvox_pop_result(contextMem);
    }

    ;

    public static GvoxAdapter get_input_adapter(GvoxContext context, String name) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(context, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment mem = gvox_h.gvox_get_input_adapter(contextMem, RuntimeHelper.arena.allocateUtf8String(name));
        GvoxAdapter adapter = new GvoxAdapter();
        adapters.put(adapter, mem);
        return adapter;
    }

    public static GvoxAdapter get_output_adapter(GvoxContext context, String name) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(context, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment mem = gvox_h.gvox_get_output_adapter(contextMem, RuntimeHelper.arena.allocateUtf8String(name));
        GvoxAdapter adapter = new GvoxAdapter();
        adapters.put(adapter, mem);
        return adapter;
    }

    public static GvoxAdapter get_parse_adapter(GvoxContext context, String name) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(context, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment mem = gvox_h.gvox_get_parse_adapter(contextMem, RuntimeHelper.arena.allocateUtf8String(name));
        GvoxAdapter adapter = new GvoxAdapter();
        adapters.put(adapter, mem);
        return adapter;
    }

    public static GvoxAdapter get_serialize_adapter(GvoxContext context, String name) {
        checkInit();
        MemorySegment contextMem = contexts.getOrDefault(context, null);
        if (contextMem == null) throw new GvoxContextNullException();

        MemorySegment mem = gvox_h.gvox_get_serialize_adapter(contextMem, RuntimeHelper.arena.allocateUtf8String(name));
        GvoxAdapter adapter = new GvoxAdapter();
        adapters.put(adapter, mem);
        return adapter;
    }

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
                configMem = RuntimeHelper.arena.allocate(layout);
                configMem.set(ADDRESS, 0, MemorySegment.ofAddress(config1.buffer.address()));
                configMem.set(JAVA_LONG, 8, config1.buffer.byteSize());
            }
            if (config instanceof GvoxFileInputAdapterConfig config1) {
                StructLayout layout = MemoryLayout.structLayout(
                        ADDRESS.withBitAlignment(64).asUnbounded().withName("filepath"),
                        JAVA_LONG.withName("byte_offset")
                );
                configMem = RuntimeHelper.arena.allocate(layout);
                configMem.set(ADDRESS, 0, MemorySegment.ofAddress(RuntimeHelper.arena.allocateUtf8String(config1.filepath).address()));
                configMem.set(JAVA_LONG, 8, config1.byteOffset);
            }
            if (config instanceof GvoxFileOutputAdapterConfig config1) {
                StructLayout layout = MemoryLayout.structLayout(
                        ADDRESS.withBitAlignment(64).asUnbounded().withName("filepath")
                );
                configMem = RuntimeHelper.arena.allocate(layout);
                configMem.set(ADDRESS, 0, MemorySegment.ofAddress(RuntimeHelper.arena.allocateUtf8String(config1.filepath).address()));
            }
            if (config instanceof GvoxVoxlapParseAdapterConfig config1) {
                StructLayout layout = MemoryLayout.structLayout(
                        JAVA_LONG.withName("size_x"),
                        JAVA_LONG.withName("size_y"),
                        JAVA_LONG.withName("size_z"),
                        JAVA_LONG.withName("make_solid"),
                        JAVA_LONG.withName("is_ace_of_spades")
                );
                configMem = RuntimeHelper.arena.allocate(layout);
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
                configMem = RuntimeHelper.arena.allocate(layout);
                configMem.set(JAVA_LONG, 0, config1.downscale_factor);
                configMem.set(JAVA_LONG, 8, config1.downscale_mode.ordinal());
                configMem.set(JAVA_LONG, 16, config1.non_color_max_value == -1 ? 255 : config1.non_color_max_value);
                configMem.set(JAVA_INT, 24, config1.vertical ? 1 : 0);
            }
        }

        if (configMem == null)
            configMem = /*nullptr*/ RuntimeHelper.arena.allocate(ADDRESS, MemorySegment.ofAddress(MemorySegment.NULL.address()));

        MemorySegment mem = gvox_h.gvox_create_adapter_context(contextMem, adapterMem, configMem);
        GvoxAdapterContext ctx = new GvoxAdapterContext();
        adapterContexts.put(ctx, mem);
        return ctx;
    }

    public static void destroy_adapter_context(GvoxAdapterContext adapterContext) {
        checkInit();
        MemorySegment adapterContextMem = adapterContexts.getOrDefault(adapterContext, null);
        if (adapterContextMem == null) throw new GvoxAdapterContextNullException();
        gvox_h.gvox_destroy_adapter_context(adapterContextMem);
    }

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

        gvox_h.gvox_blit_region(inputContextMem, outputContextMem, parseContextMem, serializeContextMem, regionRange, targetChannels);
    }

    /*public static void blit_region_parse_driven(
            GvoxAdapterContext inputContext,
            GvoxAdapterContext outputContext,
            GvoxAdapterContext parseContext,
            GvoxAdapterContext serializeContext,
            GvoxRegionRange range,
            List<GvoxChannelBit> channels
    ){
        gvox_h.gvox_blit_region_parse_driven(
                adapterContexts.get(inputContext),
                adapterContexts.get(outputContext),
                adapterContexts.get(parseContext),
                adapterContexts.get(serializeContext),
                fromGvoxRegionRange(range),
                fromGvoxChannelBit(channels));
    }

    public static void blit_region_serialize_driven(
            GvoxAdapterContext inputContext,
            GvoxAdapterContext outputContext,
            GvoxAdapterContext parseContext,
            GvoxAdapterContext serializeContext,
            GvoxRegionRange range,
            List<GvoxChannelBit> channels
    ){
        gvox_h.gvox_blit_region_serialize_driven(
                adapterContexts.get(inputContext),
                adapterContexts.get(outputContext),
                adapterContexts.get(parseContext),
                adapterContexts.get(serializeContext),
                fromGvoxRegionRange(range),
                fromGvoxChannelBit(channels));
    }*/

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
        MemorySegment mem = RuntimeHelper.arena.allocate(layout);
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
