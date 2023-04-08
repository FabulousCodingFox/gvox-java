package de.fabulousfox.jvox.jextract;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

final class __constants$3 {

    // Suppresses default constructor, ensuring non-instantiability.
    private __constants$3() {
    }

    static final FunctionDescriptor gvox_create_adapter_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_create_adapter_context$MH = RuntimeHelper.downcallHandle(
            "gvox_create_adapter_context",
            __constants$3.gvox_create_adapter_context$FUNC
    );
    static final FunctionDescriptor gvox_destroy_adapter_context$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_destroy_adapter_context$MH = RuntimeHelper.downcallHandle(
            "gvox_destroy_adapter_context",
            __constants$3.gvox_destroy_adapter_context$FUNC
    );
    static final FunctionDescriptor gvox_blit_region$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gvox_blit_region$MH = RuntimeHelper.downcallHandle(
            "gvox_blit_region",
            __constants$3.gvox_blit_region$FUNC
    );
    static final FunctionDescriptor gvox_blit_region_parse_driven$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gvox_blit_region_parse_driven$MH = RuntimeHelper.downcallHandle(
            "gvox_blit_region_parse_driven",
            __constants$3.gvox_blit_region_parse_driven$FUNC
    );
    static final FunctionDescriptor gvox_blit_region_serialize_driven$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gvox_blit_region_serialize_driven$MH = RuntimeHelper.downcallHandle(
            "gvox_blit_region_serialize_driven",
            __constants$3.gvox_blit_region_serialize_driven$FUNC
    );
    static final FunctionDescriptor gvox_query_region_flags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gvox_query_region_flags$MH = RuntimeHelper.downcallHandle(
            "gvox_query_region_flags",
            __constants$3.gvox_query_region_flags$FUNC
    );
}


