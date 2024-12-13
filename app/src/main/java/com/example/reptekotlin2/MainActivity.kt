package com.example.reptekotlin2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.reptekotlin2.view.LaunchScreen
import com.example.reptekotlin2.view.Screen2
import com.example.reptekotlin2.view.Screen3
import com.example.reptekotlin2.view.Screen4

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = Routes.LAUNCH_SCREEN
            ) {
                // Launch Screen
                composable(Routes.LAUNCH_SCREEN) {
                    LaunchScreen(navController = navController)
                }

                // Screen2
                composable(Routes.SCREEN2) {
                    Screen2(navController = navController)
                }

                composable(
                    route = Routes.SCREEN3,
                    arguments = listOf(
                        navArgument("characterImage") { type = NavType.IntType }
                    )
                ) { backStackEntry ->
                    val characterImage = backStackEntry.arguments?.getInt("characterImage") ?: R.drawable.goku
                    Screen3(navController = navController, characterImage = characterImage)
                }

                composable(
                    route = Routes.SCREEN4,
                    arguments = listOf(
                        navArgument("characterName") { type = NavType.StringType },
                        navArgument("characterImage") { type = NavType.IntType }
                    )
                ) { backStackEntry ->
                    val characterName = backStackEntry.arguments?.getString("characterName") ?: "Sin Nombre"
                    val characterImage = backStackEntry.arguments?.getInt("characterImage") ?: R.drawable.goku
                    println("Cargando Screen4 con: characterName=$characterName, characterImage=$characterImage")
                    Screen4(navController = navController, characterName = characterName, characterImage = characterImage)
                }






            }
        }
    }
}
