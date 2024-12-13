package com.example.reptekotlin2.view

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun LaunchScreen(onNavigate: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Imagen del logo
        Image(
            painter = painterResource(id = com.example.reptekotlin2.view.dragonball),
            contentDescription = null, // No necesitamos descripción
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Botón "Entrar"
        Button(onClick = onNavigate) {
            Text(text = "Entrar", fontSize = 16.sp)
        }
    }
}
