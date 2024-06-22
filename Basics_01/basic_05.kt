// Range, When
fun main () {
    /*
    Range : check if the variable value lies between the range or not.
    it uses (# in #) operator for range check and for exclude the upper bound it uses ( until )
    When: it is one type of switch condition in kotlin.
     */
    // Range:
    val number = 21
    val res = number in 1..21
    println(res) // true
    val result = number in 1 until 21
    println(result) // false


    // When:
    val animal = "dog"

    val resultAnimal = when(animal) {
        "horse" -> println("Animal is horse")
        "lion" -> println("Animal is horse")
        "dog" -> println("Animal is horse")
        "cat" -> println("Animal is horse")
        else -> println("Animal not found")
    }
    println(resultAnimal)

}