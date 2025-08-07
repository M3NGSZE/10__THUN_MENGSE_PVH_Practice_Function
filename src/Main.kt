//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(isPositive(1))

    println(isEven(4))

    val list1 = (1..10).toList()
    val list2 = ('A'..'J').toList()
    println(getFirstElement(list1))
    println(getFirstElement(list2))

    val words = listOf("cat", "umbrella", "hat", "kangaroo")
//    val longWords = words.filter { it.length > 4 }
    println(longWords(words))

    repeatOperation(3) {
        println("invoke block n times1")
    }
    repeatOperation(2, print)

}

// 1. Write a function isPositive(number: Int): Boolean that returns true if number is positive.
fun isPositive(number: Int): Boolean {
    return number > 0
}

/*
    2. Convert this function into a single-expression function
    fun isEven(n: Int): Boolean {
        return n % 2 == 0
    }
 */

fun isEven(n: Int): Boolean = n % 2 == 0

/*
    3. Write a generic function `getFirstElement<T>(list: List<T>) : T?`
        a. Returns the first element of a list or null if it's empty.
 */

fun <T> getFirstElement(list: List<T>): T?{
    return if (list.isNotEmpty()) list.first() else null
}

/*
    4. Use a lambda with filter to extract words longer than 4 letters
            val words = listOf("cat", "umbrella", "hat", "kangaroo")
            val longWords = // your filter here
            println(longWords) // Output: ["umbrella", "kangaroo"]
*/
//val longWords = (List<String>) -> List<String>
val  longWords = {a: List<String> -> a.filter { it.length > 4 } }

/*
    5. Write a function `repeatOperation(n : Int, block : () → Unit)`
        a. it should invoke `block` n times.
 */

fun repeatOperation(n: Int, block: () -> Unit){
    for (i in 0..<n){
        block()
    }
}

val print = { println("invoke block n times2") }


