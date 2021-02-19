fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    // memangkas mulai dari index awal
    val dropFirst = numbers.drop(4)
    // memangkas mulai dari index akkhir
    val dropLast = numbers.dropLast(3)
    println(dropFirst)
    println(dropLast)
}