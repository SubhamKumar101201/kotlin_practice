// For Loop and Range (.., until, downTo and step)
fun main () {
    for(i in 1..5) { // this loop take i from 1 to 5 (i++)
//        print("$i ") // return: 1 2 3 4 5
    }

    for(i in 1..10 step 2) { // this loop take's i from 1 to 10 but increment the i value with 2
//        print("$i ") // return: 1 3 5 7 9
    }

    for (i in 1 until 5) { // this loop take i from 1 to 4 exclude the last element
//        print("$i ") // return: 1 2 3 4
    }

    for (i in 8 downTo 1) { // this loop take i from 8 to 1 (i--)
//       print("$i ") // return: 8 7 6 5 4 3 2 1
    }

    for (i in 8 downTo 1 step 2) { // this loop take i from 8 to 1 but decrement the i value with 2
//       print("$i ") // return: 8 6 4 2
    }

}