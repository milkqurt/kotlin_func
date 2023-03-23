fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b}
    println(sum(4,4))

    val square: (Int) -> Int = {it * it}
//    val square: (Int) -> Unit = {it * it} аналог void
    println(square(4))

    val name: (String) -> Unit = { println("Privet $it") }
    name("Dias")

    val sort: (ArrayList<Int>) -> ArrayList<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }
    val sort1: (ArrayList<Int>) -> ArrayList<Int> = {
        for (i in 0 until it.size) {
            for (j in 0 until it.size - i - 1) {
                if (it[j] > it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }
    val sorted1 = sort1(arrayListOf(10,20,5,8,55))
    println(sorted1)

    val sorted = sort(arrayListOf(1,2,4,6,2,46,19))
    println(sorted)
}