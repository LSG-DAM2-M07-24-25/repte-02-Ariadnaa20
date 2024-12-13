package com.example.reptekotlin2.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.reptekotlin2.R

@Composable
fun LaunchScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Imagen del logo
        Image(
            painter = painterResource(id = R.drawable.imagen),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Botón "Entrar"
        Button(onClick = {
            navController.navigate("screen2") // Navegar a la siguiente pantalla
        }) {
            Text(text = "Entrar")
        }
    }
}
