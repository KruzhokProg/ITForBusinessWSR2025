package org.example

interface Operation {
    fun invoke(x: Int, y: Int): Int
}

class PlusOperation: Operation {
    override fun invoke(x: Int, y: Int): Int {
        return x + y
    }
}

class MinusOperation: Operation {
    override fun invoke(x: Int, y: Int): Int {
        return x - y
    }
}

class MultiplyOperation: Operation {
    override fun invoke(x: Int, y: Int): Int {
        return x * y
    }
}

fun doOperation(x: Int, y: Int, operation: Operation) {
    println(operation.invoke(x, y))
}

class QuadranticDifference2: Function2<Int, Int, Int> {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1*p1 - p2*p2
    }
}

fun doOperationWithBuiltInInterface(x: Int, y: Int, operation: Function2<Int, Int, Int>): Int {
    return operation.invoke(x, y)
}

fun doOperationLambda(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation.invoke(x, y)
}

fun doOperationLambdaUnit(x: Int, y: Int, operation: (Int, Int) -> Unit) {
    operation.invoke(x, y)
}


fun main() {
//    val plus = PlusOperation()
//    val minus = MinusOperation()
//    val multiple = MultiplyOperation()
////    doOperation(2, 3, plus)
////    doOperation(2, 3, minus)
//    listOf(plus, minus, multiple).forEach { operation ->
//        doOperation(2, 3, operation)
//    }
    val quadrantDifference = QuadranticDifference2()
    println(doOperationWithBuiltInInterface(2, 3, QuadranticDifference2()))
    println(doOperationLambda(2, 3, {a, b -> a*a - b*b} ))
    println(doOperationLambdaUnit(2, 3, {a, b -> println(a + b) } ))
//    println(quadrantDifference.invoke(2, 3))
}

// ДЗ: Экраны: A, B, C, D
//NavController cо свойствами: startDestination, backStackScreens (MutableList<String>) (A, B, C, A, D)
//fun navigate(route: String)
//fun navigateBack()
//fun showHistory() A -> B -> C -> A -> D