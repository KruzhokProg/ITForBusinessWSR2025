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

fun main() {
    val plus = PlusOperation()
    doOperation(2, 3, plus)
    val minus = MinusOperation()
    doOperation(20, 5, minus)
}