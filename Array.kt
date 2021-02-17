fun main() {
    // array bisa digunakan untuk berbagai macam tipe data
    val mixArray = arrayOf(1,2,3,4,5,"Zaki", true)
    // array direpresentasikan dengan tipe primitif
    val intArray = intArrayOf(1,2,4,5,6,7,9,10)
    // mendapatkan nilai tunggal dalam array
    println(mixArray[5])
    // mengubah nilai tunggal berdasarkan indexing
    intArray[1] = 3
    println(intArray[1])

    println("==========================================")

    // selain menggunakan arrayOf
    val arrayConstructor = Array(5) { i -> i + 1 }
    arrayConstructor.forEach {
        println(it)
    }
}