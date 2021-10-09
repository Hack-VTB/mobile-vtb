package ui

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import ui.beginScreens.BeginScreen1
import ui.beginScreens.BeginScreen2
import ui.beginScreens.BeginScreen3
import ui.beginScreens.StartScreen
import ui.lessons.Lesson1Screen1
import ui.lessons.Lesson1Screen2
import ui.routes.RoutesScreen
import ui.routes.listRoutes
import utils.Screen

@ExperimentalMaterialApi
@ExperimentalPagerApi
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
        composable(route = Screen.BeginScreen3.route) {
            BeginScreen3(navController = navController)
        }
        composable(route = Screen.StartScreen.route) {
            StartScreen(navController = navController)
        }
        composable(route = Screen.RoutesScreen.route) {
            RoutesScreen(listRoutes, navController)
        }

        composable(route = Screen.Lesson1Screen1.route) {
            Lesson1Screen1(navController = navController)
        }
        composable(route = Screen.Lesson1Screen2.route) {
            Lesson1Screen2(navController = navController)
        }
    }
}