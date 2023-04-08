package de.fabulousfox.gvox_java.nativelayer;

import java.lang.foreign.*;

/**
 * {@snippet :
 * struct {
 *     __GvoxOffset3D offset;
 *     __GvoxExtent3D extent;
 * };
 *}
 */
public class __GvoxRegionRange {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    );

    public static MemoryLayout $LAYOUT() {
        return __GvoxRegionRange.$struct$LAYOUT;
    }

    public static MemorySegment offset$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }

    public static MemorySegment extent$slice(MemorySegment seg) {
        return seg.asSlice(12, 12);
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


