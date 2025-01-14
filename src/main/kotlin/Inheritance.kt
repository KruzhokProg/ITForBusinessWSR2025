package org.example

open class Animal {
    var numberOfPaws: Int? = null
    var height: Int? = null
    var width: Int? = null
    var isFurAvailable: Boolean? = null
}

class Cat: Animal() {

}

class Snake {
    var numberOfPaws: Int? = 0
    var height: Int? = 10
    var width: Int? = 200
    var isFurAvailable: Boolean? = false
}
