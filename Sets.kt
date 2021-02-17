fun main() {
    // deklarasi fungsi set collection
    // fungsi set akan menhilangkan data yang terduplikasi
    val number = setOf(1,2,3,4,2,5,3,6,7,2,8,9,4,10)
    println(number)

    println("========================================")

    // urutan pada set tidak lah penting asalkan data yang ada didalamnya sama
    val number2 = setOf(1,3,4,2,6,5,7,9,8,10)
    println(number == number2)

    println("========================================")

    // mengecek apakah suatu data berada didalam sebuah objek
    println(9 in number)

    println("========================================")

    // untuk mengetahui gabungan dan irisan dari set
    val number3 = setOf(1,5,7,2,11,12,13,14,15)
    println(number.union(number3))
    println(number.intersect(number3))

    println("========================================")

    // memanipulasi set (tidak bisa mengubah nilai)
    val number4 = mutableSetOf(1,3,4,5,7,9,10)
    number4.add(11)
    number4.addAll(setOf(12,13,14,15))
    println(number4)
}