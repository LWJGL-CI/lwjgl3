/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke rmtReallocPtr} */
@FunctionalInterface
@NativeType("rmtReallocPtr")
public interface RMTReallocI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code void * (* rmtReallocPtr) (void * mm_context, void * ptr, rmtU32 size)} */
    @NativeType("void *") long invoke(@NativeType("void *") long mm_context, @NativeType("void *") long ptr, @NativeType("rmtU32") int size);

}