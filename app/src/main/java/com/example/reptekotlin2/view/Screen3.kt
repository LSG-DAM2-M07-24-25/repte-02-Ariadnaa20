package com.example.reptekotlin2.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.reptekotlin2.R

@Composable
fun Screen3(navController: NavHostController, characterImage: Int) {

    var characterName by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Image(
            painter = painterResource(id = R.drawable.imagen),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 32.dp)
        )


        Image(
            painter = painterResource(id = characterImage),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 32.dp)
        )


        OutlinedTextField(
            value = characterName,
            onValueChange = { characterName = it },
            label = { Text("Nom del personatge") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))
        // Botó para navegar a Screen4
        Button(
            onClick = {
                val route = "${Routes.SCREEN4}/$characterName/$characterImage"
                println("Navegando a ruta: $route")
                navController.navigate(route)
            },
            enabled = characterName.isNotEmpty()
        ) {
            Text(text = "Mostrar", fontSize = 18.sp)
        }
    }
}
