package ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ui.beginScreens.BeginScreen1
import ui.beginScreens.BeginScreen2
import utils.Screen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.BeginScreen1.route) {
        composable(route = Screen.BeginScreen1.route) {
            BeginScreen1(navController = navController)
        }
        composable(route = Screen.BeginScreen2.route) {
            BeginScreen2(navController = navController)
        }
    }
}