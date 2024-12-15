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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure enumerating image layouts supported by an implementation for host memory copies.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceHostImageCopyProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>If {@code pCopyDstLayouts} is {@code NULL}, then the number of image layouts that are supported in {@link VkCopyMemoryToImageInfo}{@code ::dstImageLayout} and {@link VkCopyImageToImageInfo}{@code ::dstImageLayout} is returned in {@code copyDstLayoutCount}. Otherwise, {@code copyDstLayoutCount} <b>must</b> be set by the application to the number of elements in the {@code pCopyDstLayouts} array, and on return the variable is overwritten with the number of values actually written to {@code pCopyDstLayouts}. If the value of {@code copyDstLayoutCount} is less than the number of image layouts that are supported, at most {@code copyDstLayoutCount} values will be written to {@code pCopyDstLayouts}. The implementation <b>must</b> include the {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} image layout in {@code pCopyDstLayouts}.</p>
 * 
 * <p>If {@code pCopySrcLayouts} is {@code NULL}, then the number of image layouts that are supported in {@link VkCopyImageToMemoryInfo}{@code ::srcImageLayout} and {@link VkCopyImageToImageInfo}{@code ::srcImageLayout} is returned in {@code copySrcLayoutCount}. Otherwise, {@code copySrcLayoutCount} <b>must</b> be set by the application to the number of elements in the {@code pCopySrcLayouts} array, and on return the variable is overwritten with the number of values actually written to {@code pCopySrcLayouts}. If the value of {@code copySrcLayoutCount} is less than the number of image layouts that are supported, at most {@code copySrcLayoutCount} values will be written to {@code pCopySrcLayouts}. The implementation <b>must</b> include the {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} image layout in {@code pCopySrcLayouts}.</p>
 * 
 * <p>The {@code optimalTilingLayoutUUID} value can be used to ensure compatible data layouts when using the {@link VK14#VK_HOST_IMAGE_COPY_MEMCPY HOST_IMAGE_COPY_MEMCPY} flag in {@link VK14#vkCopyMemoryToImage CopyMemoryToImage} and {@link VK14#vkCopyImageToMemory CopyImageToMemory}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES}</li>
 * <li>If {@code copySrcLayoutCount} is not 0, and {@code pCopySrcLayouts} is not {@code NULL}, {@code pCopySrcLayouts} <b>must</b> be a valid pointer to an array of {@code copySrcLayoutCount} {@code VkImageLayout} values</li>
 * <li>If {@code copyDstLayoutCount} is not 0, and {@code pCopyDstLayouts} is not {@code NULL}, {@code pCopyDstLayouts} <b>must</b> be a valid pointer to an array of {@code copyDstLayoutCount} {@code VkImageLayout} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceHostImageCopyProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #copySrcLayoutCount};
 *     VkImageLayout * {@link #pCopySrcLayouts};
 *     uint32_t {@link #copyDstLayoutCount};
 *     VkImageLayout * {@link #pCopyDstLayouts};
 *     uint8_t {@link #optimalTilingLayoutUUID}[VK_UUID_SIZE];
 *     VkBool32 {@link #identicalMemoryTypeRequirements};
 * }</code></pre>
 */
public class VkPhysicalDeviceHostImageCopyProperties extends Struct<VkPhysicalDeviceHostImageCopyProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COPYSRCLAYOUTCOUNT,
        PCOPYSRCLAYOUTS,
        COPYDSTLAYOUTCOUNT,
        PCOPYDSTLAYOUTS,
        OPTIMALTILINGLAYOUTUUID,
        IDENTICALMEMORYTYPEREQUIREMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COPYSRCLAYOUTCOUNT = layout.offsetof(2);
        PCOPYSRCLAYOUTS = layout.offsetof(3);
        COPYDSTLAYOUTCOUNT = layout.offsetof(4);
        PCOPYDSTLAYOUTS = layout.offsetof(5);
        OPTIMALTILINGLAYOUTUUID = layout.offsetof(6);
        IDENTICALMEMORYTYPEREQUIREMENTS = layout.offsetof(7);
    }

    protected VkPhysicalDeviceHostImageCopyProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceHostImageCopyProperties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceHostImageCopyProperties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceHostImageCopyProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceHostImageCopyProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an integer related to the number of image layouts for host copies from images available or queried, as described below. */
    @NativeType("uint32_t")
    public int copySrcLayoutCount() { return ncopySrcLayoutCount(address()); }
    /** a pointer to an array of {@code VkImageLayout} in which supported image layouts for use with host copy operations from images are returned. */
    @NativeType("VkImageLayout *")
    public @Nullable IntBuffer pCopySrcLayouts() { return npCopySrcLayouts(address()); }
    /** an integer related to the number of image layouts for host copies to images available or queried, as described below. */
    @NativeType("uint32_t")
    public int copyDstLayoutCount() { return ncopyDstLayoutCount(address()); }
    /** a pointer to an array of {@code VkImageLayout} in which supported image layouts for use with host copy operations to images are returned. */
    @NativeType("VkImageLayout *")
    public @Nullable IntBuffer pCopyDstLayouts() { return npCopyDstLayouts(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the implementation’s swizzling layout of images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer optimalTilingLayoutUUID() { return noptimalTilingLayoutUUID(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the implementation’s swizzling layout of images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}. */
    @NativeType("uint8_t")
    public byte optimalTilingLayoutUUID(int index) { return noptimalTilingLayoutUUID(address(), index); }
    /** indicates that specifying the {@link VK14#VK_IMAGE_USAGE_HOST_TRANSFER_BIT IMAGE_USAGE_HOST_TRANSFER_BIT} flag in {@link VkImageCreateInfo}{@code ::usage} does not affect the memory type requirements of the image. */
    @NativeType("VkBool32")
    public boolean identicalMemoryTypeRequirements() { return nidenticalMemoryTypeRequirements(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceHostImageCopyProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceHostImageCopyProperties sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceHostImageCopyProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #copySrcLayoutCount} field. */
    public VkPhysicalDeviceHostImageCopyProperties copySrcLayoutCount(@NativeType("uint32_t") int value) { ncopySrcLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pCopySrcLayouts} field. */
    public VkPhysicalDeviceHostImageCopyProperties pCopySrcLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { npCopySrcLayouts(address(), value); return this; }
    /** Sets the specified value to the {@link #copyDstLayoutCount} field. */
    public VkPhysicalDeviceHostImageCopyProperties copyDstLayoutCount(@NativeType("uint32_t") int value) { ncopyDstLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pCopyDstLayouts} field. */
    public VkPhysicalDeviceHostImageCopyProperties pCopyDstLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { npCopyDstLayouts(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #optimalTilingLayoutUUID} field. */
    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { noptimalTilingLayoutUUID(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #optimalTilingLayoutUUID} field. */
    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) { noptimalTilingLayoutUUID(address(), index, value); return this; }
    /** Sets the specified value to the {@link #identicalMemoryTypeRequirements} field. */
    public VkPhysicalDeviceHostImageCopyProperties identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) { nidenticalMemoryTypeRequirements(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceHostImageCopyProperties set(
        int sType,
        long pNext,
        int copySrcLayoutCount,
        @Nullable IntBuffer pCopySrcLayouts,
        int copyDstLayoutCount,
        @Nullable IntBuffer pCopyDstLayouts,
        ByteBuffer optimalTilingLayoutUUID,
        boolean identicalMemoryTypeRequirements
    ) {
        sType(sType);
        pNext(pNext);
        copySrcLayoutCount(copySrcLayoutCount);
        pCopySrcLayouts(pCopySrcLayouts);
        copyDstLayoutCount(copyDstLayoutCount);
        pCopyDstLayouts(pCopyDstLayouts);
        optimalTilingLayoutUUID(optimalTilingLayoutUUID);
        identicalMemoryTypeRequirements(identicalMemoryTypeRequirements);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceHostImageCopyProperties set(VkPhysicalDeviceHostImageCopyProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostImageCopyProperties malloc() {
        return new VkPhysicalDeviceHostImageCopyProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostImageCopyProperties calloc() {
        return new VkPhysicalDeviceHostImageCopyProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceHostImageCopyProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostImageCopyProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceHostImageCopyProperties create(long address) {
        return new VkPhysicalDeviceHostImageCopyProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceHostImageCopyProperties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceHostImageCopyProperties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceHostImageCopyProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceHostImageCopyProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostImageCopyProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostImageCopyProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostImageCopyProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostImageCopyProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceHostImageCopyProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceHostImageCopyProperties.PNEXT); }
    /** Unsafe version of {@link #copySrcLayoutCount}. */
    public static int ncopySrcLayoutCount(long struct) { return memGetInt(struct + VkPhysicalDeviceHostImageCopyProperties.COPYSRCLAYOUTCOUNT); }
    /** Unsafe version of {@link #pCopySrcLayouts() pCopySrcLayouts}. */
    public static @Nullable IntBuffer npCopySrcLayouts(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPhysicalDeviceHostImageCopyProperties.PCOPYSRCLAYOUTS), ncopySrcLayoutCount(struct)); }
    /** Unsafe version of {@link #copyDstLayoutCount}. */
    public static int ncopyDstLayoutCount(long struct) { return memGetInt(struct + VkPhysicalDeviceHostImageCopyProperties.COPYDSTLAYOUTCOUNT); }
    /** Unsafe version of {@link #pCopyDstLayouts() pCopyDstLayouts}. */
    public static @Nullable IntBuffer npCopyDstLayouts(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPhysicalDeviceHostImageCopyProperties.PCOPYDSTLAYOUTS), ncopyDstLayoutCount(struct)); }
    /** Unsafe version of {@link #optimalTilingLayoutUUID}. */
    public static ByteBuffer noptimalTilingLayoutUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceHostImageCopyProperties.OPTIMALTILINGLAYOUTUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #optimalTilingLayoutUUID(int) optimalTilingLayoutUUID}. */
    public static byte noptimalTilingLayoutUUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceHostImageCopyProperties.OPTIMALTILINGLAYOUTUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #identicalMemoryTypeRequirements}. */
    public static int nidenticalMemoryTypeRequirements(long struct) { return memGetInt(struct + VkPhysicalDeviceHostImageCopyProperties.IDENTICALMEMORYTYPEREQUIREMENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceHostImageCopyProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceHostImageCopyProperties.PNEXT, value); }
    /** Sets the specified value to the {@code copySrcLayoutCount} field of the specified {@code struct}. */
    public static void ncopySrcLayoutCount(long struct, int value) { memPutInt(struct + VkPhysicalDeviceHostImageCopyProperties.COPYSRCLAYOUTCOUNT, value); }
    /** Unsafe version of {@link #pCopySrcLayouts(IntBuffer) pCopySrcLayouts}. */
    public static void npCopySrcLayouts(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPhysicalDeviceHostImageCopyProperties.PCOPYSRCLAYOUTS, memAddressSafe(value)); if (value != null) { ncopySrcLayoutCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code copyDstLayoutCount} field of the specified {@code struct}. */
    public static void ncopyDstLayoutCount(long struct, int value) { memPutInt(struct + VkPhysicalDeviceHostImageCopyProperties.COPYDSTLAYOUTCOUNT, value); }
    /** Unsafe version of {@link #pCopyDstLayouts(IntBuffer) pCopyDstLayouts}. */
    public static void npCopyDstLayouts(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPhysicalDeviceHostImageCopyProperties.PCOPYDSTLAYOUTS, memAddressSafe(value)); if (value != null) { ncopyDstLayoutCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #optimalTilingLayoutUUID(ByteBuffer) optimalTilingLayoutUUID}. */
    public static void noptimalTilingLayoutUUID(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, VK_UUID_SIZE); }
        memCopy(memAddress(value), struct + VkPhysicalDeviceHostImageCopyProperties.OPTIMALTILINGLAYOUTUUID, value.remaining() * 1);
    }
    /** Unsafe version of {@link #optimalTilingLayoutUUID(int, byte) optimalTilingLayoutUUID}. */
    public static void noptimalTilingLayoutUUID(long struct, int index, byte value) {
        memPutByte(struct + VkPhysicalDeviceHostImageCopyProperties.OPTIMALTILINGLAYOUTUUID + check(index, VK_UUID_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #identicalMemoryTypeRequirements(boolean) identicalMemoryTypeRequirements}. */
    public static void nidenticalMemoryTypeRequirements(long struct, int value) { memPutInt(struct + VkPhysicalDeviceHostImageCopyProperties.IDENTICALMEMORYTYPEREQUIREMENTS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceHostImageCopyProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceHostImageCopyProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceHostImageCopyProperties ELEMENT_FACTORY = VkPhysicalDeviceHostImageCopyProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceHostImageCopyProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceHostImageCopyProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceHostImageCopyProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceHostImageCopyProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceHostImageCopyProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyProperties#copySrcLayoutCount} field. */
        @NativeType("uint32_t")
        public int copySrcLayoutCount() { return VkPhysicalDeviceHostImageCopyProperties.ncopySrcLayoutCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkPhysicalDeviceHostImageCopyProperties#pCopySrcLayouts} field. */
        @NativeType("VkImageLayout *")
        public @Nullable IntBuffer pCopySrcLayouts() { return VkPhysicalDeviceHostImageCopyProperties.npCopySrcLayouts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyProperties#copyDstLayoutCount} field. */
        @NativeType("uint32_t")
        public int copyDstLayoutCount() { return VkPhysicalDeviceHostImageCopyProperties.ncopyDstLayoutCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkPhysicalDeviceHostImageCopyProperties#pCopyDstLayouts} field. */
        @NativeType("VkImageLayout *")
        public @Nullable IntBuffer pCopyDstLayouts() { return VkPhysicalDeviceHostImageCopyProperties.npCopyDstLayouts(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceHostImageCopyProperties#optimalTilingLayoutUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer optimalTilingLayoutUUID() { return VkPhysicalDeviceHostImageCopyProperties.noptimalTilingLayoutUUID(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceHostImageCopyProperties#optimalTilingLayoutUUID} field. */
        @NativeType("uint8_t")
        public byte optimalTilingLayoutUUID(int index) { return VkPhysicalDeviceHostImageCopyProperties.noptimalTilingLayoutUUID(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyProperties#identicalMemoryTypeRequirements} field. */
        @NativeType("VkBool32")
        public boolean identicalMemoryTypeRequirements() { return VkPhysicalDeviceHostImageCopyProperties.nidenticalMemoryTypeRequirements(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyProperties#sType} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceHostImageCopyProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES} value to the {@link VkPhysicalDeviceHostImageCopyProperties#sType} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyProperties#pNext} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceHostImageCopyProperties.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyProperties#copySrcLayoutCount} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer copySrcLayoutCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyProperties.ncopySrcLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkPhysicalDeviceHostImageCopyProperties#pCopySrcLayouts} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer pCopySrcLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { VkPhysicalDeviceHostImageCopyProperties.npCopySrcLayouts(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyProperties#copyDstLayoutCount} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer copyDstLayoutCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyProperties.ncopyDstLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkPhysicalDeviceHostImageCopyProperties#pCopyDstLayouts} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer pCopyDstLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { VkPhysicalDeviceHostImageCopyProperties.npCopyDstLayouts(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link VkPhysicalDeviceHostImageCopyProperties#optimalTilingLayoutUUID} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { VkPhysicalDeviceHostImageCopyProperties.noptimalTilingLayoutUUID(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkPhysicalDeviceHostImageCopyProperties#optimalTilingLayoutUUID} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) { VkPhysicalDeviceHostImageCopyProperties.noptimalTilingLayoutUUID(address(), index, value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyProperties#identicalMemoryTypeRequirements} field. */
        public VkPhysicalDeviceHostImageCopyProperties.Buffer identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceHostImageCopyProperties.nidenticalMemoryTypeRequirements(address(), value ? 1 : 0); return this; }

    }

}