package com.maizon.maizosnes.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Gamepad
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.maizon.maizosnes.ui.navigation.MaizoNavGraph

@Composable
fun MainScreen(
    onImportRom: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    val navController = rememberNavController()
    val tabs = remember {
        listOf("home" to "Biblioteca", "multiplayer" to "Multiplayer", "settings" to "Ajustes", "about" to "Sobre")
    }
    Scaffold(
        bottomBar = {
            NavigationBar {
                tabs.forEach { (route, label) ->
                    NavigationBarItem(
                        selected = false,
                        onClick = { navController.navigate(route) },
                        icon = {
                            Icon(
                                when (route) {
                                    "home" -> Icons.Default.Gamepad
                                    "multiplayer" -> Icons.Default.Groups
                                    "settings" -> Icons.Default.Settings
                                    else -> Icons.Default.Info
                                }, label
                            )
                        },
                        label = { Text(label) }
                    )
                }
            }
        }
    ) { padding ->
        MaizoNavGraph(
            navController = navController,
            modifier = Modifier.padding(padding),
            onImportRom = onImportRom,
            legacyContent = content
        )
    }
}
