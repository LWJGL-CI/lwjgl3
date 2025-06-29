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
 * struct VkQueueFamilyOwnershipTransferPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t optimalImageTransferToQueueFamilies;
 * }}</pre>
 */
public class VkQueueFamilyOwnershipTransferPropertiesKHR extends Struct<VkQueueFamilyOwnershipTransferPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OPTIMALIMAGETRANSFERTOQUEUEFAMILIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OPTIMALIMAGETRANSFERTOQUEUEFAMILIES = layout.offsetof(2);
    }

    protected VkQueueFamilyOwnershipTransferPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyOwnershipTransferPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyOwnershipTransferPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyOwnershipTransferPropertiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code optimalImageTransferToQueueFamilies} field. */
    @NativeType("uint32_t")
    public int optimalImageTransferToQueueFamilies() { return noptimalImageTransferToQueueFamilies(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkQueueFamilyOwnershipTransferPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance9#VK_STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkQueueFamilyOwnershipTransferPropertiesKHR sType$Default() { return sType(KHRMaintenance9.VK_STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkQueueFamilyOwnershipTransferPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyOwnershipTransferPropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueueFamilyOwnershipTransferPropertiesKHR set(VkQueueFamilyOwnershipTransferPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyOwnershipTransferPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR malloc() {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyOwnershipTransferPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR calloc() {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyOwnershipTransferPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyOwnershipTransferPropertiesKHR} instance for the specified memory address. */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR create(long address) {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkQueueFamilyOwnershipTransferPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyOwnershipTransferPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyOwnershipTransferPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR malloc(MemoryStack stack) {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyOwnershipTransferPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR calloc(MemoryStack stack) {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkQueueFamilyOwnershipTransferPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyOwnershipTransferPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #optimalImageTransferToQueueFamilies}. */
    public static int noptimalImageTransferToQueueFamilies(long struct) { return memGetInt(struct + VkQueueFamilyOwnershipTransferPropertiesKHR.OPTIMALIMAGETRANSFERTOQUEUEFAMILIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkQueueFamilyOwnershipTransferPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyOwnershipTransferPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyOwnershipTransferPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyOwnershipTransferPropertiesKHR, Buffer> implements NativeResource {

        private static final VkQueueFamilyOwnershipTransferPropertiesKHR ELEMENT_FACTORY = VkQueueFamilyOwnershipTransferPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyOwnershipTransferPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyOwnershipTransferPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyOwnershipTransferPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyOwnershipTransferPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code optimalImageTransferToQueueFamilies} field. */
        @NativeType("uint32_t")
        public int optimalImageTransferToQueueFamilies() { return VkQueueFamilyOwnershipTransferPropertiesKHR.noptimalImageTransferToQueueFamilies(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyOwnershipTransferPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance9#VK_STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer sType$Default() { return sType(KHRMaintenance9.VK_STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkQueueFamilyOwnershipTransferPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyOwnershipTransferPropertiesKHR.npNext(address(), value); return this; }

    }

}