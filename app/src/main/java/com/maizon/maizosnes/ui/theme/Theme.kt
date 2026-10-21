package com.maizon.maizosnes.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val MaizoLightColors = lightColorScheme(
    primary = MaizoPrimary,
    onPrimary = Color.White,
    primaryContainer = MaizoPrimaryContainer,
    onPrimaryContainer = MaizoOnPrimaryContainer,
    secondary = MaizoSecondary,
    onSecondary = Color.White,
    secondaryContainer = MaizoSecondaryContainer,
    onSecondaryContainer = MaizoOnSecondaryContainer,
    background = MaizoBackground,
    onBackground = MaizoOnBackground,
    surface = MaizoSurface,
    onSurface = MaizoOnSurface,
    surfaceVariant = MaizoSurfaceRaised,
    onSurfaceVariant = MaizoMuted,
    outline = MaizoOutline
)

private val MaizoDarkColors = darkColorScheme(
    primary = Color(0xFF9BC7E8),
    onPrimary = Color(0xFF12324D),
    primaryContainer = Color(0xFF214B6D),
    onPrimaryContainer = Color(0xFFD9E9F5),
    secondary = Color(0xFF8AD0C5),
    onSecondary = Color(0xFF0E3A36),
    secondaryContainer = Color(0xFF18544D),
    onSecondaryContainer = Color(0xFFD7EFEB),
    background = Color(0xFF10171D),
    onBackground = Color(0xFFE7EEF3),
    surface = Color(0xFF17212B),
    onSurface = Color(0xFFE7EEF3),
    surfaceVariant = Color(0xFF2A3945),
    onSurfaceVariant = Color(0xFFC2D0DA),
    outline = Color(0xFF8A9BA8)
)

/**
 * Maizo's light theme is intentional and stable across devices. Callers may
 * opt into the companion dark palette, but system dynamic colors are not used
 * so the visual language remains predictable and brand-independent.
 */
@Composable
fun MaizoTheme(darkTheme: Boolean = false, content: @Composable () -> Unit) {
    val colors = if (darkTheme) MaizoDarkColors else MaizoLightColors
    MaterialTheme(colorScheme = colors, typography = MaizoTypography, content = content)
}
