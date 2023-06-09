package de.fabulousfox.gvox_java.enums;

public enum GvoxRegionFlag {
    /**
     * The region is uniform, meaning that all voxels have the same color.
     */
    UNIFORM(0x00000001);

    private final int value;

    private GvoxRegionFlag(int value) {
        this.value = value;
    }

    public int getGVOXIntValue() {
        return value;
    }

    public static GvoxRegionFlag getGvoxRegionFlag(int value) {
        for (GvoxRegionFlag flag : GvoxRegionFlag.values()) {
            if (flag.getGVOXIntValue() == value) {
                return flag;
            }
        }
        return null;
    }
}
