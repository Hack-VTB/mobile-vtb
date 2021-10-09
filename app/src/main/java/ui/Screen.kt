package ui

sealed class Screen(val route: String) {
    object BeginScreen1: Screen("begin_screen_1")
    object BeginScreen2: Screen("begin_screen_2")
}
