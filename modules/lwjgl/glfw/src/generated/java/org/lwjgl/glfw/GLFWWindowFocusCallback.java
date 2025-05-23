/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Callback function: {@link #invoke GLFWwindowfocusfun} */
public abstract class GLFWWindowFocusCallback extends Callback implements GLFWWindowFocusCallbackI {

    /**
     * Creates a {@code GLFWWindowFocusCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowFocusCallback}
     */
    public static GLFWWindowFocusCallback create(long functionPointer) {
        GLFWWindowFocusCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWWindowFocusCallback
            ? (GLFWWindowFocusCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowFocusCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWWindowFocusCallback} instance that delegates to the specified {@code GLFWWindowFocusCallbackI} instance. */
    public static GLFWWindowFocusCallback create(GLFWWindowFocusCallbackI instance) {
        return instance instanceof GLFWWindowFocusCallback
            ? (GLFWWindowFocusCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWWindowFocusCallback() {
        super(CIF);
    }

    GLFWWindowFocusCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback}. */
    public GLFWWindowFocusCallback set(long window) {
        glfwSetWindowFocusCallback(window, this);
        return this;
    }

    private static final class Container extends GLFWWindowFocusCallback {

        private final GLFWWindowFocusCallbackI delegate;

        Container(long functionPointer, GLFWWindowFocusCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long window, boolean focused) {
            delegate.invoke(window, focused);
        }

    }

}