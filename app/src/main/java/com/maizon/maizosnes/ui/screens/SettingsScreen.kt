package com.maizon.maizosnes.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    Column(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Ajustes", style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Buscar nas configurações") }, singleLine = true)
        LazyColumn(verticalArrangement = Arrangement.spacedBy(14.dp)) {
            items(listOf("Biblioteca", "Vídeo", "Áudio", "Controles", "Save States", "Multiplayer", "Sistema", "Sobre")) { section ->
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text(section, style = androidx.compose.material3.MaterialTheme.typography.titleLarge)
                    Text("Configurações de $section", style = androidx.compose.material3.MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}
