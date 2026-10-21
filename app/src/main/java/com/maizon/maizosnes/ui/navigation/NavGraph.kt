package com.maizon.maizosnes.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.maizon.maizosnes.ui.screens.AboutScreen
import com.maizon.maizosnes.ui.screens.GameDetailsScreen
import com.maizon.maizosnes.ui.screens.GameplayScreen
import com.maizon.maizosnes.ui.screens.HomeScreen
import com.maizon.maizosnes.ui.screens.MultiplayerScreen
import com.maizon.maizosnes.ui.screens.SettingsScreen

@Composable
fun MaizoNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    onImportRom: () -> Unit = {},
    legacyContent: @Composable () -> Unit = {}
) {
    NavHost(navController, startDestination = "home", modifier = modifier) {
        composable("home") { HomeScreen(onImportRom = onImportRom, legacyContent = legacyContent) }
        composable("multiplayer") { MultiplayerScreen() }
        composable("settings") { SettingsScreen() }
        composable("about") { AboutScreen() }
        navigation(startDestination = "details/{romId}", route = "rom/{romId}") {
            composable("details/{romId}") { backStack ->
                GameDetailsScreen(romId = backStack.arguments?.getString("romId").orEmpty(), onPlay = {
                    navController.navigate("gameplay/${backStack.arguments?.getString("romId").orEmpty()}")
                })
            }
            composable("gameplay/{romId}") { backStack ->
                GameplayScreen(romId = backStack.arguments?.getString("romId").orEmpty())
            }
        }
    }
}
