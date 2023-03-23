fun main() {
    val data = mapOf(
        "Январь" to listOf(100,100,100,100),
        "Февраль" to listOf(200,100,400,200),
        "Март" to listOf(500,100,300,-400)
    )
    printInfo(data)
}

fun printInfo(data: Map<String,List<Int>>) {
    val validData = data.filterNot { it.value.any { it < 0 } }
    val averageWeek = validData.flatMap { it.value }.average()
    println("Средняя выручка за неделю: $averageWeek")

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.max()
    val min = listOfSum.min()
    val averageMonth = listOfSum.average()

    val maxMonth = validData.filter { it.value.sum() == max }.keys
    val minMonth = validData.filter { it.value.sum() == min }.keys

    println("Средняя выручка в месяц: $averageMonth")
    println("Минимальная выручка в месяц: $min")
    for (month in minMonth) {
        println(month + " ")
    }
    println("Максимальная выручка в месяц: $max")
    println("Была в следущих месяцах")
    for (month in maxMonth) {
        println(month + " ")
    }
}