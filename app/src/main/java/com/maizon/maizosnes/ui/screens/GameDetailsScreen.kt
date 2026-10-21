package com.maizon.maizosnes.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.maizon.maizosnes.ui.components.MaizoCard

@Composable
fun GameDetailsScreen(romId: String, onPlay: () -> Unit = {}) {
    Column(Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(romId.ifBlank { "Jogo SNES" }, style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
        MaizoCard(Modifier.fillMaxSize()) {
            Column(Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("Região não identificada")
                Text("SHA-256 disponível após a leitura da ROM")
                Button(onClick = onPlay) { Text("JOGAR") }
                Text("Save States  •  Patch  •  Cheats  •  Favoritar  •  Remover")
            }
        }
    }
}
