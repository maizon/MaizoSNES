package com.maizon.maizosnes.ui.theme

import androidx.compose.ui.graphics.Color

// Light-first palette: calm blue-green accents on neutral surfaces keep text
// readable without relying on gradients, blur, or heavy elevation.
val MaizoBackground = Color(0xFFF6F8FB)
val MaizoSurface = Color(0xFFFFFFFF)
val MaizoSurfaceRaised = Color(0xFFEAF0F5)
val MaizoPrimary = Color(0xFF2E5E86)
val MaizoPrimaryContainer = Color(0xFFD9E9F5)
val MaizoOnPrimaryContainer = Color(0xFF12324D)
val MaizoSecondary = Color(0xFF1F7A72)
val MaizoSecondaryContainer = Color(0xFFD7EFEB)
val MaizoOnSecondaryContainer = Color(0xFF0E3A36)
val MaizoOnBackground = Color(0xFF17212B)
val MaizoOnSurface = Color(0xFF17212B)
val MaizoMuted = Color(0xFF52616F)
val MaizoOutline = Color(0xFFB8C7D3)
val MaizoWarning = Color(0xFF9A4D00)

// Existing UI names are kept as aliases so the backend and the current
// monolithic screen do not need to change during this visual refresh.
val MaizoAccent = MaizoPrimary
val MaizoMint = MaizoSecondary
