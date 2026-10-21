package com.maizon.maizosnes.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun MaizoTheme(content: @Composable () -> Unit) {
    val context = LocalContext.current
    val dark = isSystemInDarkTheme()
    val colors = when {
        Build.VERSION.SDK_INT >= Build.VERSION_CODES.S && dark -> dynamicDarkColorScheme(context)
        Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> dynamicLightColorScheme(context)
        dark -> darkColorScheme(
            primary = MaizoAccent,
            secondary = MaizoMint,
            background = MaizoBackground,
            surface = MaizoSurface,
            surfaceVariant = MaizoSurfaceRaised,
            onSurfaceVariant = MaizoMuted,
            onPrimary = MaizoBackground,
            onBackground = Color.White,
            onSurface = Color.White
        )
        else -> lightColorScheme()
    }
    MaterialTheme(colorScheme = colors, typography = MaizoTypography, content = content)
}
