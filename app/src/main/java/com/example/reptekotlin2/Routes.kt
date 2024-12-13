package com.example.reptekotlin2



import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.reptekotlin2.view.LaunchScreen
import com.example.reptekotlin2.view.Screen2

@Composable
fun Routes(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "launchScreen") {
        // Ruta para Launch Screen
        composable("launchScreen") {
            LaunchScreen(navController = navController)
        }

        // Ruta para Screen2
        composable("Screen2") {
            Screen2(navController = navController)
        }
    }
}



