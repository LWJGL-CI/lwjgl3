/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceComputeShaderDerivativesFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 computeDerivativeGroupQuads;
 *     VkBool32 computeDerivativeGroupLinear;
 * }}</pre>
 */
public class VkPhysicalDeviceComputeShaderDerivativesFeaturesNV extends VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR {

    protected VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceComputeShaderDerivativesFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRComputeShaderDerivatives#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV sType$Default() { return sType(KHRComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code computeDerivativeGroupQuads} field. */
    @Override
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) { ncomputeDerivativeGroupQuads(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code computeDerivativeGroupLinear} field. */
    @Override
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) { ncomputeDerivativeGroupLinear(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV set(
        int sType,
        long pNext,
        boolean computeDerivativeGroupQuads,
        boolean computeDerivativeGroupLinear
    ) {
        sType(sType);
        pNext(pNext);
        computeDerivativeGroupQuads(computeDerivativeGroupQuads);
        computeDerivativeGroupLinear(computeDerivativeGroupLinear);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV set(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV malloc() {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV calloc() {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV create(long address) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceComputeShaderDerivativesFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} structs. */
    public static class Buffer extends VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer {

        private static final VkPhysicalDeviceComputeShaderDerivativesFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceComputeShaderDerivativesFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link KHRComputeShaderDerivatives#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer sType$Default() { return sType(KHRComputeShaderDerivatives.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code computeDerivativeGroupQuads} field. */
        @Override
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.ncomputeDerivativeGroupQuads(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code computeDerivativeGroupLinear} field. */
        @Override
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.Buffer computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesNV.ncomputeDerivativeGroupLinear(address(), value ? 1 : 0); return this; }

    }

}