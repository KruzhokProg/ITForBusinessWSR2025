package org.example

class Fraction(chisl: Int, znam: Int) {

    private var chisl: Int? = chisl
    private var znam: Int? = znam

    fun plus(other: Fraction): Fraction {
        val sumChisl = this.chisl!! * other.znam!! + other.chisl!! * this.znam!!
        val znam = this.znam!! * other.znam!!
        val resFraction = Fraction(sumChisl, znam)
        return resFraction
    }

    fun reduce() {
        val nodChislZnam = nod(this.chisl!!, this.znam!!)
        chisl = chisl!! / nodChislZnam
        znam = znam!! / nodChislZnam
    }

    private fun nod(a: Int, b: Int): Int {
        var x = a
        var y = b
        while (x != y) {
            if (x > y) {
                x = x - y
            } else {
                y = y - x
            }
        }
        return x
    }

    fun show() {
        println("$chisl / $znam")
    }
}

fun main() {
    val f1 = Fraction(2, 4)
    val f2 = Fraction(3, 5)
    val res = f1.plus(f2)
    res.show()
    res.reduce()
    res.show()
//    var a: Int? = null
//    a = 2
//    println(a!!)

}

//val f1 = Fraction(2, 4)
//val f2 = Fraction(3, 5)
//val res1 = f1.plus(f2)
//val res2 = f1.minus(f2)
//val res3 = f1.multiply(f2)
//val res4 = f1.divide(f2)
//f1.show() // 2/ 4
//f1.reduce()
//f1.show()// 1 / 2
//println(res)