package de.fabulousfox.gvox_java.jextract;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

/**
 * {@snippet :
 * struct {
 *     GvoxRegionRange range;
 *     uint32_t channels;
 *     uint32_t flags;
 *     void* data;
 * };
 *}
 */
public class GvoxRegion {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    );

    public static MemoryLayout $LAYOUT() {
        return GvoxRegion.$struct$LAYOUT;
    }

    public static MemorySegment range$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }

    static final VarHandle channels$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("channels"));

    public static VarHandle channels$VH() {
        return GvoxRegion.channels$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * uint32_t channels;
     *}
     */
    public static int channels$get(MemorySegment seg) {
        return (int) GvoxRegion.channels$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * uint32_t channels;
     *}
     */
    public static void channels$set(MemorySegment seg, int x) {
        GvoxRegion.channels$VH.set(seg, x);
    }

    public static int channels$get(MemorySegment seg, long index) {
        return (int) GvoxRegion.channels$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void channels$set(MemorySegment seg, long index, int x) {
        GvoxRegion.channels$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));

    public static VarHandle flags$VH() {
        return GvoxRegion.flags$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * uint32_t flags;
     *}
     */
    public static int flags$get(MemorySegment seg) {
        return (int) GvoxRegion.flags$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * uint32_t flags;
     *}
     */
    public static void flags$set(MemorySegment seg, int x) {
        GvoxRegion.flags$VH.set(seg, x);
    }

    public static int flags$get(MemorySegment seg, long index) {
        return (int) GvoxRegion.flags$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void flags$set(MemorySegment seg, long index, int x) {
        GvoxRegion.flags$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));

    public static VarHandle data$VH() {
        return GvoxRegion.data$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void* data;
     *}
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxRegion.data$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void* data;
     *}
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        GvoxRegion.data$VH.set(seg, x);
    }

    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxRegion.data$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxRegion.data$VH.set(seg.asSlice(index * sizeof()), x);
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


