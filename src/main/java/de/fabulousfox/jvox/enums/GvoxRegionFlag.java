package de.fabulousfox.jvox.enums;

public enum GvoxRegionFlag {
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
