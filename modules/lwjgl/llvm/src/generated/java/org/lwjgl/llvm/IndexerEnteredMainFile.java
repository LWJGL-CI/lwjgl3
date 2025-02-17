/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class IndexerEnteredMainFile extends Callback implements IndexerEnteredMainFileI {

    /**
     * Creates a {@code IndexerEnteredMainFile} instance from the specified function pointer.
     *
     * @return the new {@code IndexerEnteredMainFile}
     */
    public static IndexerEnteredMainFile create(long functionPointer) {
        IndexerEnteredMainFileI instance = Callback.get(functionPointer);
        return instance instanceof IndexerEnteredMainFile
            ? (IndexerEnteredMainFile)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerEnteredMainFile createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code IndexerEnteredMainFile} instance that delegates to the specified {@code IndexerEnteredMainFileI} instance. */
    public static IndexerEnteredMainFile create(IndexerEnteredMainFileI instance) {
        return instance instanceof IndexerEnteredMainFile
            ? (IndexerEnteredMainFile)instance
            : new Container(instance.address(), instance);
    }

    protected IndexerEnteredMainFile() {
        super(CIF);
    }

    IndexerEnteredMainFile(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends IndexerEnteredMainFile {

        private final IndexerEnteredMainFileI delegate;

        Container(long functionPointer, IndexerEnteredMainFileI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long client_data, long mainFile, long reserved) {
            return delegate.invoke(client_data, mainFile, reserved);
        }

    }

}