fun main() {
    // representasi type data string
    val text = "Hello everyone"

    // mendapatkan nilai dengan cara indexing
    val firstChar = text[0]
    println("First character on text is $firstChar")

    println("=========================================")

    // melakukan iterasi terhadap objek text yg bernilai string
    for (i in text) {
        println(i.toUpperCase())
    }

    println("=========================================")

    // escape string untuk mengurangi ambiguitas
    val escapeString = "Kotlin is \"Awesome!\""
    println(escapeString)
    val storange = "Local Disk C\\Program Files\\Kotlin"
    println(storange)

    println("=========================================")

    // menambahkam unicode kedalam sebuah string
    val unicode = "Unicode test :  \u00A9"
    println(unicode)

    println("=========================================")

    // raw string
    println("""
        Line 1
        Line 2
        Line 3
    """.trimIndent())
}