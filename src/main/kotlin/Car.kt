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