fun main() {

    val name = modifyString("dias", {it.toUpperCase()})
    println(name)
}

inline fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}