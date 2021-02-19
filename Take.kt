fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    // mengambil nilai dimulai dari awal
    val takeFirst = numbers.take(6)
    // mengambil nilai dimulai dari akhir
    val takeLast = numbers.takeLast(5)
    println(takeFirst)
    println(takeLast)
}