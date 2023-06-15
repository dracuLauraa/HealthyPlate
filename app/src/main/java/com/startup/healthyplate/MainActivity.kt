package com.startup.healthyplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.startup.healthyplate.component.Scaffold
import com.startup.healthyplate.navigation.Navigation
import com.startup.healthyplate.navigation.Screen
import com.startup.healthyplate.ui.theme.HealthyPlateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HealthyPlateTheme {
                // A surface container using the 'background' color from the theme
                HealthyPlateComposeUIMain()
            }
        }
    }

    @Composable
    fun HealthyPlateComposeUIMain() {
        HealthyPlateTheme {
            Surface(
                color = MaterialTheme.colors.background,
                modifier = Modifier.fillMaxSize()
            ) {
                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                Scaffold(
                    navController = navController,
                    showBottomBar = navBackStackEntry?.destination?.route in listOf(
                        Screen.HomeScreen.route,
                        Screen.FavoriteScreen.route,
                        Screen.OrderScreen.route,
                        Screen.ProfileScreen.route,
                    ),
                    modifier = Modifier.fillMaxSize(),
                    onFabClick = {
                        navController.navigate(Screen.SearchScreen.route)
                    }
                ) {
                    Navigation(navController)
                }
            }

        }
    }
}

