fun main() {
    val catClass = Cat("Preety", 3.7, 3, true, "orange", 10)
    println("""
        Name: ${catClass.name}
        Weight: ${catClass.weight}
        Age: ${catClass.age}
        Carnivore ${catClass.isCarnivore}
        Color: ${catClass.furColor}
        Number of Feet: ${catClass.numberOfFeet}
    """.trimIndent())
    catClass.playWithHuman()
    catClass.eat()
    catClass.sleep()
}
abstract class Animalss(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur!")
    }
}

class Cat(cName: String, cWeight: Double, cAge: Int, cIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int) : Animalss(cName, cWeight, cAge, cIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama manusia")
    }
    override fun eat() {
        println("$name sedang makan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur dibantal!")
    }
}