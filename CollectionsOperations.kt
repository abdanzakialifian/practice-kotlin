fun main() {
    // filter
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val listFilter = numberList.filter { it % 2 == 0 }
    println(listFilter)

    println("=====================================")

    // filter not (kebalikan dari filter)
    val listNotFilter = numberList.filterNot { it % 2 == 0 }
    println(listNotFilter)

    println("=====================================")

    // map
    val listMap = numberList.map { it * 2 }
    println(listMap)

    println("=====================================")

    // count
    val listCount = numberList.count()
    println(listCount)
    val listCount2 = numberList.count { it % 2 == 0 }
    println(listCount2)

    println("=====================================")

    // find
    val firstOddNumber = numberList.find { it % 2 == 1 }
    println(firstOddNumber)

    println("=====================================")

    // first or null (jika nilai tidak tersedia malah akan keluar null)
    val firstOrNull = numberList.firstOrNull{ it % 2 == 3}
    println(firstOrNull)

    println("=====================================")

    // last or null (jika nilai tidak tersedia malah akan keluar null)
    val lastOrNull = numberList.lastOrNull { it % 2 == 0 }
    println(lastOrNull)

    println("=====================================")

    // first (jika nilai tidak tersedia malah akan keluar exception)
    val listFirst = numberList.first()
    println(listFirst)

    println("=====================================")

    // last (jika nilai tidak tersedia malah akan keluar exception)
    val listLast = numberList.last()
    println(listLast)

    println("=====================================")

    // sum
    val listSum = numberList.sum()
    println(listSum)

    println("=====================================")

    // sorted ascending dan descending
    val nameChar = listOf('A', 'B','D','A','N')
    // ascending
    println(nameChar.sorted())
    // descending
    println(nameChar.sortedDescending())

}