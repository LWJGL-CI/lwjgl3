/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke rmtFreePtr} */
public abstract class RMTFree extends Callback implements RMTFreeI {

    /**
     * Creates a {@code RMTFree} instance from the specified function pointer.
     *
     * @return the new {@code RMTFree}
     */
    public static RMTFree create(long functionPointer) {
        RMTFreeI instance = Callback.get(functionPointer);
        return instance instanceof RMTFree
            ? (RMTFree)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RMTFree createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RMTFree} instance that delegates to the specified {@code RMTFreeI} instance. */
    public static RMTFree create(RMTFreeI instance) {
        return instance instanceof RMTFree
            ? (RMTFree)instance
            : new Container(instance.address(), instance);
    }

    protected RMTFree() {
        super(CIF);
    }

    RMTFree(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RMTFree {

        private final RMTFreeI delegate;

        Container(long functionPointer, RMTFreeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long mm_context, long ptr) {
            delegate.invoke(mm_context, ptr);
        }

    }

}