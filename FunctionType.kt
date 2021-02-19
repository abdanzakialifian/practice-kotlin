fun main() {
    // mencetak konsol
    val printSum = sumType?.invoke(10,5,20,5)
    println(printSum)

    // dencetak konsol nilai null
    val printMultiply = multiplyType?.invoke(10,20,5,10)
    println(printMultiply)

}

// deklarasi typealias untuk menggabungkan function type yang sama
// dan bisa membuatnya nullable
typealias Arithmetic = ((Int,Int,Int,Int) -> Int)?

// menggunakan type alias
val sumType: Arithmetic = {value1, value2, value3, value4 -> value1 + value2 + value3 + value4 }
val multiplyType: Arithmetic = {valueA, valueB, valueC, valueD -> valueA * valueB * valueC * valueD}