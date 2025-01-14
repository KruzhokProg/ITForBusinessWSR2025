package org.example

abstract class Beverage {

    abstract val tempBrew: Float

    abstract fun brew()

    abstract fun addCondiments()

    private fun boilWater() {
        println("Boiling water")
    }

    private fun pourInCup() {
        println("Pouring into cup")
    }

    fun prepare() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
        println()
    }
}

//coffee, tea
class Coffee: Beverage() {

    override val tempBrew: Float = 80.5f

    override fun brew() {
        println("Brew coffee")
    }

    override fun addCondiments() {
        println("Add sugar and milk")
    }
}

class Tea: Beverage() {
    override val tempBrew: Float = 100f

    override fun brew() {
        println("Brew tea")
    }

    override fun addCondiments() {
        println("Add sugar and lemon")
    }
}

//ДЗ
//abstract class Transport
// Train, Aircraft, Car, Bus