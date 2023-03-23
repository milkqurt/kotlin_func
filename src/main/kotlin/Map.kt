fun main() {
//    val data = mutableMapOf<String,List<Int>>() //mutable плохой тон
//    data.put("file1", listOf(1,3,4,5,6))
//    data["file2"] = listOf(1,3,4,5,7)

    val data = mapOf<String,List<Int>>( // аргументы можно уже не указывать но я оставлю
        "file1" to listOf(14,23,4,53,52),
        "file2" to listOf(1,4,5,6,7,8)
//        Pair("file2", listOf(12,43,343,434))  //одно и тоже
    )
    val average = data.flatMap { it.value }.average() //развертываем только значения,
// flatmap вернет List<Int>, map вернет List<List<Int>>

}