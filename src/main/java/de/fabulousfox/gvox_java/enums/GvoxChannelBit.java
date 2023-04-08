package de.fabulousfox.gvox_java.enums;

public enum GvoxChannelBit {
    COLOR (1 << GvoxChannelID.COLOR.getGVOXIntValue()),
    NORMAL (1 << GvoxChannelID.NORMAL.getGVOXIntValue()),
    MATERIAL_ID (1 << GvoxChannelID.MATERIAL_ID.getGVOXIntValue()),
    ROUGHNESS (1 << GvoxChannelID.ROUGHNESS.getGVOXIntValue()),
    METALNESS (1 << GvoxChannelID.METALNESS.getGVOXIntValue()),
    TRANSPARENCY (1 << GvoxChannelID.TRANSPARENCY.getGVOXIntValue()),
    IOR (1 << GvoxChannelID.IOR.getGVOXIntValue()),
    EMISSIVITY (1 << GvoxChannelID.EMISSIVITY.getGVOXIntValue()),
    HARDNESS (1 << GvoxChannelID.HARDNESS.getGVOXIntValue()),
    LAST_STANDARD (1 << GvoxChannelID.LAST_STANDARD.getGVOXIntValue()),
    LAST (1 << GvoxChannelID.LAST.getGVOXIntValue());

    private final int value;

    private GvoxChannelBit(int value) {
        this.value = value;
    }

    public int getGVOXIntValue() {
        return value;
    }

    public static GvoxChannelBit fromInt(int value) {
        for (GvoxChannelBit channel : GvoxChannelBit.values()) {
            if (channel.getGVOXIntValue() == value) {
                return channel;
            }
        }
        return null;
    }
}
