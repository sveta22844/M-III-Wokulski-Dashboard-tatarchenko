package com.example.wokulskidashboard.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.Typography

val Typography = Typography()
private val LightColors = lightColorScheme(
    primary = GreenIncome,
    secondary = RedExpense,
    background = GrayBackground,
    surface = White
)

@Composable
fun WokolskiDashBoardTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}