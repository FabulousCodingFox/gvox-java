package de.fabulousfox.gvox_java.nativelayer;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;

public class __GvoxNativeIncludeInterface {

    public static final OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static final OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static final OfInt C_INT = Constants$root.C_LONG$LAYOUT;
    public static final OfInt C_LONG = Constants$root.C_LONG$LAYOUT;
    public static final OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static final OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static final OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;

    /**
     * {@snippet :
     * #define _VCRT_COMPILER_PREPROCESSOR 1
     *}
     */
    public static int _VCRT_COMPILER_PREPROCESSOR() {
        return (int) 1L;
    }

    /**
     * {@snippet :
     * #define _SAL_VERSION 20
     *}
     */
    public static int _SAL_VERSION() {
        return (int) 20L;
    }

    /**
     * {@snippet :
     * #define __SAL_H_VERSION 180000000
     *}
     */
    public static int __SAL_H_VERSION() {
        return (int) 180000000L;
    }

    /**
     * {@snippet :
     * #define _USE_DECLSPECS_FOR_SAL 0
     *}
     */
    public static int _USE_DECLSPECS_FOR_SAL() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * #define _USE_ATTRIBUTES_FOR_SAL 0
     *}
     */
    public static int _USE_ATTRIBUTES_FOR_SAL() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * #define _CRT_PACKING 8
     *}
     */
    public static int _CRT_PACKING() {
        return (int) 8L;
    }

    /**
     * {@snippet :
     * #define _HAS_EXCEPTIONS 1
     *}
     */
    public static int _HAS_EXCEPTIONS() {
        return (int) 1L;
    }

    /**
     * {@snippet :
     * #define _HAS_CXX17 0
     *}
     */
    public static int _HAS_CXX17() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * #define _HAS_CXX20 0
     *}
     */
    public static int _HAS_CXX20() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * #define _HAS_NODISCARD 0
     *}
     */
    public static int _HAS_NODISCARD() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * #define WCHAR_MIN 0
     *}
     */
    public static int WCHAR_MIN() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * #define WCHAR_MAX 65535
     *}
     */
    public static int WCHAR_MAX() {
        return (int) 65535L;
    }

    /**
     * {@snippet :
     * #define WINT_MIN 0
     *}
     */
    public static int WINT_MIN() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * #define WINT_MAX 65535
     *}
     */
    public static int WINT_MAX() {
        return (int) 65535L;
    }

    /**
     * {@snippet :
     * #define GVOX_VERSION_MAJOR 1
     *}
     */
    public static int GVOX_VERSION_MAJOR() {
        return (int) 1L;
    }

    /**
     * {@snippet :
     * #define GVOX_VERSION_MINOR 2
     *}
     */
    public static int GVOX_VERSION_MINOR() {
        return (int) 2L;
    }

    /**
     * {@snippet :
     * #define GVOX_VERSION_PATCH 3
     *}
     */
    public static int GVOX_VERSION_PATCH() {
        return (int) 3L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_COLOR 0
     *}
     */
    public static int GVOX_CHANNEL_ID_COLOR() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_NORMAL 1
     *}
     */
    public static int GVOX_CHANNEL_ID_NORMAL() {
        return (int) 1L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_MATERIAL_ID 2
     *}
     */
    public static int GVOX_CHANNEL_ID_MATERIAL_ID() {
        return (int) 2L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_ROUGHNESS 3
     *}
     */
    public static int GVOX_CHANNEL_ID_ROUGHNESS() {
        return (int) 3L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_METALNESS 4
     *}
     */
    public static int GVOX_CHANNEL_ID_METALNESS() {
        return (int) 4L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_TRANSPARENCY 5
     *}
     */
    public static int GVOX_CHANNEL_ID_TRANSPARENCY() {
        return (int) 5L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_IOR 6
     *}
     */
    public static int GVOX_CHANNEL_ID_IOR() {
        return (int) 6L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_EMISSIVITY 7
     *}
     */
    public static int GVOX_CHANNEL_ID_EMISSIVITY() {
        return (int) 7L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_HARDNESS 8
     *}
     */
    public static int GVOX_CHANNEL_ID_HARDNESS() {
        return (int) 8L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_LAST_STANDARD 23
     *}
     */
    public static int GVOX_CHANNEL_ID_LAST_STANDARD() {
        return (int) 23L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_ID_LAST 31
     *}
     */
    public static int GVOX_CHANNEL_ID_LAST() {
        return (int) 31L;
    }

    /**
     * {@snippet :
     * #define GVOX_REGION_FLAG_UNIFORM 1
     *}
     */
    public static int GVOX_REGION_FLAG_UNIFORM() {
        return (int) 1L;
    }

    /**
     * {@snippet :
     * typedef long long ptrdiff_t;
     *}
     */
    public static final OfLong ptrdiff_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned long long size_t;
     *}
     */
    public static final OfLong size_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned short wchar_t;
     *}
     */
    public static final OfShort wchar_t = Constants$root.C_SHORT$LAYOUT;
    /**
     * {@snippet :
     * typedef double max_align_t;
     *}
     */
    public static final OfDouble max_align_t = Constants$root.C_DOUBLE$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned long long uintptr_t;
     *}
     */
    public static final OfLong uintptr_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef char* va_list;
     *}
     */
    public static final OfAddress va_list = Constants$root.C_POINTER$LAYOUT;

    public static MethodHandle __va_start$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$0.__va_start$MH, "__va_start");
    }

    /**
     * {@snippet :
     * void __va_start(va_list*,...);
     *}
     */
    public static void __va_start(MemorySegment x0, Object... x1) {
        var mh$ = __va_start$MH();
        try {
            mh$.invokeExact(x0, x1);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * {@snippet :
     * typedef long long intptr_t;
     *}
     */
    public static final OfLong intptr_t = Constants$root.C_LONG_LONG$LAYOUT;

    public static MethodHandle __security_init_cookie$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$0.__security_init_cookie$MH, "__security_init_cookie");
    }

    /**
     * {@snippet :
     * void __security_init_cookie();
     *}
     */
    public static void __security_init_cookie() {
        var mh$ = __security_init_cookie$MH();
        try {
            mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle __security_check_cookie$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$0.__security_check_cookie$MH, "__security_check_cookie");
    }

    /**
     * {@snippet :
     * void __security_check_cookie(uintptr_t _StackCookie);
     *}
     */
    public static void __security_check_cookie(long _StackCookie) {
        var mh$ = __security_check_cookie$MH();
        try {
            mh$.invokeExact(_StackCookie);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle __report_gsfailure$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$0.__report_gsfailure$MH, "__report_gsfailure");
    }

    /**
     * {@snippet :
     * void __report_gsfailure(uintptr_t _StackCookie);
     *}
     */
    public static void __report_gsfailure(long _StackCookie) {
        var mh$ = __report_gsfailure$MH();
        try {
            mh$.invokeExact(_StackCookie);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MemoryLayout __security_cookie$LAYOUT() {
        return __constants$0.__security_cookie$LAYOUT;
    }

    public static VarHandle __security_cookie$VH() {
        return __constants$0.__security_cookie$VH;
    }

    public static MemorySegment __security_cookie$SEGMENT() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$0.__security_cookie$SEGMENT, "__security_cookie");
    }

    /**
     * Getter for variable:
     * {@snippet :
     * uintptr_t __security_cookie;
     *}
     */
    public static long __security_cookie$get() {
        return (long) __constants$0.__security_cookie$VH.get(__GvoxNativeRuntimeHelper.requireNonNull(__constants$0.__security_cookie$SEGMENT, "__security_cookie"));
    }

    /**
     * Setter for variable:
     * {@snippet :
     * uintptr_t __security_cookie;
     *}
     */
    public static void __security_cookie$set(long x) {
        __constants$0.__security_cookie$VH.set(__GvoxNativeRuntimeHelper.requireNonNull(__constants$0.__security_cookie$SEGMENT, "__security_cookie"), x);
    }

    /**
     * {@snippet :
     * typedef signed char int8_t;
     *}
     */
    public static final OfByte int8_t = Constants$root.C_CHAR$LAYOUT;
    /**
     * {@snippet :
     * typedef short int16_t;
     *}
     */
    public static final OfShort int16_t = Constants$root.C_SHORT$LAYOUT;
    /**
     * {@snippet :
     * typedef int int32_t;
     *}
     */
    public static final OfInt int32_t = Constants$root.C_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef long long int64_t;
     *}
     */
    public static final OfLong int64_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned char uint8_t;
     *}
     */
    public static final OfByte uint8_t = Constants$root.C_CHAR$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned short uint16_t;
     *}
     */
    public static final OfShort uint16_t = Constants$root.C_SHORT$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned int uint32_t;
     *}
     */
    public static final OfInt uint32_t = Constants$root.C_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned long long uint64_t;
     *}
     */
    public static final OfLong uint64_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef signed char int_least8_t;
     *}
     */
    public static final OfByte int_least8_t = Constants$root.C_CHAR$LAYOUT;
    /**
     * {@snippet :
     * typedef short int_least16_t;
     *}
     */
    public static final OfShort int_least16_t = Constants$root.C_SHORT$LAYOUT;
    /**
     * {@snippet :
     * typedef int int_least32_t;
     *}
     */
    public static final OfInt int_least32_t = Constants$root.C_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef long long int_least64_t;
     *}
     */
    public static final OfLong int_least64_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned char uint_least8_t;
     *}
     */
    public static final OfByte uint_least8_t = Constants$root.C_CHAR$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned short uint_least16_t;
     *}
     */
    public static final OfShort uint_least16_t = Constants$root.C_SHORT$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned int uint_least32_t;
     *}
     */
    public static final OfInt uint_least32_t = Constants$root.C_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned long long uint_least64_t;
     *}
     */
    public static final OfLong uint_least64_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef signed char int_fast8_t;
     *}
     */
    public static final OfByte int_fast8_t = Constants$root.C_CHAR$LAYOUT;
    /**
     * {@snippet :
     * typedef int int_fast16_t;
     *}
     */
    public static final OfInt int_fast16_t = Constants$root.C_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef int int_fast32_t;
     *}
     */
    public static final OfInt int_fast32_t = Constants$root.C_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef long long int_fast64_t;
     *}
     */
    public static final OfLong int_fast64_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned char uint_fast8_t;
     *}
     */
    public static final OfByte uint_fast8_t = Constants$root.C_CHAR$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned int uint_fast16_t;
     *}
     */
    public static final OfInt uint_fast16_t = Constants$root.C_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned int uint_fast32_t;
     *}
     */
    public static final OfInt uint_fast32_t = Constants$root.C_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned long long uint_fast64_t;
     *}
     */
    public static final OfLong uint_fast64_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef long long intmax_t;
     *}
     */
    public static final OfLong intmax_t = Constants$root.C_LONG_LONG$LAYOUT;
    /**
     * {@snippet :
     * typedef unsigned long long uintmax_t;
     *}
     */
    public static final OfLong uintmax_t = Constants$root.C_LONG_LONG$LAYOUT;

    /**
     * {@snippet :
     * enum .GVOX_RESULT_SUCCESS = 0;
     *}
     */
    public static int GVOX_RESULT_SUCCESS() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * enum .GVOX_RESULT_ERROR_UNKNOWN = -1;
     *}
     */
    public static int GVOX_RESULT_ERROR_UNKNOWN() {
        return (int) -1L;
    }

    /**
     * {@snippet :
     * enum .GVOX_RESULT_ERROR_INVALID_PARAMETER = -2;
     *}
     */
    public static int GVOX_RESULT_ERROR_INVALID_PARAMETER() {
        return (int) -2L;
    }

    /**
     * {@snippet :
     * enum .GVOX_RESULT_ERROR_INPUT_ADAPTER = -3;
     *}
     */
    public static int GVOX_RESULT_ERROR_INPUT_ADAPTER() {
        return (int) -3L;
    }

    /**
     * {@snippet :
     * enum .GVOX_RESULT_ERROR_OUTPUT_ADAPTER = -4;
     *}
     */
    public static int GVOX_RESULT_ERROR_OUTPUT_ADAPTER() {
        return (int) -4L;
    }

    /**
     * {@snippet :
     * enum .GVOX_RESULT_ERROR_PARSE_ADAPTER = -5;
     *}
     */
    public static int GVOX_RESULT_ERROR_PARSE_ADAPTER() {
        return (int) -5L;
    }

    /**
     * {@snippet :
     * enum .GVOX_RESULT_ERROR_SERIALIZE_ADAPTER = -6;
     *}
     */
    public static int GVOX_RESULT_ERROR_SERIALIZE_ADAPTER() {
        return (int) -6L;
    }

    /**
     * {@snippet :
     * enum .GVOX_RESULT_ERROR_PARSE_ADAPTER_INVALID_INPUT = -7;
     *}
     */
    public static int GVOX_RESULT_ERROR_PARSE_ADAPTER_INVALID_INPUT() {
        return (int) -7L;
    }

    /**
     * {@snippet :
     * enum .GVOX_RESULT_ERROR_PARSE_ADAPTER_REQUESTED_CHANNEL_NOT_PRESENT = -8;
     *}
     */
    public static int GVOX_RESULT_ERROR_PARSE_ADAPTER_REQUESTED_CHANNEL_NOT_PRESENT() {
        return (int) -8L;
    }

    /**
     * {@snippet :
     * enum .GVOX_RESULT_ERROR_SERIALIZE_ADAPTER_UNREPRESENTABLE_DATA = -9;
     *}
     */
    public static int GVOX_RESULT_ERROR_SERIALIZE_ADAPTER_UNREPRESENTABLE_DATA() {
        return (int) -9L;
    }

    /**
     * {@snippet :
     * enum .GVOX_BLIT_MODE_DONT_CARE = 0;
     *}
     */
    public static int GVOX_BLIT_MODE_DONT_CARE() {
        return (int) 0L;
    }

    /**
     * {@snippet :
     * enum .GVOX_BLIT_MODE_PARSE_DRIVEN = 1;
     *}
     */
    public static int GVOX_BLIT_MODE_PARSE_DRIVEN() {
        return (int) 1L;
    }

    /**
     * {@snippet :
     * enum .GVOX_BLIT_MODE_SERIALIZE_DRIVEN = 2;
     *}
     */
    public static int GVOX_BLIT_MODE_SERIALIZE_DRIVEN() {
        return (int) 2L;
    }

    public static MethodHandle gvox_create_context$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$0.gvox_create_context$MH, "gvox_create_context");
    }

    /**
     * {@snippet :
     * GvoxContext* gvox_create_context();
     *}
     */
    public static MemorySegment gvox_create_context() {
        var mh$ = gvox_create_context$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_destroy_context$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$1.gvox_destroy_context$MH, "gvox_destroy_context");
    }

    /**
     * {@snippet :
     * void gvox_destroy_context(GvoxContext* ctx);
     *}
     */
    public static void gvox_destroy_context(MemorySegment ctx) {
        var mh$ = gvox_destroy_context$MH();
        try {
            mh$.invokeExact(ctx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_get_result$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$1.gvox_get_result$MH, "gvox_get_result");
    }

    /**
     * {@snippet :
     * GvoxResult gvox_get_result(GvoxContext* ctx);
     *}
     */
    public static int gvox_get_result(MemorySegment ctx) {
        var mh$ = gvox_get_result$MH();
        try {
            return (int) mh$.invokeExact(ctx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_get_result_message$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$1.gvox_get_result_message$MH, "gvox_get_result_message");
    }

    /**
     * {@snippet :
     * void gvox_get_result_message(GvoxContext* ctx, char* str_buffer, size_t* str_size);
     *}
     */
    public static void gvox_get_result_message(MemorySegment ctx, MemorySegment str_buffer, MemorySegment str_size) {
        var mh$ = gvox_get_result_message$MH();
        try {
            mh$.invokeExact(ctx, str_buffer, str_size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_pop_result$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$1.gvox_pop_result$MH, "gvox_pop_result");
    }

    /**
     * {@snippet :
     * void gvox_pop_result(GvoxContext* ctx);
     *}
     */
    public static void gvox_pop_result(MemorySegment ctx) {
        var mh$ = gvox_pop_result$MH();
        try {
            mh$.invokeExact(ctx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_register_input_adapter$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$1.gvox_register_input_adapter$MH, "gvox_register_input_adapter");
    }

    /**
     * {@snippet :
     * GvoxAdapter* gvox_register_input_adapter(GvoxContext* ctx, const GvoxInputAdapterInfo* adapter_info);
     *}
     */
    public static MemorySegment gvox_register_input_adapter(MemorySegment ctx, MemorySegment adapter_info) {
        var mh$ = gvox_register_input_adapter$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(ctx, adapter_info);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_get_input_adapter$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$1.gvox_get_input_adapter$MH, "gvox_get_input_adapter");
    }

    /**
     * {@snippet :
     * GvoxAdapter* gvox_get_input_adapter(GvoxContext* ctx, char* adapter_name);
     *}
     */
    public static MemorySegment gvox_get_input_adapter(MemorySegment ctx, MemorySegment adapter_name) {
        var mh$ = gvox_get_input_adapter$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(ctx, adapter_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_register_output_adapter$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$2.gvox_register_output_adapter$MH, "gvox_register_output_adapter");
    }

    /**
     * {@snippet :
     * GvoxAdapter* gvox_register_output_adapter(GvoxContext* ctx, const GvoxOutputAdapterInfo* adapter_info);
     *}
     */
    public static MemorySegment gvox_register_output_adapter(MemorySegment ctx, MemorySegment adapter_info) {
        var mh$ = gvox_register_output_adapter$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(ctx, adapter_info);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_get_output_adapter$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$2.gvox_get_output_adapter$MH, "gvox_get_output_adapter");
    }

    /**
     * {@snippet :
     * GvoxAdapter* gvox_get_output_adapter(GvoxContext* ctx, char* adapter_name);
     *}
     */
    public static MemorySegment gvox_get_output_adapter(MemorySegment ctx, MemorySegment adapter_name) {
        var mh$ = gvox_get_output_adapter$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(ctx, adapter_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_register_parse_adapter$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$2.gvox_register_parse_adapter$MH, "gvox_register_parse_adapter");
    }

    /**
     * {@snippet :
     * GvoxAdapter* gvox_register_parse_adapter(GvoxContext* ctx, const GvoxParseAdapterInfo* adapter_info);
     *}
     */
    public static MemorySegment gvox_register_parse_adapter(MemorySegment ctx, MemorySegment adapter_info) {
        var mh$ = gvox_register_parse_adapter$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(ctx, adapter_info);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_get_parse_adapter$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$2.gvox_get_parse_adapter$MH, "gvox_get_parse_adapter");
    }

    /**
     * {@snippet :
     * GvoxAdapter* gvox_get_parse_adapter(GvoxContext* ctx, char* adapter_name);
     *}
     */
    public static MemorySegment gvox_get_parse_adapter(MemorySegment ctx, MemorySegment adapter_name) {
        var mh$ = gvox_get_parse_adapter$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(ctx, adapter_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_register_serialize_adapter$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$2.gvox_register_serialize_adapter$MH, "gvox_register_serialize_adapter");
    }

    /**
     * {@snippet :
     * GvoxAdapter* gvox_register_serialize_adapter(GvoxContext* ctx, const GvoxSerializeAdapterInfo* adapter_info);
     *}
     */
    public static MemorySegment gvox_register_serialize_adapter(MemorySegment ctx, MemorySegment adapter_info) {
        var mh$ = gvox_register_serialize_adapter$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(ctx, adapter_info);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_get_serialize_adapter$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$2.gvox_get_serialize_adapter$MH, "gvox_get_serialize_adapter");
    }

    /**
     * {@snippet :
     * GvoxAdapter* gvox_get_serialize_adapter(GvoxContext* ctx, char* adapter_name);
     *}
     */
    public static MemorySegment gvox_get_serialize_adapter(MemorySegment ctx, MemorySegment adapter_name) {
        var mh$ = gvox_get_serialize_adapter$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(ctx, adapter_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_create_adapter_context$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$3.gvox_create_adapter_context$MH, "gvox_create_adapter_context");
    }

    /**
     * {@snippet :
     * GvoxAdapterContext* gvox_create_adapter_context(GvoxContext* gvox_ctx, GvoxAdapter* adapter, void* config);
     *}
     */
    public static MemorySegment gvox_create_adapter_context(MemorySegment gvox_ctx, MemorySegment adapter, MemorySegment config) {
        var mh$ = gvox_create_adapter_context$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(gvox_ctx, adapter, config);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_destroy_adapter_context$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$3.gvox_destroy_adapter_context$MH, "gvox_destroy_adapter_context");
    }

    /**
     * {@snippet :
     * void gvox_destroy_adapter_context(GvoxAdapterContext* ctx);
     *}
     */
    public static void gvox_destroy_adapter_context(MemorySegment ctx) {
        var mh$ = gvox_destroy_adapter_context$MH();
        try {
            mh$.invokeExact(ctx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_blit_region$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$3.gvox_blit_region$MH, "gvox_blit_region");
    }

    /**
     * {@snippet :
     * void gvox_blit_region(GvoxAdapterContext* input_ctx, GvoxAdapterContext* output_ctx, GvoxAdapterContext* parse_ctx, GvoxAdapterContext* serialize_ctx, const GvoxRegionRange* requested_range, uint32_t channel_flags);
     *}
     */
    public static void gvox_blit_region(MemorySegment input_ctx, MemorySegment output_ctx, MemorySegment parse_ctx, MemorySegment serialize_ctx, MemorySegment requested_range, int channel_flags) {
        var mh$ = gvox_blit_region$MH();
        try {
            mh$.invokeExact(input_ctx, output_ctx, parse_ctx, serialize_ctx, requested_range, channel_flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_blit_region_parse_driven$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$3.gvox_blit_region_parse_driven$MH, "gvox_blit_region_parse_driven");
    }

    /**
     * {@snippet :
     * void gvox_blit_region_parse_driven(GvoxAdapterContext* input_ctx, GvoxAdapterContext* output_ctx, GvoxAdapterContext* parse_ctx, GvoxAdapterContext* serialize_ctx, const GvoxRegionRange* requested_range, uint32_t channel_flags);
     *}
     */
    public static void gvox_blit_region_parse_driven(MemorySegment input_ctx, MemorySegment output_ctx, MemorySegment parse_ctx, MemorySegment serialize_ctx, MemorySegment requested_range, int channel_flags) {
        var mh$ = gvox_blit_region_parse_driven$MH();
        try {
            mh$.invokeExact(input_ctx, output_ctx, parse_ctx, serialize_ctx, requested_range, channel_flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_blit_region_serialize_driven$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$3.gvox_blit_region_serialize_driven$MH, "gvox_blit_region_serialize_driven");
    }

    /**
     * {@snippet :
     * void gvox_blit_region_serialize_driven(GvoxAdapterContext* input_ctx, GvoxAdapterContext* output_ctx, GvoxAdapterContext* parse_ctx, GvoxAdapterContext* serialize_ctx, const GvoxRegionRange* requested_range, uint32_t channel_flags);
     *}
     */
    public static void gvox_blit_region_serialize_driven(MemorySegment input_ctx, MemorySegment output_ctx, MemorySegment parse_ctx, MemorySegment serialize_ctx, MemorySegment requested_range, int channel_flags) {
        var mh$ = gvox_blit_region_serialize_driven$MH();
        try {
            mh$.invokeExact(input_ctx, output_ctx, parse_ctx, serialize_ctx, requested_range, channel_flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_query_region_flags$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__constants$3.gvox_query_region_flags$MH, "gvox_query_region_flags");
    }

    /**
     * {@snippet :
     * uint32_t gvox_query_region_flags(GvoxBlitContext* blit_ctx, const GvoxRegionRange* range, uint32_t channel_flags);
     *}
     */
    public static int gvox_query_region_flags(MemorySegment blit_ctx, MemorySegment range, int channel_flags) {
        var mh$ = gvox_query_region_flags$MH();
        try {
            return (int) mh$.invokeExact(blit_ctx, range, channel_flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_load_region_range$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$4.gvox_load_region_range$MH, "gvox_load_region_range");
    }

    /**
     * {@snippet :
     * GvoxRegion gvox_load_region_range(GvoxBlitContext* blit_ctx, const GvoxRegionRange* range, uint32_t channel_flags);
     *}
     */
    public static MemorySegment gvox_load_region_range(SegmentAllocator allocator, MemorySegment blit_ctx, MemorySegment range, int channel_flags) {
        var mh$ = gvox_load_region_range$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(allocator, blit_ctx, range, channel_flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_unload_region_range$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$4.gvox_unload_region_range$MH, "gvox_unload_region_range");
    }

    /**
     * {@snippet :
     * void gvox_unload_region_range(GvoxBlitContext* blit_ctx, GvoxRegion* region, const GvoxRegionRange* range);
     *}
     */
    public static void gvox_unload_region_range(MemorySegment blit_ctx, MemorySegment region, MemorySegment range) {
        var mh$ = gvox_unload_region_range$MH();
        try {
            mh$.invokeExact(blit_ctx, region, range);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_sample_region$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$4.gvox_sample_region$MH, "gvox_sample_region");
    }

    /**
     * {@snippet :
     * GvoxSample gvox_sample_region(GvoxBlitContext* blit_ctx, const GvoxRegion* region, const GvoxOffset3D* offset, uint32_t channel_id);
     *}
     */
    public static MemorySegment gvox_sample_region(SegmentAllocator allocator, MemorySegment blit_ctx, MemorySegment region, MemorySegment offset, int channel_id) {
        var mh$ = gvox_sample_region$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(allocator, blit_ctx, region, offset, channel_id);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_adapter_push_error$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$4.gvox_adapter_push_error$MH, "gvox_adapter_push_error");
    }

    /**
     * {@snippet :
     * void gvox_adapter_push_error(GvoxAdapterContext* ctx, GvoxResult result_code, char* message);
     *}
     */
    public static void gvox_adapter_push_error(MemorySegment ctx, int result_code, MemorySegment message) {
        var mh$ = gvox_adapter_push_error$MH();
        try {
            mh$.invokeExact(ctx, result_code, message);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_adapter_set_user_pointer$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$4.gvox_adapter_set_user_pointer$MH, "gvox_adapter_set_user_pointer");
    }

    /**
     * {@snippet :
     * void gvox_adapter_set_user_pointer(GvoxAdapterContext* ctx, void* ptr);
     *}
     */
    public static void gvox_adapter_set_user_pointer(MemorySegment ctx, MemorySegment ptr) {
        var mh$ = gvox_adapter_set_user_pointer$MH();
        try {
            mh$.invokeExact(ctx, ptr);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_adapter_get_user_pointer$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$4.gvox_adapter_get_user_pointer$MH, "gvox_adapter_get_user_pointer");
    }

    /**
     * {@snippet :
     * void* gvox_adapter_get_user_pointer(GvoxAdapterContext* ctx);
     *}
     */
    public static MemorySegment gvox_adapter_get_user_pointer(MemorySegment ctx) {
        var mh$ = gvox_adapter_get_user_pointer$MH();
        try {
            return (java.lang.foreign.MemorySegment) mh$.invokeExact(ctx);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_input_read$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$5.gvox_input_read$MH, "gvox_input_read");
    }

    /**
     * {@snippet :
     * void gvox_input_read(GvoxBlitContext* blit_ctx, size_t position, size_t size, void* data);
     *}
     */
    public static void gvox_input_read(MemorySegment blit_ctx, long position, long size, MemorySegment data) {
        var mh$ = gvox_input_read$MH();
        try {
            mh$.invokeExact(blit_ctx, position, size, data);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_output_write$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$5.gvox_output_write$MH, "gvox_output_write");
    }

    /**
     * {@snippet :
     * void gvox_output_write(GvoxBlitContext* blit_ctx, size_t position, size_t size, void* data);
     *}
     */
    public static void gvox_output_write(MemorySegment blit_ctx, long position, long size, MemorySegment data) {
        var mh$ = gvox_output_write$MH();
        try {
            mh$.invokeExact(blit_ctx, position, size, data);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_output_reserve$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$5.gvox_output_reserve$MH, "gvox_output_reserve");
    }

    /**
     * {@snippet :
     * void gvox_output_reserve(GvoxBlitContext* blit_ctx, size_t size);
     *}
     */
    public static void gvox_output_reserve(MemorySegment blit_ctx, long size) {
        var mh$ = gvox_output_reserve$MH();
        try {
            mh$.invokeExact(blit_ctx, size);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle gvox_emit_region$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(constants$5.gvox_emit_region$MH, "gvox_emit_region");
    }

    /**
     * {@snippet :
     * void gvox_emit_region(GvoxBlitContext* blit_ctx, const GvoxRegion* region);
     *}
     */
    public static void gvox_emit_region(MemorySegment blit_ctx, MemorySegment region) {
        var mh$ = gvox_emit_region$MH();
        try {
            mh$.invokeExact(blit_ctx, region);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * {@snippet :
     * #define NULL 0
     *}
     */
    public static MemorySegment NULL() {
        return constants$5.NULL$ADDR;
    }

    /**
     * {@snippet :
     * #define _VCRUNTIME_DISABLED_WARNINGS 4514
     *}
     */
    public static int _VCRUNTIME_DISABLED_WARNINGS() {
        return (int) 4514L;
    }

    /**
     * {@snippet :
     * #define INT8_MIN -128
     *}
     */
    public static int INT8_MIN() {
        return (int) -128L;
    }

    /**
     * {@snippet :
     * #define INT16_MIN -32768
     *}
     */
    public static int INT16_MIN() {
        return (int) -32768L;
    }

    /**
     * {@snippet :
     * #define INT32_MIN -2147483648
     *}
     */
    public static int INT32_MIN() {
        return (int) -2147483648L;
    }

    /**
     * {@snippet :
     * #define INT64_MIN -9223372036854775808
     *}
     */
    public static long INT64_MIN() {
        return -9223372036854775808L;
    }

    /**
     * {@snippet :
     * #define INT8_MAX 127
     *}
     */
    public static byte INT8_MAX() {
        return (byte) 127L;
    }

    /**
     * {@snippet :
     * #define INT16_MAX 32767
     *}
     */
    public static short INT16_MAX() {
        return (short) 32767L;
    }

    /**
     * {@snippet :
     * #define INT32_MAX 2147483647
     *}
     */
    public static int INT32_MAX() {
        return (int) 2147483647L;
    }

    /**
     * {@snippet :
     * #define INT64_MAX 9223372036854775807
     *}
     */
    public static long INT64_MAX() {
        return 9223372036854775807L;
    }

    /**
     * {@snippet :
     * #define UINT8_MAX 255
     *}
     */
    public static byte UINT8_MAX() {
        return (byte) 255L;
    }

    /**
     * {@snippet :
     * #define UINT16_MAX 65535
     *}
     */
    public static short UINT16_MAX() {
        return (short) 65535L;
    }

    /**
     * {@snippet :
     * #define UINT32_MAX 4294967295
     *}
     */
    public static int UINT32_MAX() {
        return (int) 4294967295L;
    }

    /**
     * {@snippet :
     * #define UINT64_MAX -1
     *}
     */
    public static long UINT64_MAX() {
        return -1L;
    }

    /**
     * {@snippet :
     * #define INT_LEAST8_MIN -128
     *}
     */
    public static int INT_LEAST8_MIN() {
        return (int) -128L;
    }

    /**
     * {@snippet :
     * #define INT_LEAST16_MIN -32768
     *}
     */
    public static int INT_LEAST16_MIN() {
        return (int) -32768L;
    }

    /**
     * {@snippet :
     * #define INT_LEAST32_MIN -2147483648
     *}
     */
    public static int INT_LEAST32_MIN() {
        return (int) -2147483648L;
    }

    /**
     * {@snippet :
     * #define INT_LEAST64_MIN -9223372036854775808
     *}
     */
    public static long INT_LEAST64_MIN() {
        return -9223372036854775808L;
    }

    /**
     * {@snippet :
     * #define INT_LEAST8_MAX 127
     *}
     */
    public static byte INT_LEAST8_MAX() {
        return (byte) 127L;
    }

    /**
     * {@snippet :
     * #define INT_LEAST16_MAX 32767
     *}
     */
    public static short INT_LEAST16_MAX() {
        return (short) 32767L;
    }

    /**
     * {@snippet :
     * #define INT_LEAST32_MAX 2147483647
     *}
     */
    public static int INT_LEAST32_MAX() {
        return (int) 2147483647L;
    }

    /**
     * {@snippet :
     * #define INT_LEAST64_MAX 9223372036854775807
     *}
     */
    public static long INT_LEAST64_MAX() {
        return 9223372036854775807L;
    }

    /**
     * {@snippet :
     * #define UINT_LEAST8_MAX 255
     *}
     */
    public static byte UINT_LEAST8_MAX() {
        return (byte) 255L;
    }

    /**
     * {@snippet :
     * #define UINT_LEAST16_MAX 65535
     *}
     */
    public static short UINT_LEAST16_MAX() {
        return (short) 65535L;
    }

    /**
     * {@snippet :
     * #define UINT_LEAST32_MAX 4294967295
     *}
     */
    public static int UINT_LEAST32_MAX() {
        return (int) 4294967295L;
    }

    /**
     * {@snippet :
     * #define UINT_LEAST64_MAX -1
     *}
     */
    public static long UINT_LEAST64_MAX() {
        return -1L;
    }

    /**
     * {@snippet :
     * #define INT_FAST8_MIN -128
     *}
     */
    public static int INT_FAST8_MIN() {
        return (int) -128L;
    }

    /**
     * {@snippet :
     * #define INT_FAST16_MIN -2147483648
     *}
     */
    public static int INT_FAST16_MIN() {
        return (int) -2147483648L;
    }

    /**
     * {@snippet :
     * #define INT_FAST32_MIN -2147483648
     *}
     */
    public static int INT_FAST32_MIN() {
        return (int) -2147483648L;
    }

    /**
     * {@snippet :
     * #define INT_FAST64_MIN -9223372036854775808
     *}
     */
    public static long INT_FAST64_MIN() {
        return -9223372036854775808L;
    }

    /**
     * {@snippet :
     * #define INT_FAST8_MAX 127
     *}
     */
    public static byte INT_FAST8_MAX() {
        return (byte) 127L;
    }

    /**
     * {@snippet :
     * #define INT_FAST16_MAX 2147483647
     *}
     */
    public static int INT_FAST16_MAX() {
        return (int) 2147483647L;
    }

    /**
     * {@snippet :
     * #define INT_FAST32_MAX 2147483647
     *}
     */
    public static int INT_FAST32_MAX() {
        return (int) 2147483647L;
    }

    /**
     * {@snippet :
     * #define INT_FAST64_MAX 9223372036854775807
     *}
     */
    public static long INT_FAST64_MAX() {
        return 9223372036854775807L;
    }

    /**
     * {@snippet :
     * #define UINT_FAST8_MAX 255
     *}
     */
    public static byte UINT_FAST8_MAX() {
        return (byte) 255L;
    }

    /**
     * {@snippet :
     * #define UINT_FAST16_MAX 4294967295
     *}
     */
    public static int UINT_FAST16_MAX() {
        return (int) 4294967295L;
    }

    /**
     * {@snippet :
     * #define UINT_FAST32_MAX 4294967295
     *}
     */
    public static int UINT_FAST32_MAX() {
        return (int) 4294967295L;
    }

    /**
     * {@snippet :
     * #define UINT_FAST64_MAX -1
     *}
     */
    public static long UINT_FAST64_MAX() {
        return -1L;
    }

    /**
     * {@snippet :
     * #define INTPTR_MIN -9223372036854775808
     *}
     */
    public static long INTPTR_MIN() {
        return -9223372036854775808L;
    }

    /**
     * {@snippet :
     * #define INTPTR_MAX 9223372036854775807
     *}
     */
    public static long INTPTR_MAX() {
        return 9223372036854775807L;
    }

    /**
     * {@snippet :
     * #define UINTPTR_MAX -1
     *}
     */
    public static long UINTPTR_MAX() {
        return -1L;
    }

    /**
     * {@snippet :
     * #define INTMAX_MIN -9223372036854775808
     *}
     */
    public static long INTMAX_MIN() {
        return -9223372036854775808L;
    }

    /**
     * {@snippet :
     * #define INTMAX_MAX 9223372036854775807
     *}
     */
    public static long INTMAX_MAX() {
        return 9223372036854775807L;
    }

    /**
     * {@snippet :
     * #define UINTMAX_MAX -1
     *}
     */
    public static long UINTMAX_MAX() {
        return -1L;
    }

    /**
     * {@snippet :
     * #define PTRDIFF_MIN -9223372036854775808
     *}
     */
    public static long PTRDIFF_MIN() {
        return -9223372036854775808L;
    }

    /**
     * {@snippet :
     * #define PTRDIFF_MAX 9223372036854775807
     *}
     */
    public static long PTRDIFF_MAX() {
        return 9223372036854775807L;
    }

    /**
     * {@snippet :
     * #define SIZE_MAX -1
     *}
     */
    public static long SIZE_MAX() {
        return -1L;
    }

    /**
     * {@snippet :
     * #define SIG_ATOMIC_MIN -2147483648
     *}
     */
    public static int SIG_ATOMIC_MIN() {
        return (int) -2147483648L;
    }

    /**
     * {@snippet :
     * #define SIG_ATOMIC_MAX 2147483647
     *}
     */
    public static int SIG_ATOMIC_MAX() {
        return (int) 2147483647L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_COLOR 1
     *}
     */
    public static int GVOX_CHANNEL_BIT_COLOR() {
        return (int) 1L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_NORMAL 2
     *}
     */
    public static int GVOX_CHANNEL_BIT_NORMAL() {
        return (int) 2L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_MATERIAL_ID 4
     *}
     */
    public static int GVOX_CHANNEL_BIT_MATERIAL_ID() {
        return (int) 4L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_ROUGHNESS 8
     *}
     */
    public static int GVOX_CHANNEL_BIT_ROUGHNESS() {
        return (int) 8L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_METALNESS 16
     *}
     */
    public static int GVOX_CHANNEL_BIT_METALNESS() {
        return (int) 16L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_TRANSPARENCY 32
     *}
     */
    public static int GVOX_CHANNEL_BIT_TRANSPARENCY() {
        return (int) 32L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_IOR 64
     *}
     */
    public static int GVOX_CHANNEL_BIT_IOR() {
        return (int) 64L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_EMISSIVITY 128
     *}
     */
    public static int GVOX_CHANNEL_BIT_EMISSIVITY() {
        return (int) 128L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_HARDNESS 256
     *}
     */
    public static int GVOX_CHANNEL_BIT_HARDNESS() {
        return (int) 256L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_LAST_STANDARD 8388608
     *}
     */
    public static int GVOX_CHANNEL_BIT_LAST_STANDARD() {
        return (int) 8388608L;
    }

    /**
     * {@snippet :
     * #define GVOX_CHANNEL_BIT_LAST -2147483648
     *}
     */
    public static int GVOX_CHANNEL_BIT_LAST() {
        return (int) -2147483648L;
    }


    public static MethodHandle gvox_demo_test$MH() {
        return __GvoxNativeRuntimeHelper.requireNonNull(__GvoxNativeRuntimeHelper.downcallHandle("gvox_demo_test", FunctionDescriptor.ofVoid()), "gvox_demo_test");
    }

    public static void gvox_demo_test() {
        var mh$ = gvox_demo_test$MH();
        try {
            mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


