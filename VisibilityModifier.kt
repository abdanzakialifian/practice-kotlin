fun main() {
    // public
    val humanObject = Humans("Zaki", 21)
    println(humanObject.name)
    println(humanObject.age)

    println("=====================================")

    // private
    val personObject = Person("Dini", 20)
    // error karena modifier private
    // cara mengatasinya menggunakan fungsi getter dan setter
    // menggunakan fungsi getter
     println(personObject.getName())
     println(personObject.getAge())
    // menggunakan fungsi setter
    personObject.setName("Samiya")
    println(personObject.getName())

    println("=====================================")

    // protected
    val snakeObject = Snake("Cobra", 2)
    println(snakeObject.name)
    // eror karena protected (tidak bisa diakses dari luar)
    //println(snakeObject.age)
}

// Public: Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.
class Humans(val name: String, val age: Int)

// Private: Hak akses yang cakupannya paling terbatas. Anggota yang menerapkannya hanya dapat diakses pada scope yang sama.
class Person(private var name: String, private var age: Int) {
    // getter
    fun getName(): String {
        return name
    }
    // setter
    fun setName(newName: String) {
        name = newName
    }
    fun getAge(): Int = age

    fun setAge(newAge: Int) {
        age = newAge
    }
}

// Protected: Hak akses yang cakupannya terbatas pada hirarki kelas. Anggota hanya dapat diakses pada kelas turunannya atau kelas itu sendiri.
abstract class AnimalPro(val name: String, protected val age: Int)
class Snake(sName: String, sAge: Int) : AnimalPro(sName,sAge)

// Internal: Hak akses yang cakupannya terbatas pada satu modul. Anggota yang menggunakannya tidak dapat diakses diluar dari modulnya tersebut.