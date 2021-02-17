fun main() {
    // mengecek nilai max dan min
    val minInt = Int.MIN_VALUE
    val maxInt = Int.MAX_VALUE
    val minLong = Long.MIN_VALUE
    val maxLong = Long.MAX_VALUE
    val minDouble = Double.MIN_VALUE
    val maxDouble = Double.MAX_VALUE

    println(minInt)
    println(maxInt)
    println(minLong)
    println(maxLong)
    println(minDouble)
    println(maxDouble)

    println("=======================")

    val valueA = 10
    val valueB = 3
    val valueC = 2

    // pembagian int akan dibulatkan ke bawah
    println(valueA / valueB)

    // gunakan tanda kurung jika ingin membuat operasi penjumlahan terlebih dahulu
    println((valueA + valueB) * valueC)

    // konversi data dari string ke integer
    val numberString = "123"
    val numberInt = 2 + numberString.toInt()
    println(numberInt)

    // number readable untuk menandakan jumlah angka agar tidak bingung
    val angka = 100_000_000
    println(angka)
}