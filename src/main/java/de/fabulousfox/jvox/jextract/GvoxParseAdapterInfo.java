package de.fabulousfox.jvox.jextract;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

/**
 * {@snippet :
 * struct {
 *     GvoxAdapterBaseInfo base_info;
 *     GvoxParseAdapterDetails (*query_details)();
 *     GvoxRegionRange (*query_parsable_range)(GvoxBlitContext*,GvoxAdapterContext*);
 *     GvoxSample (*sample_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegion*,const GvoxOffset3D*,uint32_t);
 *     uint32_t (*query_region_flags)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
 *     GvoxRegion (*load_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
 *     void (*unload_region)(GvoxBlitContext*,GvoxAdapterContext*,GvoxRegion*);
 *     void (*parse_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
 * };
 *}
 */
public class GvoxParseAdapterInfo {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("name_str"),
                    Constants$root.C_POINTER$LAYOUT.withName("create"),
                    Constants$root.C_POINTER$LAYOUT.withName("destroy"),
                    Constants$root.C_POINTER$LAYOUT.withName("blit_begin"),
                    Constants$root.C_POINTER$LAYOUT.withName("blit_end")
            ).withName("base_info"),
            Constants$root.C_POINTER$LAYOUT.withName("query_details"),
            Constants$root.C_POINTER$LAYOUT.withName("query_parsable_range"),
            Constants$root.C_POINTER$LAYOUT.withName("sample_region"),
            Constants$root.C_POINTER$LAYOUT.withName("query_region_flags"),
            Constants$root.C_POINTER$LAYOUT.withName("load_region"),
            Constants$root.C_POINTER$LAYOUT.withName("unload_region"),
            Constants$root.C_POINTER$LAYOUT.withName("parse_region")
    );

    public static MemoryLayout $LAYOUT() {
        return GvoxParseAdapterInfo.$struct$LAYOUT;
    }

    public static MemorySegment base_info$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }

    static final FunctionDescriptor query_details$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("preferred_blit_mode")
    ));
    static final FunctionDescriptor query_details_UP$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("preferred_blit_mode")
    ));
    static final MethodHandle query_details_UP$MH = RuntimeHelper.upcallHandle(query_details.class, "apply", GvoxParseAdapterInfo.query_details_UP$FUNC);
    static final FunctionDescriptor query_details_DOWN$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("preferred_blit_mode")
    ));
    static final MethodHandle query_details_DOWN$MH = RuntimeHelper.downcallHandle(
            GvoxParseAdapterInfo.query_details_DOWN$FUNC
    );

    /**
     * {@snippet :
     * GvoxParseAdapterDetails (*query_details)();
     *}
     */
    public interface query_details {

        java.lang.foreign.MemorySegment apply();

        static MemorySegment allocate(query_details fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(GvoxParseAdapterInfo.query_details_UP$MH, fi, GvoxParseAdapterInfo.query_details$FUNC, scope);
        }

        static query_details ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.query_details_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle query_details$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("query_details"));

    public static VarHandle query_details$VH() {
        return GvoxParseAdapterInfo.query_details$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * GvoxParseAdapterDetails (*query_details)();
     *}
     */
    public static MemorySegment query_details$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.query_details$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * GvoxParseAdapterDetails (*query_details)();
     *}
     */
    public static void query_details$set(MemorySegment seg, MemorySegment x) {
        GvoxParseAdapterInfo.query_details$VH.set(seg, x);
    }

    public static MemorySegment query_details$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.query_details$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void query_details$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxParseAdapterInfo.query_details$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static query_details query_details(MemorySegment segment, SegmentScope scope) {
        return query_details.ofAddress(query_details$get(segment), scope);
    }

    static final FunctionDescriptor query_parsable_range$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
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
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor query_parsable_range_UP$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
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
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle query_parsable_range_UP$MH = RuntimeHelper.upcallHandle(query_parsable_range.class, "apply", GvoxParseAdapterInfo.query_parsable_range_UP$FUNC);
    static final FunctionDescriptor query_parsable_range_DOWN$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
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
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle query_parsable_range_DOWN$MH = RuntimeHelper.downcallHandle(
            GvoxParseAdapterInfo.query_parsable_range_DOWN$FUNC
    );

    /**
     * {@snippet :
     * GvoxRegionRange (*query_parsable_range)(GvoxBlitContext*,GvoxAdapterContext*);
     *}
     */
    public interface query_parsable_range {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);

        static MemorySegment allocate(query_parsable_range fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(GvoxParseAdapterInfo.query_parsable_range_UP$MH, fi, GvoxParseAdapterInfo.query_parsable_range$FUNC, scope);
        }

        static query_parsable_range ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.query_parsable_range_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle query_parsable_range$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("query_parsable_range"));

    public static VarHandle query_parsable_range$VH() {
        return GvoxParseAdapterInfo.query_parsable_range$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * GvoxRegionRange (*query_parsable_range)(GvoxBlitContext*,GvoxAdapterContext*);
     *}
     */
    public static MemorySegment query_parsable_range$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.query_parsable_range$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * GvoxRegionRange (*query_parsable_range)(GvoxBlitContext*,GvoxAdapterContext*);
     *}
     */
    public static void query_parsable_range$set(MemorySegment seg, MemorySegment x) {
        GvoxParseAdapterInfo.query_parsable_range$VH.set(seg, x);
    }

    public static MemorySegment query_parsable_range$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.query_parsable_range$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void query_parsable_range$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxParseAdapterInfo.query_parsable_range$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static query_parsable_range query_parsable_range(MemorySegment segment, SegmentScope scope) {
        return query_parsable_range.ofAddress(query_parsable_range$get(segment), scope);
    }

    static final FunctionDescriptor sample_region$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("data"),
                    Constants$root.C_CHAR$LAYOUT.withName("is_present"),
                    MemoryLayout.paddingLayout(24)
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor sample_region_UP$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("data"),
                    Constants$root.C_CHAR$LAYOUT.withName("is_present"),
                    MemoryLayout.paddingLayout(24)
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sample_region_UP$MH = RuntimeHelper.upcallHandle(sample_region.class, "apply", GvoxParseAdapterInfo.sample_region_UP$FUNC);
    static final FunctionDescriptor sample_region_DOWN$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("data"),
                    Constants$root.C_CHAR$LAYOUT.withName("is_present"),
                    MemoryLayout.paddingLayout(24)
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sample_region_DOWN$MH = RuntimeHelper.downcallHandle(
            GvoxParseAdapterInfo.sample_region_DOWN$FUNC
    );

    /**
     * {@snippet :
     * GvoxSample (*sample_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegion*,const GvoxOffset3D*,uint32_t);
     *}
     */
    public interface sample_region {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, int _x4);

        static MemorySegment allocate(sample_region fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(GvoxParseAdapterInfo.sample_region_UP$MH, fi, GvoxParseAdapterInfo.sample_region$FUNC, scope);
        }

        static sample_region ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, int __x4) -> {
                try {
                    return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.sample_region_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle sample_region$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sample_region"));

    public static VarHandle sample_region$VH() {
        return GvoxParseAdapterInfo.sample_region$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * GvoxSample (*sample_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegion*,const GvoxOffset3D*,uint32_t);
     *}
     */
    public static MemorySegment sample_region$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.sample_region$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * GvoxSample (*sample_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegion*,const GvoxOffset3D*,uint32_t);
     *}
     */
    public static void sample_region$set(MemorySegment seg, MemorySegment x) {
        GvoxParseAdapterInfo.sample_region$VH.set(seg, x);
    }

    public static MemorySegment sample_region$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.sample_region$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void sample_region$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxParseAdapterInfo.sample_region$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static sample_region sample_region(MemorySegment segment, SegmentScope scope) {
        return sample_region.ofAddress(sample_region$get(segment), scope);
    }

    static final FunctionDescriptor query_region_flags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor query_region_flags_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle query_region_flags_UP$MH = RuntimeHelper.upcallHandle(query_region_flags.class, "apply", GvoxParseAdapterInfo.query_region_flags_UP$FUNC);
    static final FunctionDescriptor query_region_flags_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle query_region_flags_DOWN$MH = RuntimeHelper.downcallHandle(
            GvoxParseAdapterInfo.query_region_flags_DOWN$FUNC
    );

    /**
     * {@snippet :
     * uint32_t (*query_region_flags)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public interface query_region_flags {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);

        static MemorySegment allocate(query_region_flags fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(GvoxParseAdapterInfo.query_region_flags_UP$MH, fi, GvoxParseAdapterInfo.query_region_flags$FUNC, scope);
        }

        static query_region_flags ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    return (int) GvoxParseAdapterInfo.query_region_flags_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle query_region_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("query_region_flags"));

    public static VarHandle query_region_flags$VH() {
        return GvoxParseAdapterInfo.query_region_flags$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * uint32_t (*query_region_flags)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static MemorySegment query_region_flags$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.query_region_flags$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * uint32_t (*query_region_flags)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static void query_region_flags$set(MemorySegment seg, MemorySegment x) {
        GvoxParseAdapterInfo.query_region_flags$VH.set(seg, x);
    }

    public static MemorySegment query_region_flags$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.query_region_flags$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void query_region_flags$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxParseAdapterInfo.query_region_flags$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static query_region_flags query_region_flags(MemorySegment segment, SegmentScope scope) {
        return query_region_flags.ofAddress(query_region_flags$get(segment), scope);
    }

    static final FunctionDescriptor load_region$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
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
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor load_region_UP$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
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
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle load_region_UP$MH = RuntimeHelper.upcallHandle(load_region.class, "apply", GvoxParseAdapterInfo.load_region_UP$FUNC);
    static final FunctionDescriptor load_region_DOWN$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
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
            ),
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle load_region_DOWN$MH = RuntimeHelper.downcallHandle(
            GvoxParseAdapterInfo.load_region_DOWN$FUNC
    );

    /**
     * {@snippet :
     * GvoxRegion (*load_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public interface load_region {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);

        static MemorySegment allocate(load_region fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(GvoxParseAdapterInfo.load_region_UP$MH, fi, GvoxParseAdapterInfo.load_region$FUNC, scope);
        }

        static load_region ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.load_region_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle load_region$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("load_region"));

    public static VarHandle load_region$VH() {
        return GvoxParseAdapterInfo.load_region$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * GvoxRegion (*load_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static MemorySegment load_region$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.load_region$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * GvoxRegion (*load_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static void load_region$set(MemorySegment seg, MemorySegment x) {
        GvoxParseAdapterInfo.load_region$VH.set(seg, x);
    }

    public static MemorySegment load_region$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.load_region$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void load_region$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxParseAdapterInfo.load_region$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static load_region load_region(MemorySegment segment, SegmentScope scope) {
        return load_region.ofAddress(load_region$get(segment), scope);
    }

    static final FunctionDescriptor unload_region$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor unload_region_UP$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unload_region_UP$MH = RuntimeHelper.upcallHandle(unload_region.class, "apply", GvoxParseAdapterInfo.unload_region_UP$FUNC);
    static final FunctionDescriptor unload_region_DOWN$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unload_region_DOWN$MH = RuntimeHelper.downcallHandle(
            GvoxParseAdapterInfo.unload_region_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*unload_region)(GvoxBlitContext*,GvoxAdapterContext*,GvoxRegion*);
     *}
     */
    public interface unload_region {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);

        static MemorySegment allocate(unload_region fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(GvoxParseAdapterInfo.unload_region_UP$MH, fi, GvoxParseAdapterInfo.unload_region$FUNC, scope);
        }

        static unload_region ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    GvoxParseAdapterInfo.unload_region_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle unload_region$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unload_region"));

    public static VarHandle unload_region$VH() {
        return GvoxParseAdapterInfo.unload_region$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*unload_region)(GvoxBlitContext*,GvoxAdapterContext*,GvoxRegion*);
     *}
     */
    public static MemorySegment unload_region$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.unload_region$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*unload_region)(GvoxBlitContext*,GvoxAdapterContext*,GvoxRegion*);
     *}
     */
    public static void unload_region$set(MemorySegment seg, MemorySegment x) {
        GvoxParseAdapterInfo.unload_region$VH.set(seg, x);
    }

    public static MemorySegment unload_region$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.unload_region$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void unload_region$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxParseAdapterInfo.unload_region$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static unload_region unload_region(MemorySegment segment, SegmentScope scope) {
        return unload_region.ofAddress(unload_region$get(segment), scope);
    }

    static final FunctionDescriptor parse_region$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor parse_region_UP$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle parse_region_UP$MH = RuntimeHelper.upcallHandle(parse_region.class, "apply", GvoxParseAdapterInfo.parse_region_UP$FUNC);
    static final FunctionDescriptor parse_region_DOWN$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle parse_region_DOWN$MH = RuntimeHelper.downcallHandle(
            GvoxParseAdapterInfo.parse_region_DOWN$FUNC
    );

    /**
     * {@snippet :
     * void (*parse_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public interface parse_region {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);

        static MemorySegment allocate(parse_region fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(GvoxParseAdapterInfo.parse_region_UP$MH, fi, GvoxParseAdapterInfo.parse_region$FUNC, scope);
        }

        static parse_region ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    GvoxParseAdapterInfo.parse_region_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle parse_region$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("parse_region"));

    public static VarHandle parse_region$VH() {
        return GvoxParseAdapterInfo.parse_region$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*parse_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static MemorySegment parse_region$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.parse_region$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*parse_region)(GvoxBlitContext*,GvoxAdapterContext*,const GvoxRegionRange*,uint32_t);
     *}
     */
    public static void parse_region$set(MemorySegment seg, MemorySegment x) {
        GvoxParseAdapterInfo.parse_region$VH.set(seg, x);
    }

    public static MemorySegment parse_region$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment) GvoxParseAdapterInfo.parse_region$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void parse_region$set(MemorySegment seg, long index, MemorySegment x) {
        GvoxParseAdapterInfo.parse_region$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static parse_region parse_region(MemorySegment segment, SegmentScope scope) {
        return parse_region.ofAddress(parse_region$get(segment), scope);
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


