fun main() {
    // sequence
    val list = (1..1_000_000).toList()
    list.asSequence().filter { it % 10 == 0 }.map { it * 2 }.forEach { println(it) }

    println("=========================================")

    // objek sequence
    val sequence = generateSequence(1) {it + 1}
    // menggunakan fungsi take agar tidak terjadi infinite loop
    sequence.take(10).forEach { println(it) }
}