package org.example

abstract class Transport {
    abstract val environmentToMove: String
    abstract val prop: String
    abstract val maxSpeed: Double
    abstract val liftingCapacity: Double
    abstract val canMovePeople: Boolean
    abstract val creationYear: Int
}

class aircraft : Transport() {
    override val environmentToMove: String = "air"
    override val prop: String = "wings"
    override val maxSpeed: Double = 8200.8
    override val liftingCapacity: Double = 120000.0
    override val canMovePeople: Boolean = true
    override val creationYear: Int = 1903
}

class train : Transport() {
    override val environmentToMove: String = "ground"
    override val prop: String = "metal wheels"
    override val maxSpeed: Double = 574.8
    override val liftingCapacity: Double = 99793000.0
    override val canMovePeople: Boolean = true
    override val creationYear: Int = 1829
}

class car : Transport() {
    override val environmentToMove: String = "ground"
    override val prop: String = "wheels"
    override val maxSpeed: Double = 1228.0
    override val liftingCapacity: Double = 445.0
    override val canMovePeople: Boolean = true
    override val creationYear: Int = 1885
}

class ekranoplan : Transport() {
    override val environmentToMove: String = "overwater"
    override val prop: String = "shielding effect(wings)"
    override val maxSpeed: Double = 550.0
    override val liftingCapacity: Double = 4500.0
    override val canMovePeople: Boolean = true
    override val creationYear: Int = 1983
}