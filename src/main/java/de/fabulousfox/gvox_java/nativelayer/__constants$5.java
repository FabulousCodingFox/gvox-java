package de.fabulousfox.gvox_java.nativelayer;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

final class __constants$5 {

    // Suppresses default constructor, ensuring non-instantiability.
    private __constants$5() {
    }

    static final FunctionDescriptor gvox_input_read$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG_LONG$LAYOUT,
            __Constants$root.C_LONG_LONG$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_input_read$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_input_read",
            __constants$5.gvox_input_read$FUNC
    );
    static final FunctionDescriptor gvox_output_write$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG_LONG$LAYOUT,
            __Constants$root.C_LONG_LONG$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_output_write$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_output_write",
            __constants$5.gvox_output_write$FUNC
    );
    static final FunctionDescriptor gvox_output_reserve$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gvox_output_reserve$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_output_reserve",
            __constants$5.gvox_output_reserve$FUNC
    );
    static final FunctionDescriptor gvox_emit_region$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_emit_region$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_emit_region",
            __constants$5.gvox_emit_region$FUNC
    );
    static final MemorySegment NULL$ADDR = MemorySegment.ofAddress(0L);
}


