package de.fabulousfox.gvox_java.enums;

/**
 * Defines the result codes for the GVOX API.
 */
public enum GvoxResult {
    /**
     * The operation was successful.
     */
    SUCCESS(0),
    /**
     * An unknown error occurred.
     */
    ERROR_UNKNOWN(-1),
    /**
     * An invalid parameter was passed to the function.
     */
    ERROR_INVALID_PARAMETER(-2),

    /**
     * An error occurred in the input adapter.
     */
    ERROR_INPUT_ADAPTER(-3),
    /**
     * An error occurred in the output adapter.
     */
    ERROR_OUTPUT_ADAPTER(-4),
    /**
     * An error occurred in the parse adapter.
     */
    ERROR_PARSE_ADAPTER(-5),
    /**
     * An error occurred in the serialize adapter.
     */
    ERROR_SERIALIZE_ADAPTER(-6),

    /**
     * The parse adapter got an invalid input.
     */
    ERROR_PARSE_ADAPTER_INVALID_INPUT(-7),
    /**
     * The parse adapter requested a channel that is not present in the input.
     */
    ERROR_PARSE_ADAPTER_REQUESTED_CHANNEL_NOT_PRESENT(-8),
    /**
     * The serialize adapter was unable to represent the data.
     */
    ERROR_SERIALIZE_ADAPTER_UNREPRESENTABLE_DATA(-9);

    private final int value;

    GvoxResult(int value) {
        this.value = value;
    }

    /**
     * Returns the internal GVOX error code integer value.
     * @return Error code integer value.
     */
    public int getGVOXIntValue() {
        return value;
    }

    /**
     * Returns the GvoxResult enum value for the given integer value.
     * @param value The integer value to convert.
     * @return The GvoxResult enum value.
     */
    public static GvoxResult fromInt(int value) {
        for (GvoxResult result : GvoxResult.values()) {
            if (result.getGVOXIntValue() == value) {
                return result;
            }
        }
        return null;
    }
}
