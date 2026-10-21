package com.maizon.maizosnes.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.maizon.maizosnes.ui.components.MaizoCard

@Composable
fun MultiplayerScreen() {
    Column(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Multiplayer", style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
        listOf("LAN", "Online", "2P Local").forEach { mode ->
            MaizoCard(Modifier.fillMaxSize()) {
                Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text(mode, style = androidx.compose.material3.MaterialTheme.typography.titleLarge)
                    Text("Criar sala, entrar por código ou conectar por IP")
                }
            }
        }
    }
}
