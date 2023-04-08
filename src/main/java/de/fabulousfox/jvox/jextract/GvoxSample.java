package de.fabulousfox.jvox.jextract;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

/**
 * {@snippet :
 * struct {
 *     uint32_t data;
 *     uint8_t is_present;
 * };
 *}
 */
public class GvoxSample {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("data"),
            Constants$root.C_CHAR$LAYOUT.withName("is_present"),
            MemoryLayout.paddingLayout(24)
    );

    public static MemoryLayout $LAYOUT() {
        return GvoxSample.$struct$LAYOUT;
    }

    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));

    public static VarHandle data$VH() {
        return GvoxSample.data$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * uint32_t data;
     *}
     */
    public static int data$get(MemorySegment seg) {
        return (int) GvoxSample.data$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * uint32_t data;
     *}
     */
    public static void data$set(MemorySegment seg, int x) {
        GvoxSample.data$VH.set(seg, x);
    }

    public static int data$get(MemorySegment seg, long index) {
        return (int) GvoxSample.data$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void data$set(MemorySegment seg, long index, int x) {
        GvoxSample.data$VH.set(seg.asSlice(index * sizeof()), x);
    }

    static final VarHandle is_present$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_present"));

    public static VarHandle is_present$VH() {
        return GvoxSample.is_present$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * uint8_t is_present;
     *}
     */
    public static byte is_present$get(MemorySegment seg) {
        return (byte) GvoxSample.is_present$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * uint8_t is_present;
     *}
     */
    public static void is_present$set(MemorySegment seg, byte x) {
        GvoxSample.is_present$VH.set(seg, x);
    }

    public static byte is_present$get(MemorySegment seg, long index) {
        return (byte) GvoxSample.is_present$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void is_present$set(MemorySegment seg, long index, byte x) {
        GvoxSample.is_present$VH.set(seg.asSlice(index * sizeof()), x);
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


