fun main() {
    val cat = Animall("Garfield")
    cat.eat()
    cat.eat("Wishcas")
    cat.eat("Wishcas", 500.0)
    cat.sleep()

    println("=======================")

    val sum = Calculator()
    println(sum.add(10,20))
    println(sum.add(10,20,30))
    println(sum.add(10.0, 20.0))
    println(sum.add(10F, 20F))
}

// overloading
// bisa memiliki bebrapa nama fungsi yang sama tetapi memiliki jumlah parameter yang berbeda
class Animall(private var name: String) {
    fun eat() {
        println("$name sedang makan!")
    }

    fun eat(typeFood: String) {
        println("$name sedang memakan $typeFood")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name sedang memakan $typeFood sebanyal $quantity gram")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }
}

// contoh overloading ke 2
// memiliki beberapa fungsi dan jumlah parameter yang sama tapi memiliki type data yang berbeda
class Calculator {
    fun add(valueA: Int, valueB: Int) = valueA + valueB
    fun add(valueA: Int, valueB: Int, valueC: Int) = valueA + valueB + valueC
    fun add(valueA: Double, valueB: Double) = valueA + valueB
    fun add(valueA: Float, valueB: Float) = valueA + valueB
}