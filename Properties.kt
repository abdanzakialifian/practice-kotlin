fun main() {
    val bird = Animalsss()
    println(bird.name)
    bird.name = "Kenari"
    println(bird.name)

    println("===================")

    val goCar = Car(name = "Kijang", color = "Black", productionYears = 2010)
    println("""
        Merk Car: ${goCar.merk}
        Car Name: ${goCar.name}
        Car Color: ${goCar.color}
        Production Yers: ${goCar.productionYears}
    """.trimIndent())

    println("===================")

    val setHuman = Human("Zaki", 21, 70.0, true)
    println("""
        Name: ${setHuman.name}
        Age: ${setHuman.age}
        Weight: ${setHuman.weight}
        Human: ${setHuman.isHuman}
    """.trimIndent())

    println("===================")
    // pemanggilan primary
    val cat = Animals("Garfield", 3.5, 3)
    println("""
        Name: ${cat.name}
        Weight: ${cat.weight}
        Age: ${cat.age}
    """.trimIndent())

    println()

    // pemanggilan secondary
    val catSecond = Animals("Joni",3.2,4,true)
    println("""
        Name: ${catSecond.name}
        Weight: ${catSecond.weight}
        Age: ${catSecond.age}
        isMamal: ${catSecond.isMamal}
    """.trimIndent())
}

// getter dan setter
class Animalsss{
    var name: String = "Cucak Rowo"
    get() = field
    set(value) {
        field = value
    }
}

// primary cunstructor and default constructor
class Car(val merk: String = "Toyota", val name: String, val color: String, val productionYears: Int) {
}

// Init
class Human(name: String, age: Int, weight: Double, isHuman: Boolean) {
    val name: String
    val age: Int
    val weight: Double
    val isHuman: Boolean

    // init
    init {
        this.name = name
        this.age = if(age < 0) 1 else age
        this.weight = if(weight < 0) 0.1 else weight
        this.isHuman = isHuman
    }
}

// secondary construtor
class Animals(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMamal: Boolean

    init {
        this.name = name
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 1 else age
        this.isMamal = false
    }

    // secondary
    constructor(name: String, weight: Double, age: Int, isMamal: Boolean) : this(name,weight,age) {
        this.isMamal = isMamal
    }
}