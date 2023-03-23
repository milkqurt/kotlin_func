
val name: String? = "dadasdad"

fun main() {
    name?.let {
        if (it.length > 5) {
            println("sdadasd")
        }
    }

    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0 until 10) {
            add((Math.random() * 1000).toInt())
        }
        println(sum())
        println(average())
        println(first())
        println(last())
    }
}