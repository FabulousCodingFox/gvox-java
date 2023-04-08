package de.fabulousfox.jvox.jextract;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

/**
 * {@snippet :
 * struct {
 *     uint32_t x;
 *     uint32_t y;
 *     uint32_t z;
 * };
 *}
 */
public class GvoxExtent3D {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y"),
            Constants$root.C_LONG$LAYOUT.withName("z")
    );

    public static MemoryLayout $LAYOUT() {
        return GvoxExtent3D.$struct$LAYOUT;
    }

    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));

    public static VarHandle x$VH() {
        return GvoxExtent3D.x$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * uint32_t x;
     *}
     */
    public static int x$get(MemorySegment seg) {
        return (int) GvoxExtent3D.x$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * uint32_t x;
     *}
     */
    public static void x$set(MemorySegment seg, int x) {
        GvoxExtent3D.x$VH.set(seg, x);
    }

    public static int x$get(MemorySegment seg, long index) {
        return (int) GvoxExtent3D.x$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void x$set(MemorySegment seg, long index, int x) {
        GvoxExtent3D.x$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));

    public static VarHandle y$VH() {
        return GvoxExtent3D.y$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * uint32_t y;
     *}
     */
    public static int y$get(MemorySegment seg) {
        return (int) GvoxExtent3D.y$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * uint32_t y;
     *}
     */
    public static void y$set(MemorySegment seg, int x) {
        GvoxExtent3D.y$VH.set(seg, x);
    }

    public static int y$get(MemorySegment seg, long index) {
        return (int) GvoxExtent3D.y$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void y$set(MemorySegment seg, long index, int x) {
        GvoxExtent3D.y$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle z$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("z"));

    public static VarHandle z$VH() {
        return GvoxExtent3D.z$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * uint32_t z;
     *}
     */
    public static int z$get(MemorySegment seg) {
        return (int) GvoxExtent3D.z$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * uint32_t z;
     *}
     */
    public static void z$set(MemorySegment seg, int x) {
        GvoxExtent3D.z$VH.set(seg, x);
    }

    public static int z$get(MemorySegment seg, long index) {
        return (int) GvoxExtent3D.z$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void z$set(MemorySegment seg, long index, int x) {
        GvoxExtent3D.z$VH.set(seg.asSlice(index * sizeof()), x);
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


