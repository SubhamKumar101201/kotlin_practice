    //variables :
fun main() {
    /*
    in kotlin there is two ways to create a variable VAR and VAL.
    var : it can be reassigned.
    val : it can't be reassigned.
    Data types in kotlin : Byte, Short, Int, Long,
                           Float, Boolean,
                           Character, String
    kotlin smart enough to understand which data type you assign to the variable.
    so, this is not mandatory to mention data types , but  you can assign data types if needed.
    in var once you define an int variable then we can't reassign with some other datatypes
     */
    var score = 5
    score = 10 // possible in case of var

    val message = "hello variable"
//    message = "hi variable" // not possible in case of val

    println(score)
    println(message)

    var a : Int = 12
    var b : Double = 200.0
    var c : Float = 34.55F
    var d : Boolean = true
    var f : Char = 's'
    var e : String = "subham kumar"

    println("$a,$b,$c,$d,$e,$f,$e")
}