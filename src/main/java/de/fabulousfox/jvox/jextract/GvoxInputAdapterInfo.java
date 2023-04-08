package de.fabulousfox.jvox.jextract;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

/**
 * {@snippet :
 * struct {
 *     GvoxAdapterBaseInfo base_info;
 *     void (*read)(GvoxAdapterContext*,size_t,size_t,void*);
 * };
 *}
 */
public class GvoxInputAdapterInfo {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("name_str"),
                    Constants$root.C_POINTER$LAYOUT.withName("create"),
                    Constants$root.C_POINTER$LAYOUT.withName("destroy"),
                    Constants$root.C_POINTER$LAYOUT.withName("blit_begin"),
                    Constants$root.C_POINTER$LAYOUT.withName("blit_end")
            ).withName("base_info"),
            Constants$root.C_POINTER$LAYOUT.withName("read")
    );

    public static MemoryLayout $LAYOUT() {
        return GvoxInputAdapterInfo.$struct$LAYOUT;
    }

    public static MemorySegment base_info$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }

    static final FunctionDescriptor read$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor read_UP$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle read_UP$MH = RuntimeHelper.upcallHandle(read.class, "apply", GvoxInputAdapterInfo.read_UP$FUNC);
    static final FunctionDescriptor read_DOWN$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle read_DOWN$MH = RuntimeHelper.downcallHandle(
            GvoxInputAdapterInfo.read_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*read)(GvoxAdapterContext*,size_t,size_t,void*);
     *}
     */
    public interface read {

        void apply(java.lang.foreign.MemorySegment _x0, long _x1, long _x2, java.lang.foreign.MemorySegment _x3);

        static MemorySegment allocate(read fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(GvoxInputAdapterInfo.read_UP$MH, fi, GvoxInputAdapterInfo.read$FUNC, scope);
        }

        static read ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, long __x1, long __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    GvoxInputAdapterInfo.read_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle read$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("read"));

    public static VarHandle read$VH() {
        return GvoxInputAdapterInfo.read$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*read)(GvoxAdapterContext*,size_t,size_t,void*);
     *}
     */
    public static MemorySegment read$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxInputAdapterInfo.read$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*read)(GvoxAdapterContext*,size_t,size_t,void*);
     *}
     */
    public static void read$set(MemorySegment seg, MemorySegment x) {
        GvoxInputAdapterInfo.read$VH.set(seg, x);
    }

    public static MemorySegment read$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxInputAdapterInfo.read$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void read$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxInputAdapterInfo.read$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static read read(MemorySegment segment, SegmentScope scope) {
        return read.ofAddress(read$get(segment), scope);
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
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope);
    }
}


