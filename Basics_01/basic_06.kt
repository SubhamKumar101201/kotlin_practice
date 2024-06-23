// While and Do - While Loop
fun main () {
    /*
        Loops: Execute a set of statement or operation multiple times.
        While Loop: first check condition if condition true then execute the statement.
        Do - While Loop: first execute the statement in do block after that check for the while condition.
     */
    // While Loop:
    var count = 5
    while(count > 1) {
        println("hello world")
        count--
    } // return: 4 times hello world

    var tableNumber: Int = 2
    var index = 1
    while (index <= 10) {
        println("$tableNumber x $index = ${tableNumber * index}")
        index++
    }
    // Do - While Loop:
    var indexNumber = 5
    do {
        println("hello")
        indexNumber--
    } while (indexNumber > 0)
}