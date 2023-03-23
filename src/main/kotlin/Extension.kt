

fun main() {
    val age = 5
    if(age.isAgeValid()) {
        println("Valid")
    }
    if (age.isAgeValid()) {
        println("Valid")
    }
    println(age.isPositive())

    val list = listOf<Int>()
    myWithList(list) {
        sum()
        average()
    }

    val str = "adasdas"
    myWithString(str) {
        toUpperCase()
    }

    myWithGeneric(str) {
        toUpperCase()
    }
}

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

inline fun myWithList(list: List<Int>, operation: List<Int>.() -> Unit) {
    list.operation()
}

fun myWithString(string: String, operation: String.() -> Unit) {
    string.operation()
}

fun myWithAny(any: Any, operation: Any.() -> Unit) {
    any.operation()
}

fun <T> myWithGeneric(generic: T, operation: T.() -> Unit) {
    generic.operation()
}

fun <T,R> myWithGenetic(generic: T, operation: T.() -> R): R {
    return generic.operation()
}