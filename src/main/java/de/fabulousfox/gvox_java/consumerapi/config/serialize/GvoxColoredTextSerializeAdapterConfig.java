package de.fabulousfox.gvox_java.consumerapi.config.serialize;

import de.fabulousfox.gvox_java.consumerapi.GvoxBaseAdapterInfo;

public class GvoxColoredTextSerializeAdapterConfig implements GvoxBaseAdapterInfo {
    public enum DOWNSCALE_MODE {
        NEAREST,
        LINEAR
    }

    public int downscale_factor = 1;
    public DOWNSCALE_MODE downscale_mode = DOWNSCALE_MODE.NEAREST;
    public int non_color_max_value = -1;
    public boolean vertical = false;
}
