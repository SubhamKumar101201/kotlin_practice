// Classes  and Objects
// OOP (Object oriented programming)- it aims to implement real world entity in programming to solve problems.
// Class: class is a blueprint or template and Object are real thing.
// you create objects in your program , they interact with each other to complete the work.
// classes define how an object behaves and every object different from each other.
// Class Design: Properties or Fields, Methods

fun main () {
    val mustang = Car("mustang", "petrol", 111)
    val porsche = Car("porsche", "petrol", 233)

    mustang.driveCar()
}

class Car (val name: String, val type: String, var kmRun: Int) {
    // drive car function
    fun driveCar () {
        println("$name Car is driving")
    }

    // apply breaks function
    fun applyBreaks () {
        println("$name Applied breaks")
    }
}