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
 * struct VkPhysicalDeviceVulkan11Features {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 storageBuffer16BitAccess;
 *     VkBool32 uniformAndStorageBuffer16BitAccess;
 *     VkBool32 storagePushConstant16;
 *     VkBool32 storageInputOutput16;
 *     VkBool32 multiview;
 *     VkBool32 multiviewGeometryShader;
 *     VkBool32 multiviewTessellationShader;
 *     VkBool32 variablePointersStorageBuffer;
 *     VkBool32 variablePointers;
 *     VkBool32 protectedMemory;
 *     VkBool32 samplerYcbcrConversion;
 *     VkBool32 shaderDrawParameters;
 * }}</pre>
 */
public class VkPhysicalDeviceVulkan11Features extends Struct<VkPhysicalDeviceVulkan11Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STORAGEBUFFER16BITACCESS,
        UNIFORMANDSTORAGEBUFFER16BITACCESS,
        STORAGEPUSHCONSTANT16,
        STORAGEINPUTOUTPUT16,
        MULTIVIEW,
        MULTIVIEWGEOMETRYSHADER,
        MULTIVIEWTESSELLATIONSHADER,
        VARIABLEPOINTERSSTORAGEBUFFER,
        VARIABLEPOINTERS,
        PROTECTEDMEMORY,
        SAMPLERYCBCRCONVERSION,
        SHADERDRAWPARAMETERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFER16BITACCESS = layout.offsetof(2);
        UNIFORMANDSTORAGEBUFFER16BITACCESS = layout.offsetof(3);
        STORAGEPUSHCONSTANT16 = layout.offsetof(4);
        STORAGEINPUTOUTPUT16 = layout.offsetof(5);
        MULTIVIEW = layout.offsetof(6);
        MULTIVIEWGEOMETRYSHADER = layout.offsetof(7);
        MULTIVIEWTESSELLATIONSHADER = layout.offsetof(8);
        VARIABLEPOINTERSSTORAGEBUFFER = layout.offsetof(9);
        VARIABLEPOINTERS = layout.offsetof(10);
        PROTECTEDMEMORY = layout.offsetof(11);
        SAMPLERYCBCRCONVERSION = layout.offsetof(12);
        SHADERDRAWPARAMETERS = layout.offsetof(13);
    }

    protected VkPhysicalDeviceVulkan11Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkan11Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkan11Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan11Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan11Features(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code storageBuffer16BitAccess} field. */
    @NativeType("VkBool32")
    public boolean storageBuffer16BitAccess() { return nstorageBuffer16BitAccess(address()) != 0; }
    /** @return the value of the {@code uniformAndStorageBuffer16BitAccess} field. */
    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer16BitAccess() { return nuniformAndStorageBuffer16BitAccess(address()) != 0; }
    /** @return the value of the {@code storagePushConstant16} field. */
    @NativeType("VkBool32")
    public boolean storagePushConstant16() { return nstoragePushConstant16(address()) != 0; }
    /** @return the value of the {@code storageInputOutput16} field. */
    @NativeType("VkBool32")
    public boolean storageInputOutput16() { return nstorageInputOutput16(address()) != 0; }
    /** @return the value of the {@code multiview} field. */
    @NativeType("VkBool32")
    public boolean multiview() { return nmultiview(address()) != 0; }
    /** @return the value of the {@code multiviewGeometryShader} field. */
    @NativeType("VkBool32")
    public boolean multiviewGeometryShader() { return nmultiviewGeometryShader(address()) != 0; }
    /** @return the value of the {@code multiviewTessellationShader} field. */
    @NativeType("VkBool32")
    public boolean multiviewTessellationShader() { return nmultiviewTessellationShader(address()) != 0; }
    /** @return the value of the {@code variablePointersStorageBuffer} field. */
    @NativeType("VkBool32")
    public boolean variablePointersStorageBuffer() { return nvariablePointersStorageBuffer(address()) != 0; }
    /** @return the value of the {@code variablePointers} field. */
    @NativeType("VkBool32")
    public boolean variablePointers() { return nvariablePointers(address()) != 0; }
    /** @return the value of the {@code protectedMemory} field. */
    @NativeType("VkBool32")
    public boolean protectedMemory() { return nprotectedMemory(address()) != 0; }
    /** @return the value of the {@code samplerYcbcrConversion} field. */
    @NativeType("VkBool32")
    public boolean samplerYcbcrConversion() { return nsamplerYcbcrConversion(address()) != 0; }
    /** @return the value of the {@code shaderDrawParameters} field. */
    @NativeType("VkBool32")
    public boolean shaderDrawParameters() { return nshaderDrawParameters(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan11Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan11Features sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVulkan11Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code storageBuffer16BitAccess} field. */
    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code uniformAndStorageBuffer16BitAccess} field. */
    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code storagePushConstant16} field. */
    public VkPhysicalDeviceVulkan11Features storagePushConstant16(@NativeType("VkBool32") boolean value) { nstoragePushConstant16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code storageInputOutput16} field. */
    public VkPhysicalDeviceVulkan11Features storageInputOutput16(@NativeType("VkBool32") boolean value) { nstorageInputOutput16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiview} field. */
    public VkPhysicalDeviceVulkan11Features multiview(@NativeType("VkBool32") boolean value) { nmultiview(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiviewGeometryShader} field. */
    public VkPhysicalDeviceVulkan11Features multiviewGeometryShader(@NativeType("VkBool32") boolean value) { nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multiviewTessellationShader} field. */
    public VkPhysicalDeviceVulkan11Features multiviewTessellationShader(@NativeType("VkBool32") boolean value) { nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
    public VkPhysicalDeviceVulkan11Features variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code variablePointers} field. */
    public VkPhysicalDeviceVulkan11Features variablePointers(@NativeType("VkBool32") boolean value) { nvariablePointers(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code protectedMemory} field. */
    public VkPhysicalDeviceVulkan11Features protectedMemory(@NativeType("VkBool32") boolean value) { nprotectedMemory(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code samplerYcbcrConversion} field. */
    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversion(@NativeType("VkBool32") boolean value) { nsamplerYcbcrConversion(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderDrawParameters} field. */
    public VkPhysicalDeviceVulkan11Features shaderDrawParameters(@NativeType("VkBool32") boolean value) { nshaderDrawParameters(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan11Features set(
        int sType,
        long pNext,
        boolean storageBuffer16BitAccess,
        boolean uniformAndStorageBuffer16BitAccess,
        boolean storagePushConstant16,
        boolean storageInputOutput16,
        boolean multiview,
        boolean multiviewGeometryShader,
        boolean multiviewTessellationShader,
        boolean variablePointersStorageBuffer,
        boolean variablePointers,
        boolean protectedMemory,
        boolean samplerYcbcrConversion,
        boolean shaderDrawParameters
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffer16BitAccess(storageBuffer16BitAccess);
        uniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess);
        storagePushConstant16(storagePushConstant16);
        storageInputOutput16(storageInputOutput16);
        multiview(multiview);
        multiviewGeometryShader(multiviewGeometryShader);
        multiviewTessellationShader(multiviewTessellationShader);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);
        protectedMemory(protectedMemory);
        samplerYcbcrConversion(samplerYcbcrConversion);
        shaderDrawParameters(shaderDrawParameters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan11Features set(VkPhysicalDeviceVulkan11Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan11Features malloc() {
        return new VkPhysicalDeviceVulkan11Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan11Features calloc() {
        return new VkPhysicalDeviceVulkan11Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan11Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan11Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Features} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan11Features create(long address) {
        return new VkPhysicalDeviceVulkan11Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkan11Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkan11Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan11Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkan11Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan11Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan11Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan11Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan11Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan11Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan11Features.PNEXT); }
    /** Unsafe version of {@link #storageBuffer16BitAccess}. */
    public static int nstorageBuffer16BitAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.STORAGEBUFFER16BITACCESS); }
    /** Unsafe version of {@link #uniformAndStorageBuffer16BitAccess}. */
    public static int nuniformAndStorageBuffer16BitAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.UNIFORMANDSTORAGEBUFFER16BITACCESS); }
    /** Unsafe version of {@link #storagePushConstant16}. */
    public static int nstoragePushConstant16(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.STORAGEPUSHCONSTANT16); }
    /** Unsafe version of {@link #storageInputOutput16}. */
    public static int nstorageInputOutput16(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.STORAGEINPUTOUTPUT16); }
    /** Unsafe version of {@link #multiview}. */
    public static int nmultiview(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.MULTIVIEW); }
    /** Unsafe version of {@link #multiviewGeometryShader}. */
    public static int nmultiviewGeometryShader(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.MULTIVIEWGEOMETRYSHADER); }
    /** Unsafe version of {@link #multiviewTessellationShader}. */
    public static int nmultiviewTessellationShader(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.MULTIVIEWTESSELLATIONSHADER); }
    /** Unsafe version of {@link #variablePointersStorageBuffer}. */
    public static int nvariablePointersStorageBuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERSSTORAGEBUFFER); }
    /** Unsafe version of {@link #variablePointers}. */
    public static int nvariablePointers(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERS); }
    /** Unsafe version of {@link #protectedMemory}. */
    public static int nprotectedMemory(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.PROTECTEDMEMORY); }
    /** Unsafe version of {@link #samplerYcbcrConversion}. */
    public static int nsamplerYcbcrConversion(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.SAMPLERYCBCRCONVERSION); }
    /** Unsafe version of {@link #shaderDrawParameters}. */
    public static int nshaderDrawParameters(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Features.SHADERDRAWPARAMETERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan11Features.PNEXT, value); }
    /** Unsafe version of {@link #storageBuffer16BitAccess(boolean) storageBuffer16BitAccess}. */
    public static void nstorageBuffer16BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.STORAGEBUFFER16BITACCESS, value); }
    /** Unsafe version of {@link #uniformAndStorageBuffer16BitAccess(boolean) uniformAndStorageBuffer16BitAccess}. */
    public static void nuniformAndStorageBuffer16BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.UNIFORMANDSTORAGEBUFFER16BITACCESS, value); }
    /** Unsafe version of {@link #storagePushConstant16(boolean) storagePushConstant16}. */
    public static void nstoragePushConstant16(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.STORAGEPUSHCONSTANT16, value); }
    /** Unsafe version of {@link #storageInputOutput16(boolean) storageInputOutput16}. */
    public static void nstorageInputOutput16(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.STORAGEINPUTOUTPUT16, value); }
    /** Unsafe version of {@link #multiview(boolean) multiview}. */
    public static void nmultiview(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.MULTIVIEW, value); }
    /** Unsafe version of {@link #multiviewGeometryShader(boolean) multiviewGeometryShader}. */
    public static void nmultiviewGeometryShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.MULTIVIEWGEOMETRYSHADER, value); }
    /** Unsafe version of {@link #multiviewTessellationShader(boolean) multiviewTessellationShader}. */
    public static void nmultiviewTessellationShader(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.MULTIVIEWTESSELLATIONSHADER, value); }
    /** Unsafe version of {@link #variablePointersStorageBuffer(boolean) variablePointersStorageBuffer}. */
    public static void nvariablePointersStorageBuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERSSTORAGEBUFFER, value); }
    /** Unsafe version of {@link #variablePointers(boolean) variablePointers}. */
    public static void nvariablePointers(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.VARIABLEPOINTERS, value); }
    /** Unsafe version of {@link #protectedMemory(boolean) protectedMemory}. */
    public static void nprotectedMemory(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.PROTECTEDMEMORY, value); }
    /** Unsafe version of {@link #samplerYcbcrConversion(boolean) samplerYcbcrConversion}. */
    public static void nsamplerYcbcrConversion(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.SAMPLERYCBCRCONVERSION, value); }
    /** Unsafe version of {@link #shaderDrawParameters(boolean) shaderDrawParameters}. */
    public static void nshaderDrawParameters(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Features.SHADERDRAWPARAMETERS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan11Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan11Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan11Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan11Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan11Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan11Features#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VkPhysicalDeviceVulkan11Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan11Features.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan11Features.npNext(address()); }
        /** @return the value of the {@code storageBuffer16BitAccess} field. */
        @NativeType("VkBool32")
        public boolean storageBuffer16BitAccess() { return VkPhysicalDeviceVulkan11Features.nstorageBuffer16BitAccess(address()) != 0; }
        /** @return the value of the {@code uniformAndStorageBuffer16BitAccess} field. */
        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer16BitAccess() { return VkPhysicalDeviceVulkan11Features.nuniformAndStorageBuffer16BitAccess(address()) != 0; }
        /** @return the value of the {@code storagePushConstant16} field. */
        @NativeType("VkBool32")
        public boolean storagePushConstant16() { return VkPhysicalDeviceVulkan11Features.nstoragePushConstant16(address()) != 0; }
        /** @return the value of the {@code storageInputOutput16} field. */
        @NativeType("VkBool32")
        public boolean storageInputOutput16() { return VkPhysicalDeviceVulkan11Features.nstorageInputOutput16(address()) != 0; }
        /** @return the value of the {@code multiview} field. */
        @NativeType("VkBool32")
        public boolean multiview() { return VkPhysicalDeviceVulkan11Features.nmultiview(address()) != 0; }
        /** @return the value of the {@code multiviewGeometryShader} field. */
        @NativeType("VkBool32")
        public boolean multiviewGeometryShader() { return VkPhysicalDeviceVulkan11Features.nmultiviewGeometryShader(address()) != 0; }
        /** @return the value of the {@code multiviewTessellationShader} field. */
        @NativeType("VkBool32")
        public boolean multiviewTessellationShader() { return VkPhysicalDeviceVulkan11Features.nmultiviewTessellationShader(address()) != 0; }
        /** @return the value of the {@code variablePointersStorageBuffer} field. */
        @NativeType("VkBool32")
        public boolean variablePointersStorageBuffer() { return VkPhysicalDeviceVulkan11Features.nvariablePointersStorageBuffer(address()) != 0; }
        /** @return the value of the {@code variablePointers} field. */
        @NativeType("VkBool32")
        public boolean variablePointers() { return VkPhysicalDeviceVulkan11Features.nvariablePointers(address()) != 0; }
        /** @return the value of the {@code protectedMemory} field. */
        @NativeType("VkBool32")
        public boolean protectedMemory() { return VkPhysicalDeviceVulkan11Features.nprotectedMemory(address()) != 0; }
        /** @return the value of the {@code samplerYcbcrConversion} field. */
        @NativeType("VkBool32")
        public boolean samplerYcbcrConversion() { return VkPhysicalDeviceVulkan11Features.nsamplerYcbcrConversion(address()) != 0; }
        /** @return the value of the {@code shaderDrawParameters} field. */
        @NativeType("VkBool32")
        public boolean shaderDrawParameters() { return VkPhysicalDeviceVulkan11Features.nshaderDrawParameters(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Features.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan11Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code storageBuffer16BitAccess} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nstorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code uniformAndStorageBuffer16BitAccess} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code storagePushConstant16} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer storagePushConstant16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nstoragePushConstant16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code storageInputOutput16} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer storageInputOutput16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nstorageInputOutput16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiview} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer multiview(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nmultiview(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiviewGeometryShader} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer multiviewGeometryShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nmultiviewGeometryShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multiviewTessellationShader} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer multiviewTessellationShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nmultiviewTessellationShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code variablePointers} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer variablePointers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nvariablePointers(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code protectedMemory} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer protectedMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nprotectedMemory(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code samplerYcbcrConversion} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer samplerYcbcrConversion(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nsamplerYcbcrConversion(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderDrawParameters} field. */
        public VkPhysicalDeviceVulkan11Features.Buffer shaderDrawParameters(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan11Features.nshaderDrawParameters(address(), value ? 1 : 0); return this; }

    }

}