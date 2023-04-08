package de.fabulousfox.gvox_java.nativelayer;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;

final class __constants$4 {

    // Suppresses default constructor, ensuring non-instantiability.
    private __constants$4() {
    }

    static final FunctionDescriptor gvox_load_region_range$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                            MemoryLayout.structLayout(
                                    __Constants$root.C_LONG$LAYOUT.withName("x"),
                                    __Constants$root.C_LONG$LAYOUT.withName("y"),
                                    __Constants$root.C_LONG$LAYOUT.withName("z")
                            ).withName("offset"),
                            MemoryLayout.structLayout(
                                    __Constants$root.C_LONG$LAYOUT.withName("x"),
                                    __Constants$root.C_LONG$LAYOUT.withName("y"),
                                    __Constants$root.C_LONG$LAYOUT.withName("z")
                            ).withName("extent")
                    ).withName("range"),
                    __Constants$root.C_LONG$LAYOUT.withName("channels"),
                    __Constants$root.C_LONG$LAYOUT.withName("flags"),
                    __Constants$root.C_POINTER$LAYOUT.withName("data")
            ),
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gvox_load_region_range$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_load_region_range",
            __constants$4.gvox_load_region_range$FUNC
    );
    static final FunctionDescriptor gvox_unload_region_range$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_unload_region_range$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_unload_region_range",
            __constants$4.gvox_unload_region_range$FUNC
    );
    static final FunctionDescriptor gvox_sample_region$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    __Constants$root.C_LONG$LAYOUT.withName("data"),
                    __Constants$root.C_CHAR$LAYOUT.withName("is_present"),
                    MemoryLayout.paddingLayout(24)
            ),
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gvox_sample_region$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_sample_region",
            __constants$4.gvox_sample_region$FUNC
    );
    static final FunctionDescriptor gvox_adapter_push_error$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_adapter_push_error$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_adapter_push_error",
            __constants$4.gvox_adapter_push_error$FUNC
    );
    static final FunctionDescriptor gvox_adapter_set_user_pointer$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_adapter_set_user_pointer$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_adapter_set_user_pointer",
            __constants$4.gvox_adapter_set_user_pointer$FUNC
    );
    static final FunctionDescriptor gvox_adapter_get_user_pointer$FUNC = FunctionDescriptor.of(__Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_adapter_get_user_pointer$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_adapter_get_user_pointer",
            __constants$4.gvox_adapter_get_user_pointer$FUNC
    );
}


