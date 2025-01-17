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

// Converter
//Converter -> currencyCode: USD, RUS, UK -> rate (курс по отношению к рублю) USD: 100
//val converterUSD = Converters.get("USD")
//val usd = converterUSD.convert(1000) //функция convert принимает рубли
//println(usd)

abstract class CurrencyConverter {
    abstract val currencyCode: String
    abstract val rate: Double
    fun convert(value: Double): Double {
        val res = value / rate
        return res
    }
}

class UsdConverter: CurrencyConverter() {
    override val currencyCode: String
        get() = "USD"
    override val rate: Double
        get() = 100.0
}

class EurConverter: CurrencyConverter() {
    override val currencyCode: String
        get() = "EUR"
    override val rate: Double
        get() = 110.0
}

class MockConvert: CurrencyConverter() {
    override val currencyCode: String
        get() = "UNKNOWN"
    override val rate: Double
        get() = 1.0

}

object Converters {
    private val converters = listOf(UsdConverter(), EurConverter())
    fun get(currencyCode: String): CurrencyConverter {
        val converter = converters.find { it.currencyCode == currencyCode }
        if (converter != null) {
            return converter
        } else {
            return MockConvert()
        }
    }
}

fun main() {
//    val usdConverter = UsdConverter()
//    val res = usdConverter.convert(1000.0)
//    println(res)
//    val eurConverter = EurConverter()
//    val res2 = eurConverter.convert(1000.0)
//    println(res2)

    val usd = Converters.get("USDA").convert(1000.0)
//    val usd = converterUSD.convert(1000.0)
    println(usd)
}