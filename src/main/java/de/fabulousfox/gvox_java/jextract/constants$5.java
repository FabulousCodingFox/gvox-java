package de.fabulousfox.gvox_java.jextract;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

final class constants$5 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$5() {
    }

    static final FunctionDescriptor gvox_input_read$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_input_read$MH = RuntimeHelper.downcallHandle(
            "gvox_input_read",
            constants$5.gvox_input_read$FUNC
    );
    static final FunctionDescriptor gvox_output_write$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_output_write$MH = RuntimeHelper.downcallHandle(
            "gvox_output_write",
            constants$5.gvox_output_write$FUNC
    );
    static final FunctionDescriptor gvox_output_reserve$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gvox_output_reserve$MH = RuntimeHelper.downcallHandle(
            "gvox_output_reserve",
            constants$5.gvox_output_reserve$FUNC
    );
    static final FunctionDescriptor gvox_emit_region$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_emit_region$MH = RuntimeHelper.downcallHandle(
            "gvox_emit_region",
            constants$5.gvox_emit_region$FUNC
    );
    static final MemorySegment NULL$ADDR = MemorySegment.ofAddress(0L);
}


