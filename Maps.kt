fun main() {
    // map (dapat menyimpan dengan format key dan value)
    // posisi pada sebelah kiri disebut key dan disebelah kana disebut value
    val capital = mapOf(
        "Indonesia" to "Jakarta",
        "England" to "London",
        "India" to "New Dehli"
    )

    // cara untuk mendapatkan value
    println(capital["Indonesia"])

    println("=====================")

    // menampilkan daftar key
    // akan mengembalikan nilai berupa set karena key haruslah unik
    println(capital.keys)

    println("=====================")

    // menampilkan daftar value
    println(capital.values)

    println("=====================")

    // menambahkan key dan value kedalam map
    val buah = mutableMapOf(
        "Manalagi" to "Mangga",
        "Musang King" to "Durian",
        "Binjai" to "Rambutan"
    )

    buah.put(
        "Ambrosia",
        "Apel"
    )
    buah.put(
        "Champaka",
        "Nanas"
    )
    println(buah)
}