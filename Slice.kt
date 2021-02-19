fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    // slice
    val sliceNumbers = numbers.slice(3..7)
    println(sliceNumbers)

    println("===============================")

    // slice step
    val sliceStep = numbers.slice(1..7 step 2)
    println(sliceStep)

    println("===============================")

    // menggunakan list didalam argumen slice
    val index = listOf(2,4,6,8)
    val total = listOf(1,2,3,4,5,6,7,8,9,10)
    val sliceList = total.slice(index)
    println(sliceList)
}