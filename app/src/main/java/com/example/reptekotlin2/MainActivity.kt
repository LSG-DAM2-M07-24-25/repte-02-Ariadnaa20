package com.example.reptekotlin2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.reptekotlin2.view.LaunchScreen
import com.example.reptekotlin2.view.Screen2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "launchScreen") {
                composable("launchScreen") { LaunchScreen(navController) }
                }
            }
        }
    }

