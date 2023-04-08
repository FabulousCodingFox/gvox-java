package de.fabulousfox.jvox;

import de.fabulousfox.jvox.consumerapi.GvoxAdapterContext;
import de.fabulousfox.jvox.consumerapi.GvoxContext;
import de.fabulousfox.jvox.consumerapi.config.input.GvoxFileInputAdapterConfig;
import de.fabulousfox.jvox.consumerapi.config.serialize.GvoxColoredTextSerializeAdapterConfig;
import de.fabulousfox.jvox.enums.GvoxChannelBit;
import de.fabulousfox.jvox.structs.GvoxExtent3D;
import de.fabulousfox.jvox.structs.GvoxOffset3D;
import de.fabulousfox.jvox.structs.GvoxRegionRange;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gvox.createCapabilities();

        System.out.println("Creating Gvox context");
        GvoxContext gvox_ctx = Gvox.create_context();

        GvoxFileInputAdapterConfig i_config = new GvoxFileInputAdapterConfig(){{
            filepath = "C:/Users/fabif/IdeaProjects/VoxelTracing/src/main/resources/models/menger.vox";
            byteOffset = 0;
        }};

        GvoxColoredTextSerializeAdapterConfig s_config = new GvoxColoredTextSerializeAdapterConfig(){{
            non_color_max_value = 255;
        }};

        System.out.println("Creating Gvox adapter contexts");
        GvoxAdapterContext input_ctx = Gvox.create_adapter_context(gvox_ctx, Gvox.get_input_adapter(gvox_ctx, "file"), i_config);
        GvoxAdapterContext output_ctx = Gvox.create_adapter_context(gvox_ctx, Gvox.get_output_adapter(gvox_ctx, "stdout"), null);
        GvoxAdapterContext parse_ctx = Gvox.create_adapter_context(gvox_ctx, Gvox.get_parse_adapter(gvox_ctx, "magicavoxel"), null);
        GvoxAdapterContext serialize_ctx = Gvox.create_adapter_context(gvox_ctx, Gvox.get_serialize_adapter(gvox_ctx, "colored_text"), s_config);

        GvoxRegionRange range = new GvoxRegionRange(
                new GvoxOffset3D(0, 0, 0),
                new GvoxExtent3D(8, 8, 8)
        );

        System.out.println("Blitting region");
        Gvox.blit_region(input_ctx, output_ctx, parse_ctx, serialize_ctx, range, List.of(
                GvoxChannelBit.COLOR,
                GvoxChannelBit.MATERIAL_ID,
                GvoxChannelBit.ROUGHNESS,
                GvoxChannelBit.TRANSPARENCY,
                GvoxChannelBit.EMISSIVITY
        ));

        System.out.println("Cleaning up");
        Gvox.destroy_adapter_context(input_ctx);
        Gvox.destroy_adapter_context(output_ctx);
        Gvox.destroy_adapter_context(parse_ctx);
        Gvox.destroy_adapter_context(serialize_ctx);

        Gvox.destroy_context(gvox_ctx);

        Gvox.close();
    }
}
