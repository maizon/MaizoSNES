package com.maizon.maizosnes.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.maizon.maizosnes.ui.components.MaizoEmptyState
import com.maizon.maizosnes.ui.components.MaizoTopBar

@Composable
fun HomeScreen(onImportRom: () -> Unit = {}, legacyContent: @Composable () -> Unit = {}) {
    var selectedTab by remember { mutableIntStateOf(0) }
    Column(Modifier.fillMaxSize().padding(horizontal = 16.dp), verticalArrangement = Arrangement.Top) {
        MaizoTopBar("MaizoSNES", "Biblioteca de jogos")
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Buscar jogos") }, singleLine = true)
        TabRow(selectedTabIndex = selectedTab) {
            listOf("Recentes", "Favoritos", "Todos").forEachIndexed { index, label ->
                Tab(selected = selectedTab == index, onClick = { selectedTab = index }, text = { Text(label) })
            }
        }
        MaizoEmptyState("Sua biblioteca está vazia", "Importe uma ROM para começar.", Modifier.weight(1f))
        legacyContent()
    }
}
