package de.fabulousfox.gvox_java.enums;

public enum GvoxChannelID {
    COLOR(0),
    NORMAL(1),
    MATERIAL_ID(2),
    ROUGHNESS(3),
    METALNESS(4),
    TRANSPARENCY(5),
    IOR(6),
    EMISSIVITY(7),
    HARDNESS(8),
    LAST_STANDARD(23),
    LAST(31);

    private final int value;

    private GvoxChannelID(int value) {
        this.value = value;
    }

    public int getGVOXIntValue() {
        return value;
    }

    public static GvoxChannelID fromInt(int value) {
        for (GvoxChannelID channel : GvoxChannelID.values()) {
            if (channel.getGVOXIntValue() == value) {
                return channel;
            }
        }
        return null;
    }
}
