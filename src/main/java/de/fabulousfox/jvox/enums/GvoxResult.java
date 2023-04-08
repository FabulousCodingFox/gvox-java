package de.fabulousfox.jvox.enums;

public enum GvoxResult {
    SUCCESS(0),
    ERROR_UNKNOWN(-1),
    ERROR_INVALID_PARAMETER(-2),

    ERROR_INPUT_ADAPTER(-3),
    ERROR_OUTPUT_ADAPTER(-4),
    ERROR_PARSE_ADAPTER(-5),
    ERROR_SERIALIZE_ADAPTER(-6),

    ERROR_PARSE_ADAPTER_INVALID_INPUT(-7),
    ERROR_PARSE_ADAPTER_REQUESTED_CHANNEL_NOT_PRESENT(-8),
    ERROR_SERIALIZE_ADAPTER_UNREPRESENTABLE_DATA(-9);

    private final int value;

    private GvoxResult(int value) {
        this.value = value;
    }

    public int getGVOXIntValue() {
        return value;
    }

    public static GvoxResult fromInt(int value) {
        for (GvoxResult result : GvoxResult.values()) {
            if (result.getGVOXIntValue() == value) {
                return result;
            }
        }
        return null;
    }
}
