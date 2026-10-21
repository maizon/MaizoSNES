package com.maizon.maizosnes.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AboutScreen() {
    Column(Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Text("Sobre o MaizoSNES", style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
        Text("Versão 1.0.0")
        Text("Emulação baseada em Snes9x. Multiplayer baseado em GekkoNet.")
        Text("Licenças e avisos de terceiros estão disponíveis no repositório.")
    }
}
