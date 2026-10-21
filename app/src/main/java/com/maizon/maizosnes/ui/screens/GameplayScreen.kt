package com.maizon.maizosnes.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.maizon.maizosnes.ui.controls.MaizoTouchControls

@Composable
fun GameplayScreen(romId: String) {
    Box(Modifier.fillMaxSize()) {
        Text(romId, Modifier.align(Alignment.TopStart))
        MaizoTouchControls(Modifier.fillMaxSize())
    }
}

@Composable
fun InGameMenuOverlay(onClose: () -> Unit = {}) {
    // Overlay leve e sem blur; a SurfaceView e o input real continuam no EmulatorUi.
    androidx.compose.material3.AlertDialog(
        onDismissRequest = onClose,
        confirmButton = { androidx.compose.material3.TextButton(onClick = onClose) { Text("CONTINUAR") } },
        title = { Text("Menu do jogo") },
        text = { Text("Save States  •  Vídeo  •  Áudio  •  Controles  •  Sair") }
    )
}
