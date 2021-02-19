fun main() {
    "Zaki".name()
    println(20.multiply())
}

// deklarasi extension function
fun String.name() {
    println("Hello $this")
}

// extension function return type
fun Int.multiply(): Int = this * 2