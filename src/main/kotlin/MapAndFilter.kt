fun main() {
    val listOfNumbers = (0..100).toList()
    val listOfEvenNumbers = listOfNumbers.filter{it % 2 == 0}

    val listOfNames = mutableListOf<String>()
    listOfNames.add("Dias")
    listOfNames.add("Arman")
    listOfNames.add("Emil")
    listOfNames.add("Andrey")
    listOfNames.add("Dilnaz")
    val listOfANames = listOfNames.filter {it[0].equals("A")}
    for (name in listOfANames) {
//        println(name)
    }

    val listOfANames2 = listOfNames.filter { it.startsWith("A") }
    for (name in listOfANames2) {
//        println(name)
    }

    val mapTest = (0..50).toList()
    val mapping = mapTest.map { it * 2 }
    for (i in mapping) {
//        println(i)
    }

    val mapTest2 = (0..50).toList()
    val mapping2 = mapTest2.map { "Employee #$it" }
    for (i in mapping2) {
//        println(i)
    }

    val initArray = mutableListOf<Int>()
    for (i in 0..1000) {
        initArray.add((Math.random() * 1000).toInt())
    }
    val initFilter = initArray.filter { it % 3 == 0 || it %5 == 0 }.map { it * it }
    val initFilter2 = initFilter.sortedDescending()
    val initFilter3 = initFilter2.map { "$it" }
    for (i in initFilter3) {
        println(i)
    }
}