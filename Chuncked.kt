fun main() {
    val keyword = "QWERTYUIOP"
    // chuncked
    val chuncked = keyword.chunked(2)
    println(chuncked)

    println("========================")

    // chuncked lowercase
    val chunckedLow = keyword.chunked(2) {
        it.toString().toLowerCase()
    }
    println(chunckedLow)
}