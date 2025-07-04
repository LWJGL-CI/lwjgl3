/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openxr

import org.lwjgl.generator.*

fun XR_DEFINE_HANDLE(name: String) = WrappedPointerType(name)
fun XR_DEFINE_ATOM(name: String) = typedef(uint64_t, name)

val XrAsyncRequestIdFB = XR_DEFINE_ATOM("XrAsyncRequestIdFB")
val XrBool32 = PrimitiveType("XrBool32", PrimitiveMapping.BOOLEAN4)
val XrControllerModelKeyMSFT = XR_DEFINE_ATOM("XrControllerModelKeyMSFT")
val XrDuration = typedef(uint64_t, "XrDuration")
val XrFlags64 = typedef(uint64_t, "XrFlags64")
val XrPath = XR_DEFINE_ATOM("XrPath")
val XrRenderModelKeyFB = XR_DEFINE_ATOM("XrRenderModelKeyFB")
val XrSystemId = XR_DEFINE_ATOM("XrSystemId")
val XrTime = typedef(uint64_t, "XrTime")
val XrVersion = typedef(uint64_t, "XrVersion")

val PFN_xrVoidFunction = "PFN_xrVoidFunction".handle
val PFN_xrEglGetProcAddressMNDX = "PFN_xrEglGetProcAddressMNDX".handle

// TODO:
val wchar_t = CharType("wchar_t", CharMapping.UTF16)

// TODO:
val IUnknown = "IUnknown".opaque
val timespec = "struct timespec".opaque

// TODO: replace when/if we add xcb bindings
val xcb_connection_t = "xcb_connection_t".opaque
val xcb_glx_fbconfig_t = typedef(uint32_t, "xcb_glx_fbconfig_t")
val xcb_visualid_t = typedef(uint32_t, "xcb_visualid_t")
val xcb_glx_drawable_t = typedef(uint32_t, "xcb_glx_drawable_t")
val xcb_glx_context_t = typedef(uint32_t, "xcb_glx_context_t")

// XR_BD_spatial_sensing
val XrSpatialEntityIdBD = XR_DEFINE_ATOM("XrSpatialEntityIdBD")

// XR_EXT_future
val XrFutureEXT = typedef(uint64_t, "XrFutureEXT")

// XR_EXT_render_model
val XrRenderModelIdEXT = XR_DEFINE_ATOM("XrRenderModelIdEXT")

// XR_EXT_spatial_entity
val XrSpatialEntityIdEXT = XR_DEFINE_ATOM("XrSpatialEntityIdEXT")
val XrSpatialBufferIdEXT = XR_DEFINE_ATOM("XrSpatialBufferIdEXT")

// XR_FB_spatial_entity_user
val XrSpaceUserIdFB = typedef(uint64_t, "XrSpaceUserIdFB")

// XR_ML_compat
val MLCoordinateFrameUID = struct(Module.OPENXR, "MLCoordinateFrameUID", mutable = false) {
    uint64_t("data")[2]
}

// XR_ML_marker_understanding
val XrMarkerML = XR_DEFINE_ATOM("XrMarkerML")