package de.fabulousfox.gvox_java.jextract;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

final class __constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private __constants$1() {
    }

    static final FunctionDescriptor gvox_destroy_context$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_destroy_context$MH = RuntimeHelper.downcallHandle(
            "gvox_destroy_context",
            __constants$1.gvox_destroy_context$FUNC
    );
    static final FunctionDescriptor gvox_get_result$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_get_result$MH = RuntimeHelper.downcallHandle(
            "gvox_get_result",
            __constants$1.gvox_get_result$FUNC
    );
    static final FunctionDescriptor gvox_get_result_message$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_get_result_message$MH = RuntimeHelper.downcallHandle(
            "gvox_get_result_message",
            __constants$1.gvox_get_result_message$FUNC
    );
    static final FunctionDescriptor gvox_pop_result$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_pop_result$MH = RuntimeHelper.downcallHandle(
            "gvox_pop_result",
            __constants$1.gvox_pop_result$FUNC
    );
    static final FunctionDescriptor gvox_register_input_adapter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_register_input_adapter$MH = RuntimeHelper.downcallHandle(
            "gvox_register_input_adapter",
            __constants$1.gvox_register_input_adapter$FUNC
    );
    static final FunctionDescriptor gvox_get_input_adapter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_get_input_adapter$MH = RuntimeHelper.downcallHandle(
            "gvox_get_input_adapter",
            __constants$1.gvox_get_input_adapter$FUNC
    );
}


