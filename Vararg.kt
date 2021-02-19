fun main() {
    val arrayInt = intArrayOf(5,10,20,15)
    val sum = sumNumber("Zaki",5,5,10,30,20,15,10,*arrayInt,5)
    println(sum)
}

// deklarasi vararg
fun sumNumber(name: String, vararg number: Int): Int {
    return number.size
}