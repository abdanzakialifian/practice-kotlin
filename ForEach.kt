fun main() {
    val ranges = 1.rangeTo(10)
    ranges.forEach {
        println(it)
    }

    println("=============")

    // forEach untuk mendapatkan index
    val numbers = 1..20 step 2
    numbers.forEachIndexed { index, value ->
        println("Value $value with index $index")
    }
}