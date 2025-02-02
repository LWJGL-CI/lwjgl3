/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke EGLSetBlobFuncANDROID} */
public abstract class EGLSetBlobFuncANDROID extends Callback implements EGLSetBlobFuncANDROIDI {

    /**
     * Creates a {@code EGLSetBlobFuncANDROID} instance from the specified function pointer.
     *
     * @return the new {@code EGLSetBlobFuncANDROID}
     */
    public static EGLSetBlobFuncANDROID create(long functionPointer) {
        EGLSetBlobFuncANDROIDI instance = Callback.get(functionPointer);
        return instance instanceof EGLSetBlobFuncANDROID
            ? (EGLSetBlobFuncANDROID)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable EGLSetBlobFuncANDROID createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code EGLSetBlobFuncANDROID} instance that delegates to the specified {@code EGLSetBlobFuncANDROIDI} instance. */
    public static EGLSetBlobFuncANDROID create(EGLSetBlobFuncANDROIDI instance) {
        return instance instanceof EGLSetBlobFuncANDROID
            ? (EGLSetBlobFuncANDROID)instance
            : new Container(instance.address(), instance);
    }

    protected EGLSetBlobFuncANDROID() {
        super(CIF);
    }

    EGLSetBlobFuncANDROID(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends EGLSetBlobFuncANDROID {

        private final EGLSetBlobFuncANDROIDI delegate;

        Container(long functionPointer, EGLSetBlobFuncANDROIDI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long key, long keySize, long value, long valueSize) {
            delegate.invoke(key, keySize, value, valueSize);
        }

    }

}