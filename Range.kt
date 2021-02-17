fun main() {
    val rangeInt = 1..10
    // untuk mendapatkan rentan nilai / jarak antar nilai
    println(rangeInt.step)

    // mengubah step / jarak
    val ranges = 1..10 step 2
    println(ranges)

    // fungsi range to sama dengan tanda .. diatas
    val numberInt = 1.rangeTo(20)
    numberInt.forEach { print("$it ") }
    println()

    // fungsi down tountuk membalikkan nilai
    val downInt = 10.downTo(1)
    downInt.forEach { print("$it ") }
    println()

    // cek apakah suatu nilai berada diantara nilai range
    val tenToOne = 10.downTo(1)
    val value = 9
    if(value in tenToOne) {
        println("Value $value available")
    }

    // range character
    val alfabeth = 'A'
    val alfabethRange = 'A'.rangeTo('J')
    println(alfabethRange)
}