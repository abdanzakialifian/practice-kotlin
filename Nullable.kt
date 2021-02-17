fun main() {
    // variable nullable
    val name: String? = null

    // safe calls
    println(name?.length ?: "Zaki")
}