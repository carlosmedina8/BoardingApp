package com.example.boardingapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.boardingapp.onBoardViews.MainOnBoarding
import com.example.boardingapp.views.HomeView

@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "onBoarding") {
        composable("onBoarding") {
            MainOnBoarding(navController)
        }
        composable("home") {
            HomeView(navController)
        }
    }
}
