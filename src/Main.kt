//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(isPositive(1))
    println(isEven(4))
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


