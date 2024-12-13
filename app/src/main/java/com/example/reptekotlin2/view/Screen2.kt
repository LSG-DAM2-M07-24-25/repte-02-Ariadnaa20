package com.example.reptekotlin2.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.reptekotlin2.R



@Composable
fun Screen2(navController: NavHostController) {

    var selectedCharacter by remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp), // Más padding alrededor
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Tria del personatge",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 24.dp)
        )


        Image(
            painter = painterResource(id = R.drawable.imagen),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 32.dp)
        )


        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CharacterItem(R.drawable.piccolo, 0, selectedCharacter) { selectedCharacter = it }
                CharacterItem(R.drawable.goku, 1, selectedCharacter) { selectedCharacter = it }
                CharacterItem(R.drawable.vegeta, 2, selectedCharacter) { selectedCharacter = it }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CharacterItem(R.drawable.gomah, 3, selectedCharacter) { selectedCharacter = it }
                CharacterItem(R.drawable.supreme, 4, selectedCharacter) { selectedCharacter = it }
                CharacterItem(R.drawable.masked_majin, 5, selectedCharacter) { selectedCharacter = it }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))


        Button(
            onClick = {

                val selectedImage = when (selectedCharacter) {
                    0 -> R.drawable.piccolo
                    1 -> R.drawable.goku
                    2 -> R.drawable.vegeta
                    3 -> R.drawable.gomah
                    4 -> R.drawable.supreme
                    5 -> R.drawable.masked_majin
                    else -> R.drawable.goku
                }
                navController.navigate("screen3/$selectedImage")
            },
            enabled = selectedCharacter != null
        ) {
            Text(text = "Continuar")
        }


    }
}

@Composable
fun CharacterItem(
    imageRes: Int,
    characterId: Int,
    selectedCharacter: Int?,
    onClick: (Int) -> Unit
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = null,
        modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)
            .clickable { onClick(characterId) }
            .border(
                width = if (selectedCharacter == characterId) 3.dp else 0.dp,
                color = if (selectedCharacter == characterId) Color.Black else Color.Transparent,
                shape = CircleShape
            )
    )
}
