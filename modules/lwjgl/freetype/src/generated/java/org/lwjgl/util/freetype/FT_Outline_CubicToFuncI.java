/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FT_Outline_CubicToFunc} */
@FunctionalInterface
@NativeType("FT_Outline_CubicToFunc")
public interface FT_Outline_CubicToFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code int (* FT_Outline_CubicToFunc) (FT_Vector const * control1, FT_Vector const * control2, FT_Vector const * to, void * user)} */
    int invoke(@NativeType("FT_Vector const *") long control1, @NativeType("FT_Vector const *") long control2, @NativeType("FT_Vector const *") long to, @NativeType("void *") long user);

}