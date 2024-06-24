// function: it is a block of code which perform certain functionality, it helps to reuse code.
fun main () {
    var result = addTwoNum(4,5) // return: 9
//    print(evenOrOdd(4)) // return: even
//    unitTypeFun(1) // return: 1
//    print(inLineFun(3,4))
    printMessage()
}

fun addTwoNum(num1: Int, num2: Int) :Int {
    val sum = num1 + num2
    return sum
}

fun evenOrOdd(num: Int): String {
    return if(num % 2 == 0) "Even" else "Odd"
}

fun unitTypeFun(num: Int) {
    println(num)
}

// inline function
fun inLineFun(num1: Int, num2: Int): Int = num1 + num2

fun printMessage(num: Int = 2) { // default parameter is 2 here
    for (i in 1..num) {
        println("Hello $i")
    }
}