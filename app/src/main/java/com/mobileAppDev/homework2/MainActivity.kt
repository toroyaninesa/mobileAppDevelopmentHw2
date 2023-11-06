package com.mobileAppDev.homework2

import androidx.activity.compose.setContent
import android.os.Bundle
import androidx.navigation.compose.rememberNavController
import androidx.activity.ComponentActivity
import androidx.compose.runtime.*
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.mobileAppDev.homework2.ui.SecondScreen
import com.mobileAppDev.homework2.ui.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppContent()
        }
    }
}

@Composable
fun MyAppContent() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen(onNavigate = { navController.navigate("list") })
        }
        composable(
            "list/{cityName}",
            arguments = listOf(navArgument("cityName") { type = NavType.StringType })
        ) { backStackEntry ->
            val cityName = backStackEntry.arguments?.getString("cityName") ?: "Unknown"
            SecondScreen(cityName = cityName, onBack = { navController.popBackStack() })
        }
    }
}