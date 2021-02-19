fun main() {
    val numbers = listOf(1, 2, 1, 3, 4, 5, 3, 6, 7, 8, 5, 6, 9, 1, 10)
    // distinct
    val listDistinct = numbers.distinct()
    println(listDistinct)

    println("====================================")

    // distinct data class
    data class Item(val key: Int, val value: String)

    val items = listOf(
        Item(1, "Kotlin"),
        Item(2, "is"),
        Item(3, "Awesome"),
        Item(3, "as"),
        Item(3, "Programming"),
        Item(3, "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    println("====================================")

    // menyaring item yang sama dan mengurutkannya
    val text = listOf("A", "B", "C", "DDD", "EE", "FF", "GGG", "HHHH")
    val distinctItem = text.distinctBy {
        it.length
    }
    println(distinctItem)
}