package de.fabulousfox.gvox_java.nativelayer;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.OfLong;

final class __constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private __constants$0() {
    }

    static final FunctionDescriptor __va_start$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __va_start$MH = __GvoxNativeRuntimeHelper.downcallHandleVariadic(
            "__va_start",
            __constants$0.__va_start$FUNC
    );
    static final FunctionDescriptor __security_init_cookie$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle __security_init_cookie$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "__security_init_cookie",
            __constants$0.__security_init_cookie$FUNC
    );
    static final FunctionDescriptor __security_check_cookie$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __security_check_cookie$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "__security_check_cookie",
            __constants$0.__security_check_cookie$FUNC
    );
    static final FunctionDescriptor __report_gsfailure$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __report_gsfailure$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "__report_gsfailure",
            __constants$0.__report_gsfailure$FUNC
    );
    static final OfLong __security_cookie$LAYOUT = __Constants$root.C_LONG_LONG$LAYOUT;
    static final VarHandle __security_cookie$VH = __constants$0.__security_cookie$LAYOUT.varHandle();
    static final MemorySegment __security_cookie$SEGMENT = __GvoxNativeRuntimeHelper.lookupGlobalVariable("__security_cookie", __constants$0.__security_cookie$LAYOUT);
    static final FunctionDescriptor gvox_create_context$FUNC = FunctionDescriptor.of(__Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gvox_create_context$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            "gvox_create_context",
            __constants$0.gvox_create_context$FUNC
    );
}


