package de.fabulousfox.gvox_java.nativelayer;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

/**
 * {@snippet :
 * struct {
 *     __GvoxAdapterBaseInfo base_info;
 *     void (*serialize_region)(__GvoxBlitContext*,__GvoxAdapterContext*,const __GvoxRegionRange*,uint32_t);
 *     void (*receive_region)(__GvoxBlitContext*,__GvoxAdapterContext*,const __GvoxRegion*);
 * };
 *}
 */
public class __GvoxSerializeAdapterInfo {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                    __Constants$root.C_POINTER$LAYOUT.withName("name_str"),
                    __Constants$root.C_POINTER$LAYOUT.withName("create"),
                    __Constants$root.C_POINTER$LAYOUT.withName("destroy"),
                    __Constants$root.C_POINTER$LAYOUT.withName("blit_begin"),
                    __Constants$root.C_POINTER$LAYOUT.withName("blit_end")
            ).withName("base_info"),
            __Constants$root.C_POINTER$LAYOUT.withName("serialize_region"),
            __Constants$root.C_POINTER$LAYOUT.withName("receive_region")
    );

    public static MemoryLayout $LAYOUT() {
        return __GvoxSerializeAdapterInfo.$struct$LAYOUT;
    }

    public static MemorySegment base_info$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }

    static final FunctionDescriptor serialize_region$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor serialize_region_UP$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle serialize_region_UP$MH = __GvoxNativeRuntimeHelper.upcallHandle(serialize_region.class, "apply", __GvoxSerializeAdapterInfo.serialize_region_UP$FUNC);
    static final FunctionDescriptor serialize_region_DOWN$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle serialize_region_DOWN$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            __GvoxSerializeAdapterInfo.serialize_region_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*serialize_region)(__GvoxBlitContext*,__GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public interface serialize_region {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);

        static MemorySegment allocate(serialize_region fi, SegmentScope scope) {
            return __GvoxNativeRuntimeHelper.upcallStub(__GvoxSerializeAdapterInfo.serialize_region_UP$MH, fi, __GvoxSerializeAdapterInfo.serialize_region$FUNC, scope);
        }

        static serialize_region ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    __GvoxSerializeAdapterInfo.serialize_region_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle serialize_region$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serialize_region"));

    public static VarHandle serialize_region$VH() {
        return __GvoxSerializeAdapterInfo.serialize_region$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*serialize_region)(__GvoxBlitContext*,__GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static MemorySegment serialize_region$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) __GvoxSerializeAdapterInfo.serialize_region$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*serialize_region)(__GvoxBlitContext*,__GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static void serialize_region$set(MemorySegment seg, MemorySegment x) {
        __GvoxSerializeAdapterInfo.serialize_region$VH.set(seg, x);
    }

    public static MemorySegment serialize_region$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) __GvoxSerializeAdapterInfo.serialize_region$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void serialize_region$set(MemorySegment seg, long index, MemorySegment x) {
        __GvoxSerializeAdapterInfo.serialize_region$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static serialize_region serialize_region(MemorySegment segment, SegmentScope scope) {
        return serialize_region.ofAddress(serialize_region$get(segment), scope);
    }

    static final FunctionDescriptor receive_region$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor receive_region_UP$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle receive_region_UP$MH = __GvoxNativeRuntimeHelper.upcallHandle(receive_region.class, "apply", __GvoxSerializeAdapterInfo.receive_region_UP$FUNC);
    static final FunctionDescriptor receive_region_DOWN$FUNC = FunctionDescriptor.ofVoid(
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT,
            __Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle receive_region_DOWN$MH = __GvoxNativeRuntimeHelper.downcallHandle(
            __GvoxSerializeAdapterInfo.receive_region_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*receive_region)(__GvoxBlitContext*,__GvoxAdapterContext*,const GvoxRegion*);
     *}
     */
    public interface receive_region {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);

        static MemorySegment allocate(receive_region fi, SegmentScope scope) {
            return __GvoxNativeRuntimeHelper.upcallStub(__GvoxSerializeAdapterInfo.receive_region_UP$MH, fi, __GvoxSerializeAdapterInfo.receive_region$FUNC, scope);
        }

        static receive_region ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    __GvoxSerializeAdapterInfo.receive_region_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle receive_region$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("receive_region"));

    public static VarHandle receive_region$VH() {
        return __GvoxSerializeAdapterInfo.receive_region$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*receive_region)(__GvoxBlitContext*,__GvoxAdapterContext*,const GvoxRegion*);
     *}
     */
    public static MemorySegment receive_region$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) __GvoxSerializeAdapterInfo.receive_region$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*receive_region)(__GvoxBlitContext*,__GvoxAdapterContext*,const GvoxRegion*);
     *}
     */
    public static void receive_region$set(MemorySegment seg, MemorySegment x) {
        __GvoxSerializeAdapterInfo.receive_region$VH.set(seg, x);
    }

    public static MemorySegment receive_region$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) __GvoxSerializeAdapterInfo.receive_region$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void receive_region$set(MemorySegment seg, long index, MemorySegment x) {
        __GvoxSerializeAdapterInfo.receive_region$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static receive_region receive_region(MemorySegment segment, SegmentScope scope) {
        return receive_region.ofAddress(receive_region$get(segment), scope);
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


