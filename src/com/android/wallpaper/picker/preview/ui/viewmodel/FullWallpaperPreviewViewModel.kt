/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.wallpaper.picker.preview.ui.viewmodel

import android.graphics.Point
import com.android.wallpaper.picker.data.WallpaperModel
import com.android.wallpaper.util.WallpaperConnection.WhichPreview

/** Information needed to bind a wallpaper in the full preview. */
data class FullWallpaperPreviewViewModel(
    /** The wallpaper model to preview. */
    val wallpaper: WallpaperModel,
    /** Configuration for a full preview. */
    val config: FullPreviewConfigViewModel,
    /** The display size the preview is based on. */
    val displaySize: Point,
    /** Whether to enable user cropping on the given wallpaper. */
    val allowUserCropping: Boolean,
    /** Different possible scenarios for the preview. */
    val whichPreview: WhichPreview,
)