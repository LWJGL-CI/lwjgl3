/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct nk_text_undo_record {
 *     int where;
 *     short insert_length;
 *     short delete_length;
 *     short char_storage;
 * }}</pre>
 */
@NativeType("struct nk_text_undo_record")
public class NkTextUndoRecord extends Struct<NkTextUndoRecord> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WHERE,
        INSERT_LENGTH,
        DELETE_LENGTH,
        CHAR_STORAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WHERE = layout.offsetof(0);
        INSERT_LENGTH = layout.offsetof(1);
        DELETE_LENGTH = layout.offsetof(2);
        CHAR_STORAGE = layout.offsetof(3);
    }

    protected NkTextUndoRecord(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkTextUndoRecord create(long address, @Nullable ByteBuffer container) {
        return new NkTextUndoRecord(address, container);
    }

    /**
     * Creates a {@code NkTextUndoRecord} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkTextUndoRecord(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code where} field. */
    public int where() { return nwhere(address()); }
    /** @return the value of the {@code insert_length} field. */
    public short insert_length() { return ninsert_length(address()); }
    /** @return the value of the {@code delete_length} field. */
    public short delete_length() { return ndelete_length(address()); }
    /** @return the value of the {@code char_storage} field. */
    public short char_storage() { return nchar_storage(address()); }

    // -----------------------------------

    /** Returns a new {@code NkTextUndoRecord} instance for the specified memory address. */
    public static NkTextUndoRecord create(long address) {
        return new NkTextUndoRecord(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkTextUndoRecord createSafe(long address) {
        return address == NULL ? null : new NkTextUndoRecord(address, null);
    }

    /**
     * Create a {@link NkTextUndoRecord.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkTextUndoRecord.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkTextUndoRecord.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #where}. */
    public static int nwhere(long struct) { return memGetInt(struct + NkTextUndoRecord.WHERE); }
    /** Unsafe version of {@link #insert_length}. */
    public static short ninsert_length(long struct) { return memGetShort(struct + NkTextUndoRecord.INSERT_LENGTH); }
    /** Unsafe version of {@link #delete_length}. */
    public static short ndelete_length(long struct) { return memGetShort(struct + NkTextUndoRecord.DELETE_LENGTH); }
    /** Unsafe version of {@link #char_storage}. */
    public static short nchar_storage(long struct) { return memGetShort(struct + NkTextUndoRecord.CHAR_STORAGE); }

    // -----------------------------------

    /** An array of {@link NkTextUndoRecord} structs. */
    public static class Buffer extends StructBuffer<NkTextUndoRecord, Buffer> {

        private static final NkTextUndoRecord ELEMENT_FACTORY = NkTextUndoRecord.create(-1L);

        /**
         * Creates a new {@code NkTextUndoRecord.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkTextUndoRecord#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkTextUndoRecord getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code where} field. */
        public int where() { return NkTextUndoRecord.nwhere(address()); }
        /** @return the value of the {@code insert_length} field. */
        public short insert_length() { return NkTextUndoRecord.ninsert_length(address()); }
        /** @return the value of the {@code delete_length} field. */
        public short delete_length() { return NkTextUndoRecord.ndelete_length(address()); }
        /** @return the value of the {@code char_storage} field. */
        public short char_storage() { return NkTextUndoRecord.nchar_storage(address()); }

    }

}