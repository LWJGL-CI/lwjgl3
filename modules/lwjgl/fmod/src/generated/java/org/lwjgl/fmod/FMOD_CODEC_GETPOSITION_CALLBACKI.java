/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FMOD_CODEC_GETPOSITION_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_CODEC_GETPOSITION_CALLBACK")
public interface FMOD_CODEC_GETPOSITION_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_CODEC_GETPOSITION_CALLBACK) (struct FMOD_CODEC_STATE * codec_state, unsigned int * position, FMOD_TIMEUNIT postype)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_CODEC_STATE *") long codec_state, @NativeType("unsigned int *") long position, @NativeType("FMOD_TIMEUNIT") int postype);

}