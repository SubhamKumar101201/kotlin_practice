// if - else
fun main () {
    /*
    if - else:
    if ( condition ) {
        run this code if condition is true;
    } else {
        run this code if condition is false;
    }
    else - if:
    if ( condition ) {
        run this code if condition is true;
    } else if ( condition ) {
        run this code if condition is true;
    } else {
        run this code if both the condition is false;
    }
    we can also use if - else as an expression by store the result in a variable and then print the variable ( # because in kotlin there is no ternary operator # )
     */

    val isRaining = true

    if (isRaining) {
        println("Take umbrella")
    } else {
        println("No rain - enjoy your day")
    }

    val x = 10
    val y = 11

    if (x > y) {
        println("x is greater than y")
    } else if (x < y) {
        println("x is less than y")
    } else {
        println("x is equal to y")
    }

    val number1 = 22
    val number2 = 11

    val result1 = if ( number1 % 2 == 0 ) "Number is even" else "Number is odd";
    val result2 = if ( number2 % 2 == 0 ) "Number is even" else "Number is odd";

    println("$result1 \n$result2")
}