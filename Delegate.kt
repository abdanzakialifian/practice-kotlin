import kotlin.reflect.KProperty


fun main() {
    val animal = Animaal()
    animal.name = "Garfield"
    println("Nama Hewan: ${animal.name}")
    println("""
        Nama: ${animal.name}
        Umur: ${animal.age}
        Berat: ${animal.weight}
    """.trimIndent())

    println("==========================")

    val person = Persoon()
    person.name = "Dini"
    println("Nama Person: ${person.name}")

    println("==========================")

    val hero = Hero()
    hero.name = "Spiderman"
    println("Nama Hero: ${hero.name}")
}

// deklaration delegate
class DelegateName {
    private  var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
        println("Fungsi ini sama seperti setter untuk property ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animaal {
    // menggunakan delegate dengam kata kunci by
    var name: Any by DelegateName()
    var age: Any by DelegateName()
    var weight: Any by DelegateName()
}

class Persoon {
    var name: Any by DelegateName()
}

class Hero {
    var name: Any by DelegateName()
}