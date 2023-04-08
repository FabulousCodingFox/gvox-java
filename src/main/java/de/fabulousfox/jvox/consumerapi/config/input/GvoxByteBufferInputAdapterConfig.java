package de.fabulousfox.jvox.consumerapi.config.input;

import de.fabulousfox.jvox.consumerapi.GvoxBaseAdapterInfo;

import java.lang.foreign.MemorySegment;

public class GvoxByteBufferInputAdapterConfig implements GvoxBaseAdapterInfo {
    public MemorySegment buffer = null;
}
