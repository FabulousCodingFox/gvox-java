package de.fabulousfox.gvox_java.consumerapi.config.output;

import de.fabulousfox.gvox_java.consumerapi.GvoxBaseAdapterInfo;

import java.lang.foreign.MemorySegment;
import java.util.function.Consumer;

public class GvoxByteBufferOutputAdapterConfig implements GvoxBaseAdapterInfo {
    public MemorySegment bufferSizePointer;
    public MemorySegment bufferPointer;
    public MemorySegment allocate;

    public void setAllocationFunction(Consumer<Long> allocate) {
        //TODO
    }

    public long getBufferSize() {
        //TODO
        return 0;
    }

    public byte[] getBufferContent(){
        //TODO
        return new byte[(int) getBufferSize()];
    }
}
