package de.fabulousfox.gvox_java.consumerapi.config.input;

import de.fabulousfox.gvox_java.consumerapi.GvoxBaseAdapterInfo;

import java.lang.foreign.MemorySegment;

public class GvoxByteBufferInputAdapterConfig implements GvoxBaseAdapterInfo {
    public MemorySegment buffer = null;
}
