package org.example

interface Callable {
    fun call()
}
interface Receivable {
    fun receive()
}

interface Browsable {
    fun browse()
}

class Phone: Callable, Receivable, Browsable {
    override fun call() {
        println("Телефон звонит")
    }
    override fun receive() {
        println("Телефон принимает звонок")
    }
    override fun browse() {
        println("Телефон выходит в интернет")
    }
}

class SmartTV: Browsable {
    override fun browse() {
        println("Телевизор вышел в интернет")
    }
}

class Fridge: Callable, Receivable {
    override fun call() {
        println("Холодильник звонит")
    }

    override fun receive() {
        println("Холодильник принимает звонок")
    }
}

fun main() {
    val browsableDevices = listOf(Phone(), SmartTV())
    browsableDevices.forEach { it.browse() }
    val callbaleDevices = listOf(Phone(), Fridge())
    callbaleDevices.forEach { it.call() }
}

//ДЗ Создать интерфейс Чисел(Numbers) cо след функциями: difference, divide, sum, multiply
//Далее создать конкретную реализацию интерфейса NumbersImpl(n1, n2)(аналог phone - Callable)
// Создать интерфейс QuadrantDifference c одним методом value
// и его конкретную реализацию QuadrantDifferenceImpl(private val numbers: Numbers)
