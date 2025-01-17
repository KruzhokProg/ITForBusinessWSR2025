package org.example

// ДЗ
open class Employee {
    open val baseSalary: Double = 1000.0

    open fun showDetails() {
        println("I am an Employee")
    }
}

open class Developer: Employee() {
    override val baseSalary: Double
        get() = super.baseSalary * 1.3
    private var isRemote: Boolean = true

    override fun showDetails() {
        super.showDetails()
        println("Developer with baseSalary: $baseSalary")
    }
}

class MobileDeveloper: Developer() {
    override val baseSalary: Double
        get() = super.baseSalary + 1000.0

    override fun showDetails() {
        super.showDetails()
        println("Mobile")
    }
}

class WebDeveloper: Developer() {
    override val baseSalary: Double
        get() = super.baseSalary + 500.0

    override fun showDetails() {
        super.showDetails()
        println("Web")
    }
}

fun main() {
//    val employee = Employee()
//    employee.showDetails()
//    val developer = Developer()
//    developer.showDetails()
    val mobileDeveloper = MobileDeveloper()
//    mobileDeveloper.showDetails()
    val webDeveloper = WebDeveloper()
//    webDeveloper.showDetails()

    val developers = listOf(mobileDeveloper, webDeveloper)
    developers.forEach { it.showDetails() }
}