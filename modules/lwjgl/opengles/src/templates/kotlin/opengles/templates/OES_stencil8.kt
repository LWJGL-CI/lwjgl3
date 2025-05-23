/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_stencil8 = "OESStencil8".nativeClassGLES("OES_stencil8", postfix = OES) {
    IntConstant(
        "STENCIL_INDEX8_OES"..0x8D48
    )
}