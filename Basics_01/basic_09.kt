import kotlin.reflect.KFunction1

// function overloading: same name different parameters ,either number of parameters is different or type is different.
fun main () {
    println(addition(1,3))
    println(addition(1.0,3.5))
    println(nameParameter(num1 = 4, num2 = 4)) // named parameter

    var fn1 = ::funAsParameter // function as variable
    var fn2 = ::funAsParameter
    println(fn1(3))
}

// function overloading
fun addition(a: Int, b: Int): Int {
    return a + b
}

fun addition(a: Double, b: Double): Double {
    return a + b
}

// named parameter
fun nameParameter(num1: Int, num2: Int): Int {
    return num1 + num2
}

// function as parameter
fun funAsParameter(num: Int): Int {
    return num
}