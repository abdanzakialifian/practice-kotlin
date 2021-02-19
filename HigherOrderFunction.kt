fun main() {
    printResult(20, sum)
}


fun printResult(number1: Int, penjumlahan: (Int,Int) -> Int) {
    val result = penjumlahan(number1,number1)
    println(result)
}

val sum: (Int,Int) -> Int = {valueA,valueB -> valueA + valueB}