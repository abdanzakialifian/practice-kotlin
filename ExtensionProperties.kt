fun main() {
    println(30.sum)
}

//deklarasi extension properties
val Int.sum: Int
get() = this + this