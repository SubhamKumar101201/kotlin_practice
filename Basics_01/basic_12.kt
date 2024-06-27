// Constructor
fun main () {
    var car = Automobile("mustang", 4, 5, true)
//    var p1 = Person("subham",24)
//    println(p1.age)
    var sc1 = sportsCar("porsche", 4, 2, true)
    sc1.carDetails()
}

class Automobile(val name: String, val tyres: Int, val maxSeating: Int, hasAirbags: Boolean) { // Primary constructor, in constructor when we use var, val it treated as properties and when we not mention these it treated as parameter.
    init {
        println("$name name object is created")
    } // when an object is created this set of code is initialize, we can set multiple init block, it executed in sequence.
    var airBags = hasAirbags
    fun drive () {}
    fun applyBreaks () {}
}

class Empty () {

}

class sportsCar (val name: String, val tyres: Int, val maxSeating: Int, var hasAirbags: Boolean) { // Secondary Constructor
    constructor(nameParam: String, airbagParam: Boolean) : this(nameParam, 4, 5, airbagParam)
    fun carDetails () {
        println("Car name: $name, Car tyres: $tyres, Car seating: $maxSeating, Car has air bags: $hasAirbags")
    }
}