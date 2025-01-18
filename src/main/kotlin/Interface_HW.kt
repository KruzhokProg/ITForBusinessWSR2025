package org.example

interface Numbers {
    fun difference(): Double
    fun divide(): Double
    fun sum(): Double
    fun multipy(): Double
}

class NumbersInt(
    private val n1: Int,
    private val n2: Int
): Numbers {
    override fun difference(): Double {
        return (n1 - n2).toDouble()
    }

    override fun divide(): Double {
        return n1.toDouble() / n2
    }

    override fun sum(): Double {
        if (n2 > Int.MAX_VALUE - n1) {
            throw IllegalStateException("Сумма чисел не может быть вычислена! превышает INT.MAX")
        } else {
            return (n1 + n2).toDouble()
        }
    }

    override fun multipy(): Double {
        return (n1 * n2).toDouble()
    }
}

class NumbersImpl(
    private val n1: Double,
    private val n2: Double
) : Numbers {
    override fun difference(): Double {
        return n1 - n2
    }

    override fun divide(): Double {
        return n1 / n2
    }

    override fun sum(): Double {
        return n1 + n2
    }

    override fun multipy(): Double {
        return n1 * n2
    }
}

interface QuadrantDifference {
    fun value(): Double
}

class QuadrantDifferenceImpl(
    private val numbers: Numbers
): QuadrantDifference {
    override fun value(): Double {
        return numbers.sum() * numbers.difference()
    }
}

fun main() {
    val numbersDouble: Numbers = NumbersImpl(3.5, 4.5)
    println(numbersDouble.sum())
    println(numbersDouble.difference())
    println(numbersDouble.multipy())
    println(numbersDouble.divide())
    val numbersInt: Numbers = NumbersInt(5, 3)
    println(numbersInt.sum())
    println(numbersInt.divide())
    println(numbersInt.difference())
    println(numbersInt.multipy())

    val quadrantDifference = QuadrantDifferenceImpl(numbersInt)
    println(quadrantDifference.value())

    val quadrantDifference2 = QuadrantDifferenceImpl(numbersDouble)
    println(quadrantDifference2.value())
}

