fun main() {
    val cat = Animal("Garield", 3.2, 2, true)
    println("""
        Nama: ${cat.name}
        Umur: ${cat.age} tahun
        Brat : ${cat.weight}Kg
        Mamalia: ${cat.isMamal}
    """.trimIndent())
    cat.eat()
    cat.sleep()
}

class Animal(val name: String, val weight: Double, val age: Int, val isMamal: Boolean) {
    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name sleep!")
    }
}