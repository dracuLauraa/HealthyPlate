package com.startup.healthyplate.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.startup.healthyplate.view.*
import com.startup.healthyplate.view.bottom.*
import com.startup.healthyplate.navigation.Screen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.WelcomeScreen.route,
        modifier = Modifier.fillMaxSize()
    ) {

        composable(
            route = Screen.WelcomeScreen.route
        ) {
            WelcomeScreen(navController)
        }
        composable(
            route = Screen.LoginScreen.route
        ) {
            LoginScreen(navController)
        }

        composable(
            route = Screen.CreateAccountScreen.route
        ) {
            CreateAccountScreen(navController)
        }

        composable(
            route = Screen.OtpVerifyScreen.route
        ) {
            OtpVerifyScreen(navController)
        }
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.FavoriteScreen.route
        ) {
            FavoriteScreen(navController)
        }
        composable(
            route = Screen.SearchScreen.route
        ) {
            SearchScreen(navController)
        }
        composable(
            route = Screen.OrderScreen.route
        ) {
            OrderScreen(navController)
        }

        composable(
            route = Screen.ProfileScreen.route
        ) {
            ProfileScreen(navController)
        }
        composable(
            route = Screen.HealthInfo.route
        ) {
            HealthInfo(navController)
        }
    }

}