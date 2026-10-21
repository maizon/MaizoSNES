package com.maizon.maizosnes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val MaizoTypography = Typography().copy(
    headlineLarge = Typography().headlineLarge.copy(fontWeight = FontWeight.Black, letterSpacing = (-0.5).sp),
    headlineMedium = Typography().headlineMedium.copy(fontWeight = FontWeight.ExtraBold),
    titleLarge = Typography().titleLarge.copy(fontWeight = FontWeight.Bold),
    labelLarge = Typography().labelLarge.copy(fontWeight = FontWeight.Bold, letterSpacing = 0.4.sp)
)
