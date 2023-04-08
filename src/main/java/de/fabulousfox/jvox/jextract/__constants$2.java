package de.fabulousfox.jvox.jextract;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

final class __constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private __constants$2() {
    }

    static final FunctionDescriptor gvox_register_output_adapter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_register_output_adapter$MH = RuntimeHelper.downcallHandle(
            "gvox_register_output_adapter",
            __constants$2.gvox_register_output_adapter$FUNC
    );
    static final FunctionDescriptor gvox_get_output_adapter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_get_output_adapter$MH = RuntimeHelper.downcallHandle(
            "gvox_get_output_adapter",
            __constants$2.gvox_get_output_adapter$FUNC
    );
    static final FunctionDescriptor gvox_register_parse_adapter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_register_parse_adapter$MH = RuntimeHelper.downcallHandle(
            "gvox_register_parse_adapter",
            __constants$2.gvox_register_parse_adapter$FUNC
    );
    static final FunctionDescriptor gvox_get_parse_adapter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_get_parse_adapter$MH = RuntimeHelper.downcallHandle(
            "gvox_get_parse_adapter",
            __constants$2.gvox_get_parse_adapter$FUNC
    );
    static final FunctionDescriptor gvox_register_serialize_adapter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_register_serialize_adapter$MH = RuntimeHelper.downcallHandle(
            "gvox_register_serialize_adapter",
            __constants$2.gvox_register_serialize_adapter$FUNC
    );
    static final FunctionDescriptor gvox_get_serialize_adapter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_get_serialize_adapter$MH = RuntimeHelper.downcallHandle(
            "gvox_get_serialize_adapter",
            __constants$2.gvox_get_serialize_adapter$FUNC
    );
}


