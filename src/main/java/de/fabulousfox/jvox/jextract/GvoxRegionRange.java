package de.fabulousfox.jvox.jextract;

import java.lang.foreign.*;

/**
 * {@snippet :
 * struct {
 *     GvoxOffset3D offset;
 *     GvoxExtent3D extent;
 * };
 *}
 */
public class GvoxRegionRange {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    );

    public static MemoryLayout $LAYOUT() {
        return GvoxRegionRange.$struct$LAYOUT;
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
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope);
    }
}


