fun main() {
    // for menggunakan ranges
    val ranges = 1..10
    for(i in ranges) {
        println("value is $i")
    }

    println("==================")

    // for menggunakan range step
    val numbers = 10.downTo(1) step 3
    for(index in numbers) {
        println(index)
    }

    println("==================")

    // for untuk mengakses index range
    val indexing = 1.rangeTo(10)
    for ((index, value ) in indexing.withIndex()) {
        println("Value is $value with index $index")
    }
}