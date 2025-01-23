package org.example

enum class Screen(
    val label: String,
    val orderId: Int
    // добавить возрастное свойство 18+
) {
    MAIN("Главная", 0),
    PODCASTS_AND_BOOKS("Подкасты и книги", 1),
    FOR_CHILDREN("Детям", 2),
    COLLECTION("Коллекция", 3)
    // Добавить новые экраны
}

class NavController2(startDestination: Screen) {
    private var backStackScreens = mutableListOf<Screen>()
    private var currentScreen: Screen = startDestination

    fun navigate(route: Screen, bounds: (List<Screen>) -> Unit) {
        if (route != currentScreen) {
            backStackScreens += currentScreen
            currentScreen = route
            bounds.invoke(getHistory())
        }
    }

    fun navigateBack() {
        if (backStackScreens.isNotEmpty()) {
            currentScreen = backStackScreens.removeLast()
            // A -> B
            // backstack = [A]
            // current = B
            // <-
            // backstack = []
            // current = A
        }
    }

    private fun getHistory(): List<Screen> {
        return backStackScreens + currentScreen
    }

    private fun showHistory(bounds: Char) {
        backStackScreens.forEach { screen ->
            print("${screen.label} -> ")
        }
        println(currentScreen.label)
    }
}

fun main() {
    val navController = NavController2(Screen.MAIN)
    navController.navigate(
        Screen.PODCASTS_AND_BOOKS,
        { screens ->
            screens.forEach { print("@$it@ ") }
            println()
        }
    )
    navController.navigate(
        Screen.COLLECTION,
        { screens ->
            screens.forEach { /* if (it.)*/ print("!$it! ") }
            println()
        }
    )
//    navController.navigate(
//        Screen.FOR_CHILDREN,
//        { screens ->
////            screens.forEach { print("#$it# ") }
//            screens.forEach {
//                if (it.label.contains("а")) {
//                    print("^${it}^ ")
//                }
//            }
//            println()
//        }
//    )
    navController.navigate(
        Screen.PODCASTS_AND_BOOKS,
        { screens ->
            screens.forEach { print("@$it@ ") }
            println()
        }
    )
    // Добавить переход на экран 18+ и в лямбде вывести **** если контент 18+ иначе высети содержимое экрана
    //    A -> B -> **** -> D -> ****
//    navController.showHistory()
    navController.navigateBack()
//    navController.showHistory()
}