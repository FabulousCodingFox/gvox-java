package de.fabulousfox.gvox_java.nativelayer;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

/**
 * {@snippet :
 * struct {
 *     GvoxAdapterBaseInfo base_info;
 *     void (*write)(GvoxAdapterContext*,size_t,size_t,void*);
 *     void (*reserve)(GvoxAdapterContext*,size_t);
 * };
 *}
 */
public class GvoxOutputAdapterInfo {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("name_str"),
                    Constants$root.C_POINTER$LAYOUT.withName("create"),
                    Constants$root.C_POINTER$LAYOUT.withName("destroy"),
                    Constants$root.C_POINTER$LAYOUT.withName("blit_begin"),
                    Constants$root.C_POINTER$LAYOUT.withName("blit_end")
            ).withName("base_info"),
            Constants$root.C_POINTER$LAYOUT.withName("write"),
            Constants$root.C_POINTER$LAYOUT.withName("reserve")
    );

    public static MemoryLayout $LAYOUT() {
        return GvoxOutputAdapterInfo.$struct$LAYOUT;
    }

    public static MemorySegment base_info$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }

    static final FunctionDescriptor write$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor write_UP$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle write_UP$MH = __GvoxNativeRuntimeHelper.upcallHandle(write.class, "apply", GvoxOutputAdapterInfo.write_UP$FUNC);
    static final FunctionDescriptor write_DOWN$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle write_DOWN$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            GvoxOutputAdapterInfo.write_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*write)(GvoxAdapterContext*,size_t,size_t,void*);
     *}
     */
    public interface write {

        void apply(java.lang.foreign.MemorySegment _x0, long _x1, long _x2, java.lang.foreign.MemorySegment _x3);

        static MemorySegment allocate(write fi, SegmentScope scope) {
            return __GvoxNativeRuntimeHelper.upcallStub(GvoxOutputAdapterInfo.write_UP$MH, fi, GvoxOutputAdapterInfo.write$FUNC, scope);
        }

        static write ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, long __x1, long __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    GvoxOutputAdapterInfo.write_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle write$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("write"));

    public static VarHandle write$VH() {
        return GvoxOutputAdapterInfo.write$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*write)(GvoxAdapterContext*,size_t,size_t,void*);
     *}
     */
    public static MemorySegment write$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxOutputAdapterInfo.write$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*write)(GvoxAdapterContext*,size_t,size_t,void*);
     *}
     */
    public static void write$set(MemorySegment seg, MemorySegment x) {
        GvoxOutputAdapterInfo.write$VH.set(seg, x);
    }

    public static MemorySegment write$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxOutputAdapterInfo.write$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void write$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxOutputAdapterInfo.write$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static write write(MemorySegment segment, SegmentScope scope) {
        return write.ofAddress(write$get(segment), scope);
    }

    static final FunctionDescriptor reserve$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor reserve_UP$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle reserve_UP$MH = __GvoxNativeRuntimeHelper.upcallHandle(reserve.class, "apply", GvoxOutputAdapterInfo.reserve_UP$FUNC);
    static final FunctionDescriptor reserve_DOWN$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle reserve_DOWN$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            GvoxOutputAdapterInfo.reserve_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*reserve)(GvoxAdapterContext*,size_t);
     *}
     */
    public interface reserve {

        void apply(java.lang.foreign.MemorySegment _x0, long _x1);

        static MemorySegment allocate(reserve fi, SegmentScope scope) {
            return __GvoxNativeRuntimeHelper.upcallStub(GvoxOutputAdapterInfo.reserve_UP$MH, fi, GvoxOutputAdapterInfo.reserve$FUNC, scope);
        }

        static reserve ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
                try {
                    GvoxOutputAdapterInfo.reserve_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserve$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserve"));

    public static VarHandle reserve$VH() {
        return GvoxOutputAdapterInfo.reserve$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*reserve)(GvoxAdapterContext*,size_t);
     *}
     */
    public static MemorySegment reserve$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxOutputAdapterInfo.reserve$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*reserve)(GvoxAdapterContext*,size_t);
     *}
     */
    public static void reserve$set(MemorySegment seg, MemorySegment x) {
        GvoxOutputAdapterInfo.reserve$VH.set(seg, x);
    }

    public static MemorySegment reserve$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxOutputAdapterInfo.reserve$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void reserve$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxOutputAdapterInfo.reserve$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static reserve reserve(MemorySegment segment, SegmentScope scope) {
        return reserve.ofAddress(reserve$get(segment), scope);
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


