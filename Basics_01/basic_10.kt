// Arrays
fun main () {
    // definition: Object that stores multiple values of same type and fixed in size.
    var arr = arrayOf("one", "two", "three") // it is zero index
    for (i in arr) {
        print("$i ")
    }

        println()
    //explicit array
    var arr2 = arrayOf<Int>(1,3,42,1)

    for ((index,element) in arr2.withIndex()) {
        println("$index => $element")
    }

    println(arr[2])
    println(arr2.get(2)) // get value in array
    arr.set(2,"four") // set value in array only within the length
    println(arr[2])
    println(arr2.size) // size of the array
}