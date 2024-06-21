// Operators
fun main () {
    /*
    Types of operators:
        *Arithmetic operators:
                    ( +, -, *, /, % )
        *Relational operators:
                    ( >, <, >=, <=, ==, != )
        *Increment and Decrement operator:
                    ( i++, ++i, i--, --i )
         post increment i++ , pre increment ++i same for decrement
        *Logical operator:
                    [ && (and), || (or), ! (not) ]
        *Short circuiting:
                    if first condition true then execute the first expression and left the second expression also vice versa
     */
    var i = 13
    var j = 2

    println( i + j ) // 15
    println( i - j ) // 11
    println( i * j ) // 26
    println( i.toFloat() / j ) // 6.5
    println( i % j )

    val a = 12
    val b = 5
    val c = 12

    println( a > b )
    println( a < b )
    println( a >= c )
    println( a <= b )
    println( a == c )
    println( a != b )


    //println(i++) // return: 13 - first use the i value then increment
    //println(i) // return: 14 - already increment
    println( i++ + ++i ) // return: 28 -  first it use i = 13 then increment to 14 and in next it first increment the 14 to 15 and then add

    var above70 = true
    var knowsProgramming = true

    val calledForInterviewANDOperator = above70 && knowsProgramming // false && false = false , false && true = false , true && true = true
    val calledForInterviewOROperator = above70 || knowsProgramming // false || false = false , false || true = true , true || true = true
    println("Is this candidate called for interview: $calledForInterviewOROperator")

    var r = 13
    var s = 23

    var res = r == 16 || ++s == 24
    println(res)
    println("$r,$s")
}