/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_WebConsole_t {
 *     WebConsoleHandle_t webConsoleHandle;
 * }</code></pre>
 */
@NativeType("struct VREvent_WebConsole_t")
public class VREventWebConsole extends Struct<VREventWebConsole> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WEBCONSOLEHANDLE;

    static {
        Layout layout = __struct(
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WEBCONSOLEHANDLE = layout.offsetof(0);
    }

    protected VREventWebConsole(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventWebConsole create(long address, @Nullable ByteBuffer container) {
        return new VREventWebConsole(address, container);
    }

    /**
     * Creates a {@code VREventWebConsole} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventWebConsole(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code webConsoleHandle} field. */
    @NativeType("WebConsoleHandle_t")
    public long webConsoleHandle() { return nwebConsoleHandle(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventWebConsole} instance for the specified memory address. */
    public static VREventWebConsole create(long address) {
        return new VREventWebConsole(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREventWebConsole createSafe(long address) {
        return address == NULL ? null : new VREventWebConsole(address, null);
    }

    /**
     * Create a {@link VREventWebConsole.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventWebConsole.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREventWebConsole.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #webConsoleHandle}. */
    public static long nwebConsoleHandle(long struct) { return memGetLong(struct + VREventWebConsole.WEBCONSOLEHANDLE); }

    // -----------------------------------

    /** An array of {@link VREventWebConsole} structs. */
    public static class Buffer extends StructBuffer<VREventWebConsole, Buffer> {

        private static final VREventWebConsole ELEMENT_FACTORY = VREventWebConsole.create(-1L);

        /**
         * Creates a new {@code VREventWebConsole.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventWebConsole#SIZEOF}, and its mark will be undefined.</p>
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
        protected VREventWebConsole getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code webConsoleHandle} field. */
        @NativeType("WebConsoleHandle_t")
        public long webConsoleHandle() { return VREventWebConsole.nwebConsoleHandle(address()); }

    }

}