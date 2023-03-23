fun main() {
    val revenueByWeek = listOf(
        listOf(1,2,3,4,5),
        listOf(9,8,7,6,5),
        listOf(2,4,6,8,10),
        listOf(1,3,5,7,9),
    )
//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it) {
//            total.add(i)
//        }
//    }
    val total = revenueByWeek.flatMap { it } // можно использовать флаттен которое вернет Int если ничего не сделано
    val average = total.average()
    println(average)
}