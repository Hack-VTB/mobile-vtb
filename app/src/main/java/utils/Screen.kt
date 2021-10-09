package utils

sealed class Screen(val route: String) {
    object BeginScreen1: Screen("begin_screen_1")
    object BeginScreen2: Screen("begin_screen_2")
    object BeginScreen3: Screen("begin_screen_3")
    object StartScreen: Screen("start_screen")
    object RoutesScreen: Screen("route_screen")
}
