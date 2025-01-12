package org.example

// Car
// характеристики: объём двигателя, колёсная база, пробег, рядность, цвет, тип, наличие полного привода
// мощность двигателя, макс скорость, коробка передач
// действия: ехать вперёд, назад, поворачивать, парковаться, катиться

// План, Проект, Набросок
class Car {
    constructor(vin: String, color: String) {
        this.vin = vin
        this.color = color
    }

    constructor(vin: String, color: String, row3: Boolean) {
        this.vin = vin
        this.color = color
        this.row3 = row3
    }

    var brand: String? = null // свойство класса
    var model: String? = null
    private var vin: String? = null // инкапсуляция (сокрытие данных)
    var engineCapacity: Double? = null
    var wheelbase: Double? = null
    var mileage: Int? = null
    private var color: String? = null
    private var row3: Boolean? = null

    fun repaint(color: String) { // функция внутри класса называется метод
        this.color = color
    }

    fun driveForward() {
        println("Машина едет вперёд")
    }

    fun driveBackward() {
        println("Машина едет назад")
    }

    fun turn(direction: Char) {
        if (direction == 'l') {
            println("Машина поворачивает налево")
        } else if (direction == 'r') {
            println("Машина поворачивает направо")
        }
    }

    fun show() {
        println("$brand $model $color")
    }
}

fun main() {
    val car1 = Car("djgfksdgfyw4334", "Black", false) // объект
    car1.show()
    car1.brand = "bmw"
    car1.model = "3"
    car1.driveForward()
    car1.turn('l')
    car1.repaint("Grey")
    car1.show()
//    val car2 = Car()
//    car2.brand = "lada"
//    car2.color = "black"
//    val carColorObject = ""
//    val carSeatsObject: String
//    val driveStraightAction: Boolean
//    val driveReverseAction: Boolean
//    ...
}

//ДЗ Создать класс Fraction
// характеристики
// действия

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