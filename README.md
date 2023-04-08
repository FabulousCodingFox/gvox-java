# gvox-java
[![GitHub license](https://img.shields.io/github/license/FabulousCodingFox/gvox-java.svg)](https://github.com/FabulousCodingFox/gvox-java/blob/master/LICENSE)
[![GitHub release](https://img.shields.io/github/release/FabulousCodingFox/gvox-java.svg)](https://GitHub.com/FabulousCodingFox/gvox-java/releases/)
[![GitHub stars](https://img.shields.io/github/stars/FabulousCodingFox/gvox-java.svg)](https://GitHub.com/FabulousCodingFox/gvox-java/stargazers/)
<br>
Java bindings for the GVOX voxel data library (https://github.com/GabeRundlett/gvox)

# IMPORTANT!
This project is not finished. The adapter api is not implemented yet, as well as several features of the consumer api

## Installation (Maven)
1. [Authenticate GitHub Packages](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages)
2. [Add this to your pom.xml](https://github.com/FabulousCodingFox/gvox-java/packages/1833313)

## Usage
Check the [gvox wiki](https://github.com/GabeRundlett/gvox/wiki) for more detailed instructions. Here i only provide the java equivalent of the demo snippet
```java
GvoxContext gvox_ctx = GVOX.create_context();

GvoxFileInputAdapterConfig i_config = new GvoxFileInputAdapterConfig() {{
    filepath = "C:/Users/fabif/IdeaProjects/VoxelTracing/src/main/resources/models/menger.vox";
    byteOffset = 0;
}};

GvoxColoredTextSerializeAdapterConfig s_config = new GvoxColoredTextSerializeAdapterConfig() {{
    non_color_max_value = 255;
}};

System.out.println("Creating GVOX adapter contexts");
GvoxAdapterContext input_ctx = GVOX.create_adapter_context(gvox_ctx, Gvox.get_input_adapter(gvox_ctx, "file"), i_config);
GvoxAdapterContext output_ctx = GVOX.create_adapter_context(gvox_ctx, Gvox.get_output_adapter(gvox_ctx, "stdout"), null);
GvoxAdapterContext parse_ctx = GVOX.create_adapter_context(gvox_ctx, Gvox.get_parse_adapter(gvox_ctx, "magicavoxel"), null);
GvoxAdapterContext serialize_ctx = GVOX.create_adapter_context(gvox_ctx, Gvox.get_serialize_adapter(gvox_ctx, "colored_text"), s_config);

GvoxRegionRange range = new GvoxRegionRange(
        new GvoxOffset3D(0, 0, 0),
        new GvoxExtent3D(8, 8, 8)
);

System.out.println("Blitting region");
GVOX.blit_region(input_ctx, output_ctx, parse_ctx, serialize_ctx, range, List.of(
        GvoxChannelBit.COLOR,
        GvoxChannelBit.MATERIAL_ID,
        GvoxChannelBit.ROUGHNESS,
        GvoxChannelBit.TRANSPARENCY,
        GvoxChannelBit.EMISSIVITY
));

System.out.println("Cleaning up");
GVOX.destroy_adapter_context(input_ctx);
GVOX.destroy_adapter_context(output_ctx);
GVOX.destroy_adapter_context(parse_ctx);
GVOX.destroy_adapter_context(serialize_ctx);

GVOX.destroy_context(gvox_ctx);

GVOX.close();
```
