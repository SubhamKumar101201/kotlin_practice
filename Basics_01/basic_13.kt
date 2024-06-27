// Getter and Setter:
fun main () {
    lateinit var result:String // lateinit used for late initialize of a variable, it is always var type not for val
//    result = "hello"
//    println(result)
    val obj = Calculator() // Default Constructor in kotlin when we don't define any constructor it takes a default constructor with parameter less constructor.
//    println(obj.add(2,4))
    val p1 = Person("Subham", 23)
//    p1.age = 24
    p1.age = -3
    p1.name = "subham kumar"
    println(p1.name)
    println(p1.age)
}

class Calculator {

    fun add(a: Int, b: Int): Int {
        return a+b
    }

    fun substract(a: Int, b: Int): Int {
        return a-b
    }
}

class Person (nameParam: String, ageParam: Int) {
    var name: String = nameParam
        get() {
            return field.uppercase()
        }
    var age: Int = ageParam
        get() {
            return field+2
        }
        set(value) {
            if (value>0) { // set method
                field = value
            } else {
                println("Age can't be negative")
            }
        }

    var email: String = ""
        get() = field // Default Getter
        set(value) { field = value } // Default Setter
}
