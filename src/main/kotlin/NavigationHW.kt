package org.example

class NavController(startDestignation: String) {
    private var backStackScreens = mutableListOf(startDestignation)
    fun navigate(route: String) {
        backStackScreens += route
    }

    fun showHistory() {
        var path = ""
        for (i in 1..backStackScreens.size) {
            if (i > 1) {
                path += (" -> ")
            }
            path += (backStackScreens[i - 1])
        }
        println(path)
    }

    fun navigateBack() {
        backStackScreens += backStackScreens[backStackScreens.size - 2]
    }

    fun showNow() {
        println(backStackScreens[backStackScreens.size - 1])
    }
}

fun main() {
    val navController = NavController("A")
    navController.navigate("B")
    navController.navigate("B")
    navController.navigate("C")
    navController.navigate("л")
    navController.navigate("р")
    navController.navigate("c")
    navController.navigateBack()
    navController.showHistory()
    navController.showNow()
}