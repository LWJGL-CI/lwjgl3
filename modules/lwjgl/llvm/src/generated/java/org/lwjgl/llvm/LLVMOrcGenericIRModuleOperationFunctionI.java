/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke LLVMOrcGenericIRModuleOperationFunction} */
@FunctionalInterface
@NativeType("LLVMOrcGenericIRModuleOperationFunction")
public interface LLVMOrcGenericIRModuleOperationFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code LLVMErrorRef (* LLVMOrcGenericIRModuleOperationFunction) (void * Ctx, LLVMModuleRef M)} */
    @NativeType("LLVMErrorRef") long invoke(@NativeType("void *") long Ctx, @NativeType("LLVMModuleRef") long M);

}