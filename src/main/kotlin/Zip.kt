fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..100) {
        names.add("Name $i")
        phones.add(7_747_000_000 + (Math.random() * 100).toLong())
    }
    val users = names.zip(phones)
    for (user in users) {
        println("Name: ${user.first} Phone: ${user.second}")
    }

    val firstName = mutableListOf<String>()
    val lastName = mutableListOf<String>()
    for (i in 0..10) {
        firstName.add("Name $i")
        lastName.add("Last $i")
    }
    val ops = firstName.zip(lastName)
    for (op in ops) {
        println("Name: ${op.first} Last: ${op.second}")
    }

}