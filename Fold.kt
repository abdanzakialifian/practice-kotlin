fun main() {
    // fold
    val numbers = listOf(1,4,6)
    val fold = numbers.fold(5) {current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    println("======================")

    val numbers2 = listOf(1,5,10)
    val fold2 = numbers2.foldRight(10) {item, current ->
        println("Current $current")
        println("Item $item")
        println()
        item + current
    }
    println(fold2)
}