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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.reptekotlin2.R
@Composable

fun Screen4(navController: NavHostController, characterName: String, characterImage: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 32.dp)
        )


        Image(
            painter = painterResource(id = characterImage),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 24.dp)
        )


        Text(
            text = characterName,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 32.dp)
        )


        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Tornar", fontSize = 18.sp)
        }
    }
}



