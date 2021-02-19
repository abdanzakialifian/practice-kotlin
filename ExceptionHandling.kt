fun main() {
    val a = 10
    val b = 0

    val div = 0
    try {
        val div = a / b
    } catch (e : ArithmeticException) {
        println("Devide by zero exception")
    } finally {
        println("Berhasil!")
    }
}
//try {
//    // Block try, menyimpan kode yang membangkitkan exception
//} catch (e: SomeException) {
//    // Block catch akan terpanggil ketika exception bangkit.
//}