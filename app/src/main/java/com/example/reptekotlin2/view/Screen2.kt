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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.reptekotlin2.R

@Composable
fun Screen2(navController: NavHostController) {
    // estat del personatge
    var selectedCharacter by remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Tria del personatge", modifier = Modifier.padding(bottom = 16.dp))
        Image(
            painter = painterResource(id = R.drawable.imagen),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        //aqui es on anirien els personatges pero sns si esta del tot be :(
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                CharacterItem(R.drawable.goku, 0, selectedCharacter) { selectedCharacter = it }
                CharacterItem(R.drawable.vegeta, 1, selectedCharacter) { selectedCharacter = it }
                CharacterItem(R.drawable.piccolo, 2, selectedCharacter) { selectedCharacter = it }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                CharacterItem(R.drawable.gomah, 3, selectedCharacter) { selectedCharacter = it }
                CharacterItem(R.drawable.masked_majin, 4, selectedCharacter) { selectedCharacter = it }
                CharacterItem(R.drawable.supreme, 5, selectedCharacter) { selectedCharacter = it }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))


        Button(
            onClick = {
                // aqui es on anirem a la seguent pantalla am el botó de contiunar
                navController.navigate("screen3")
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
            .size(80.dp)
            .clip(CircleShape)
            .clickable { onClick(characterId) }
            .padding(8.dp)
            .then(
                if (selectedCharacter == characterId) {
                    Modifier.border(2.dp, androidx.compose.ui.graphics.Color.Black, CircleShape)
                } else {
                    Modifier
                }
            )
    )
}
