package de.fabulousfox.gvox_java.jextract;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

/**
 * {@snippet :
 * struct {
 *     GvoxBlitMode preferred_blit_mode;
 * };
 *}
 */
public class GvoxParseAdapterDetails {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("preferred_blit_mode")
    );

    public static MemoryLayout $LAYOUT() {
        return GvoxParseAdapterDetails.$struct$LAYOUT;
    }

    static final VarHandle preferred_blit_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("preferred_blit_mode"));

    public static VarHandle preferred_blit_mode$VH() {
        return GvoxParseAdapterDetails.preferred_blit_mode$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * GvoxBlitMode preferred_blit_mode;
     *}
     */
    public static int preferred_blit_mode$get(MemorySegment seg) {
        return (int) GvoxParseAdapterDetails.preferred_blit_mode$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * GvoxBlitMode preferred_blit_mode;
     *}
     */
    public static void preferred_blit_mode$set(MemorySegment seg, int x) {
        GvoxParseAdapterDetails.preferred_blit_mode$VH.set(seg, x);
    }

    public static int preferred_blit_mode$get(MemorySegment seg, long index) {
        return (int) GvoxParseAdapterDetails.preferred_blit_mode$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void preferred_blit_mode$set(MemorySegment seg, long index, int x) {
        GvoxParseAdapterDetails.preferred_blit_mode$VH.set(seg.asSlice(index * sizeof()), x);
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


