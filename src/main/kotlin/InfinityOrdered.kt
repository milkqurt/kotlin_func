fun main() {
    val list = (0..100).toList()
    val employees = list.map { "Employee $it" }
    val first30 = employees.take(30) // takeLast берет последние 30, drop удаляет первые 30
    for (employee in first30) {
        println(employee)
    }

    val list1 = generateSequence(0) {it + 2} //ленивая инициализация,
    // список только тогда когда он используется где то в коде, если использовать строку A тогда будут генерироваться
    // каждые 2 символа алфавита
    val evenList = list1.take(10)
    for (i in evenList) {
        println(i)
    }

    //task 1
    val list2 = generateSequence(1) { it + 1}
    val map2 = list2.map { "Сотрудник #$it" }.take(100)
    for (i in map2) {
        println(i)
    }
}