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
 * struct VkImageSparseMemoryRequirementsInfo2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage image;
 * }}</pre>
 */
public class VkImageSparseMemoryRequirementsInfo2 extends Struct<VkImageSparseMemoryRequirementsInfo2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
    }

    protected VkImageSparseMemoryRequirementsInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageSparseMemoryRequirementsInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkImageSparseMemoryRequirementsInfo2(address, container);
    }

    /**
     * Creates a {@code VkImageSparseMemoryRequirementsInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSparseMemoryRequirementsInfo2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageSparseMemoryRequirementsInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2} value to the {@code sType} field. */
    public VkImageSparseMemoryRequirementsInfo2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageSparseMemoryRequirementsInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkImageSparseMemoryRequirementsInfo2 image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageSparseMemoryRequirementsInfo2 set(
        int sType,
        long pNext,
        long image
    ) {
        sType(sType);
        pNext(pNext);
        image(image);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSparseMemoryRequirementsInfo2 set(VkImageSparseMemoryRequirementsInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageSparseMemoryRequirementsInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSparseMemoryRequirementsInfo2 malloc() {
        return new VkImageSparseMemoryRequirementsInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageSparseMemoryRequirementsInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSparseMemoryRequirementsInfo2 calloc() {
        return new VkImageSparseMemoryRequirementsInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageSparseMemoryRequirementsInfo2} instance allocated with {@link BufferUtils}. */
    public static VkImageSparseMemoryRequirementsInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSparseMemoryRequirementsInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkImageSparseMemoryRequirementsInfo2} instance for the specified memory address. */
    public static VkImageSparseMemoryRequirementsInfo2 create(long address) {
        return new VkImageSparseMemoryRequirementsInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageSparseMemoryRequirementsInfo2 createSafe(long address) {
        return address == NULL ? null : new VkImageSparseMemoryRequirementsInfo2(address, null);
    }

    /**
     * Returns a new {@link VkImageSparseMemoryRequirementsInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSparseMemoryRequirementsInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageSparseMemoryRequirementsInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSparseMemoryRequirementsInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSparseMemoryRequirementsInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSparseMemoryRequirementsInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageSparseMemoryRequirementsInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageSparseMemoryRequirementsInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageSparseMemoryRequirementsInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSparseMemoryRequirementsInfo2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSparseMemoryRequirementsInfo2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSparseMemoryRequirementsInfo2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSparseMemoryRequirementsInfo2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSparseMemoryRequirementsInfo2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSparseMemoryRequirementsInfo2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSparseMemoryRequirementsInfo2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSparseMemoryRequirementsInfo2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageSparseMemoryRequirementsInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSparseMemoryRequirementsInfo2 malloc(MemoryStack stack) {
        return new VkImageSparseMemoryRequirementsInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageSparseMemoryRequirementsInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSparseMemoryRequirementsInfo2 calloc(MemoryStack stack) {
        return new VkImageSparseMemoryRequirementsInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageSparseMemoryRequirementsInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSparseMemoryRequirementsInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSparseMemoryRequirementsInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSparseMemoryRequirementsInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageSparseMemoryRequirementsInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageSparseMemoryRequirementsInfo2.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkImageSparseMemoryRequirementsInfo2.IMAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageSparseMemoryRequirementsInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageSparseMemoryRequirementsInfo2.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkImageSparseMemoryRequirementsInfo2.IMAGE, value); }

    // -----------------------------------

    /** An array of {@link VkImageSparseMemoryRequirementsInfo2} structs. */
    public static class Buffer extends StructBuffer<VkImageSparseMemoryRequirementsInfo2, Buffer> implements NativeResource {

        private static final VkImageSparseMemoryRequirementsInfo2 ELEMENT_FACTORY = VkImageSparseMemoryRequirementsInfo2.create(-1L);

        /**
         * Creates a new {@code VkImageSparseMemoryRequirementsInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSparseMemoryRequirementsInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageSparseMemoryRequirementsInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageSparseMemoryRequirementsInfo2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageSparseMemoryRequirementsInfo2.npNext(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageSparseMemoryRequirementsInfo2.nimage(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageSparseMemoryRequirementsInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkImageSparseMemoryRequirementsInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2} value to the {@code sType} field. */
        public VkImageSparseMemoryRequirementsInfo2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageSparseMemoryRequirementsInfo2.Buffer pNext(@NativeType("void const *") long value) { VkImageSparseMemoryRequirementsInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkImageSparseMemoryRequirementsInfo2.Buffer image(@NativeType("VkImage") long value) { VkImageSparseMemoryRequirementsInfo2.nimage(address(), value); return this; }

    }

}