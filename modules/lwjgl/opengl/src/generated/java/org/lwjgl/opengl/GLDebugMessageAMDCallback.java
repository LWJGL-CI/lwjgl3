/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLDEBUGPROCAMD} */
public abstract class GLDebugMessageAMDCallback extends Callback implements GLDebugMessageAMDCallbackI {

    /**
     * Creates a {@code GLDebugMessageAMDCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLDebugMessageAMDCallback}
     */
    public static GLDebugMessageAMDCallback create(long functionPointer) {
        GLDebugMessageAMDCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLDebugMessageAMDCallback
            ? (GLDebugMessageAMDCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLDebugMessageAMDCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLDebugMessageAMDCallback} instance that delegates to the specified {@code GLDebugMessageAMDCallbackI} instance. */
    public static GLDebugMessageAMDCallback create(GLDebugMessageAMDCallbackI instance) {
        return instance instanceof GLDebugMessageAMDCallback
            ? (GLDebugMessageAMDCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLDebugMessageAMDCallback() {
        super(CIF);
    }

    GLDebugMessageAMDCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link GLDebugMessageAMDCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageAMDCallback invocation.</p>
     *
     * @param length  the GLDebugMessageAMDCallback {@code length} argument
     * @param message the GLDebugMessageAMDCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }

    private static final class Container extends GLDebugMessageAMDCallback {

        private final GLDebugMessageAMDCallbackI delegate;

        Container(long functionPointer, GLDebugMessageAMDCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int id, int category, int severity, int length, long message, long userParam) {
            delegate.invoke(id, category, severity, length, message, userParam);
        }

    }

}