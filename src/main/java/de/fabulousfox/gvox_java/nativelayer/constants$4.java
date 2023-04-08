package de.fabulousfox.gvox_java.nativelayer;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;

final class constants$4 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4() {
    }

    static final FunctionDescriptor gvox_load_region_range$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                            MemoryLayout.structLayout(
                                    Constants$root.C_LONG$LAYOUT.withName("x"),
                                    Constants$root.C_LONG$LAYOUT.withName("y"),
                                    Constants$root.C_LONG$LAYOUT.withName("z")
                            ).withName("offset"),
                            MemoryLayout.structLayout(
                                    Constants$root.C_LONG$LAYOUT.withName("x"),
                                    Constants$root.C_LONG$LAYOUT.withName("y"),
                                    Constants$root.C_LONG$LAYOUT.withName("z")
                            ).withName("extent")
                    ).withName("range"),
                    Constants$root.C_LONG$LAYOUT.withName("channels"),
                    Constants$root.C_LONG$LAYOUT.withName("flags"),
                    Constants$root.C_POINTER$LAYOUT.withName("data")
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gvox_load_region_range$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_load_region_range",
            constants$4.gvox_load_region_range$FUNC
    );
    static final FunctionDescriptor gvox_unload_region_range$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_unload_region_range$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_unload_region_range",
            constants$4.gvox_unload_region_range$FUNC
    );
    static final FunctionDescriptor gvox_sample_region$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("data"),
                    Constants$root.C_CHAR$LAYOUT.withName("is_present"),
                    MemoryLayout.paddingLayout(24)
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gvox_sample_region$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_sample_region",
            constants$4.gvox_sample_region$FUNC
    );
    static final FunctionDescriptor gvox_adapter_push_error$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_adapter_push_error$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_adapter_push_error",
            constants$4.gvox_adapter_push_error$FUNC
    );
    static final FunctionDescriptor gvox_adapter_set_user_pointer$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_adapter_set_user_pointer$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_adapter_set_user_pointer",
            constants$4.gvox_adapter_set_user_pointer$FUNC
    );
    static final FunctionDescriptor gvox_adapter_get_user_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gvox_adapter_get_user_pointer$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_adapter_get_user_pointer",
            constants$4.gvox_adapter_get_user_pointer$FUNC
    );
}


