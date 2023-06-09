package de.fabulousfox.gvox_java.nativelayer;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

/**
 * {@snippet :
 * struct {
 *     char* name_str;
 *     void (*create)(__GvoxAdapterContext*,void*);
 *     void (*destroy)(__GvoxAdapterContext*);
 *     void (*blit_begin)(__GvoxBlitContext*,__GvoxAdapterContext*,const __GvoxRegionRange*,uint32_t);
 *     void (*blit_end)(__GvoxBlitContext*,__GvoxAdapterContext*);
 * };
 *}
 */
public class __GvoxAdapterBaseInfo {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            __Constants$root.C_POINTER$LAYOUT.withName("name_str"),
            __Constants$root.C_POINTER$LAYOUT.withName("create"),
            __Constants$root.C_POINTER$LAYOUT.withName("destroy"),
            __Constants$root.C_POINTER$LAYOUT.withName("blit_begin"),
            __Constants$root.C_POINTER$LAYOUT.withName("blit_end")
    );

    public static MemoryLayout $LAYOUT() {
        return __GvoxAdapterBaseInfo.$struct$LAYOUT;
    }

    static final VarHandle name_str$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name_str"));

    public static VarHandle name_str$VH() {
        return __GvoxAdapterBaseInfo.name_str$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * char* name_str;
     *}
     */
    public static MemorySegment name_str$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.name_str$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * char* name_str;
     *}
     */
    public static void name_str$set(MemorySegment seg, MemorySegment x) {
        __GvoxAdapterBaseInfo.name_str$VH.set(seg, x);
    }

    public static MemorySegment name_str$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.name_str$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void name_str$set(MemorySegment seg, long index, MemorySegment x) {
        __GvoxAdapterBaseInfo.name_str$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final FunctionDescriptor create$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor create_UP$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_UP$MH = __GvoxNativeRuntimeHelper.upcallHandle(create.class, "apply", __GvoxAdapterBaseInfo.create_UP$FUNC);
    static final FunctionDescriptor create_DOWN$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_DOWN$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            __GvoxAdapterBaseInfo.create_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*create)(__GvoxAdapterContext*,void*);
     *}
     */
    public interface create {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);

        static MemorySegment allocate(create fi, SegmentScope scope) {
            return __GvoxNativeRuntimeHelper.upcallStub(__GvoxAdapterBaseInfo.create_UP$MH, fi, __GvoxAdapterBaseInfo.create$FUNC, scope);
        }

        static create ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    __GvoxAdapterBaseInfo.create_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle create$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("create"));

    public static VarHandle create$VH() {
        return __GvoxAdapterBaseInfo.create$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*create)(__GvoxAdapterContext*,void*);
     *}
     */
    public static MemorySegment create$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.create$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*create)(__GvoxAdapterContext*,void*);
     *}
     */
    public static void create$set(MemorySegment seg, MemorySegment x) {
        __GvoxAdapterBaseInfo.create$VH.set(seg, x);
    }

    public static MemorySegment create$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.create$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void create$set(MemorySegment seg, long index, MemorySegment x) {
        __GvoxAdapterBaseInfo.create$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static create create(MemorySegment segment, SegmentScope scope) {
        return create.ofAddress(create$get(segment), scope);
    }

    static final FunctionDescriptor destroy$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor destroy_UP$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle destroy_UP$MH = __GvoxNativeRuntimeHelper.upcallHandle(destroy.class, "apply", __GvoxAdapterBaseInfo.destroy_UP$FUNC);
    static final FunctionDescriptor destroy_DOWN$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle destroy_DOWN$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            __GvoxAdapterBaseInfo.destroy_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*destroy)(__GvoxAdapterContext*);
     *}
     */
    public interface destroy {

        void apply(java.lang.foreign.MemorySegment _x0);

        static MemorySegment allocate(destroy fi, SegmentScope scope) {
            return __GvoxNativeRuntimeHelper.upcallStub(__GvoxAdapterBaseInfo.destroy_UP$MH, fi, __GvoxAdapterBaseInfo.destroy$FUNC, scope);
        }

        static destroy ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    __GvoxAdapterBaseInfo.destroy_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle destroy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("destroy"));

    public static VarHandle destroy$VH() {
        return __GvoxAdapterBaseInfo.destroy$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*destroy)(__GvoxAdapterContext*);
     *}
     */
    public static MemorySegment destroy$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.destroy$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*destroy)(__GvoxAdapterContext*);
     *}
     */
    public static void destroy$set(MemorySegment seg, MemorySegment x) {
        __GvoxAdapterBaseInfo.destroy$VH.set(seg, x);
    }

    public static MemorySegment destroy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.destroy$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void destroy$set(MemorySegment seg, long index, MemorySegment x) {
        __GvoxAdapterBaseInfo.destroy$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static destroy destroy(MemorySegment segment, SegmentScope scope) {
        return destroy.ofAddress(destroy$get(segment), scope);
    }

    static final FunctionDescriptor blit_begin$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor blit_begin_UP$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle blit_begin_UP$MH = __GvoxNativeRuntimeHelper.upcallHandle(blit_begin.class, "apply", __GvoxAdapterBaseInfo.blit_begin_UP$FUNC);
    static final FunctionDescriptor blit_begin_DOWN$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle blit_begin_DOWN$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            __GvoxAdapterBaseInfo.blit_begin_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*blit_begin)(__GvoxBlitContext*,__GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public interface blit_begin {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);

        static MemorySegment allocate(blit_begin fi, SegmentScope scope) {
            return __GvoxNativeRuntimeHelper.upcallStub(__GvoxAdapterBaseInfo.blit_begin_UP$MH, fi, __GvoxAdapterBaseInfo.blit_begin$FUNC, scope);
        }

        static blit_begin ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    __GvoxAdapterBaseInfo.blit_begin_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle blit_begin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blit_begin"));

    public static VarHandle blit_begin$VH() {
        return __GvoxAdapterBaseInfo.blit_begin$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*blit_begin)(__GvoxBlitContext*,__GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static MemorySegment blit_begin$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.blit_begin$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*blit_begin)(__GvoxBlitContext*,__GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static void blit_begin$set(MemorySegment seg, MemorySegment x) {
        __GvoxAdapterBaseInfo.blit_begin$VH.set(seg, x);
    }

    public static MemorySegment blit_begin$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.blit_begin$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void blit_begin$set(MemorySegment seg, long index, MemorySegment x) {
        __GvoxAdapterBaseInfo.blit_begin$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static blit_begin blit_begin(MemorySegment segment, SegmentScope scope) {
        return blit_begin.ofAddress(blit_begin$get(segment), scope);
    }

    static final FunctionDescriptor blit_end$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor blit_end_UP$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle blit_end_UP$MH = __GvoxNativeRuntimeHelper.upcallHandle(blit_end.class, "apply", __GvoxAdapterBaseInfo.blit_end_UP$FUNC);
    static final FunctionDescriptor blit_end_DOWN$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle blit_end_DOWN$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            __GvoxAdapterBaseInfo.blit_end_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*blit_end)(__GvoxBlitContext*,__GvoxAdapterContext*);
     *}
     */
    public interface blit_end {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);

        static MemorySegment allocate(blit_end fi, SegmentScope scope) {
            return __GvoxNativeRuntimeHelper.upcallStub(__GvoxAdapterBaseInfo.blit_end_UP$MH, fi, __GvoxAdapterBaseInfo.blit_end$FUNC, scope);
        }

        static blit_end ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    __GvoxAdapterBaseInfo.blit_end_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle blit_end$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blit_end"));

    public static VarHandle blit_end$VH() {
        return __GvoxAdapterBaseInfo.blit_end$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*blit_end)(__GvoxBlitContext*,__GvoxAdapterContext*);
     *}
     */
    public static MemorySegment blit_end$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.blit_end$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*blit_end)(__GvoxBlitContext*,__GvoxAdapterContext*);
     *}
     */
    public static void blit_end$set(MemorySegment seg, MemorySegment x) {
        __GvoxAdapterBaseInfo.blit_end$VH.set(seg, x);
    }

    public static MemorySegment blit_end$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) __GvoxAdapterBaseInfo.blit_end$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void blit_end$set(MemorySegment seg, long index, MemorySegment x) {
        __GvoxAdapterBaseInfo.blit_end$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static blit_end blit_end(MemorySegment segment, SegmentScope scope) {
        return blit_end.ofAddress(blit_end$get(segment), scope);
    }

    public static long sizeof() {
        return $LAYOUT().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate($LAYOUT());
    }

    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) {
        return __GvoxNativeRuntimeHelper.asArray(addr, $LAYOUT(), 1, scope);
    }
}


