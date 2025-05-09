/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke extent_split_t} */
public abstract class ExtentSplit extends Callback implements ExtentSplitI {

    /**
     * Creates a {@code ExtentSplit} instance from the specified function pointer.
     *
     * @return the new {@code ExtentSplit}
     */
    public static ExtentSplit create(long functionPointer) {
        ExtentSplitI instance = Callback.get(functionPointer);
        return instance instanceof ExtentSplit
            ? (ExtentSplit)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExtentSplit createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ExtentSplit} instance that delegates to the specified {@code ExtentSplitI} instance. */
    public static ExtentSplit create(ExtentSplitI instance) {
        return instance instanceof ExtentSplit
            ? (ExtentSplit)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentSplit() {
        super(CIF);
    }

    ExtentSplit(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentSplit {

        private final ExtentSplitI delegate;

        Container(long functionPointer, ExtentSplitI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, long size_a, long size_b, boolean committed, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, size_a, size_b, committed, arena_ind);
        }

    }

}