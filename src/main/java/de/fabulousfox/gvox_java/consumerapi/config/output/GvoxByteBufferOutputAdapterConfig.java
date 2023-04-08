package de.fabulousfox.gvox_java.consumerapi.config.output;

import de.fabulousfox.gvox_java.consumerapi.GvoxBaseAdapterInfo;
import de.fabulousfox.gvox_java.nativelayer.__GvoxNativeRuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Consumer;

public class GvoxByteBufferOutputAdapterConfig implements GvoxBaseAdapterInfo {
    public MemorySegment bufferSizePointer;
    public MemorySegment bufferPointer;
    public MemorySegment allocate;

    public void setAllocationFunction(Consumer<Long> allocate) {
        try{
            MethodHandle handle = MethodHandles.lookup().findVirtual(allocate.getClass(), "accept", MethodType.methodType(void.class, long.class));
            MemorySegment nativeHandle = Linker.nativeLinker().upcallStub(handle, FunctionDescriptor.ofVoid(), __GvoxNativeRuntimeHelper.arena.scope());
            this.allocate = __GvoxNativeRuntimeHelper.arena.allocate(ValueLayout.ADDRESS.withBitAlignment(64).asUnbounded(), nativeHandle);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public long getBufferSize() {
        MemorySegment bufferSize = MemorySegment.ofAddress(bufferSizePointer.address(), 8);
        return bufferSize.get(ValueLayout.JAVA_LONG, 0);
    }

    public byte[] getBufferContent() {
        MemorySegment buffer = MemorySegment.ofAddress(bufferPointer.address(), getBufferSize());
        return buffer.asByteBuffer().array();
    }
}
