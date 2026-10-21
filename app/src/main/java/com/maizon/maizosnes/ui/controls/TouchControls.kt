package com.maizon.maizosnes.ui.controls

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Stable composition boundary for the emulator's touch controls.
 *
 * The actual pointerInput gesture handling intentionally remains in
 * EmulatorUi.kt (TouchOverlay, GestureDpad and TouchButton), where it still
 * owns the existing SNES bit mapping and layout-editor behavior. This layer
 * only provides a reusable full-screen slot for that content; it does not
 * duplicate or intercept input logic.
 */
@Composable
fun MaizoTouchControls(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier.fillMaxSize(),
        content = content
    )
}
