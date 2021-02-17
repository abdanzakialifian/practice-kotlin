fun main() {
    // class user
    val user = User("Zaki", 21)
    // data class data user
    val dataUser = DataUser("Zaki",21)
    val dataUser2 = DataUser("Dini", 20)
    val dataUser3 = DataUser("Zaki", 21)
    // menyalin objek data class
    val dataUser4 = dataUser2.copy()
    // menyalin dan mengganti data class
    val dataUser5 = dataUser.copy(name = "Kelvin")
    // destructuring declaration (memetakan objek menjadi variabel)
    val (name, age) = dataUser

    println("=============================")

    // perbandingan untuk mengetahui isi data class
    println(user)
    println(dataUser)

    println("=============================")

    // membandingan 2 buah object data class
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    println("=============================")

    // memyalin dan memodifikasi objek data class
    println(dataUser4)
    println(dataUser5)

    println("=============================")

    // memanggil destructuring declarations
    println("Hay my name is $name and my age $age years old")

    println("=============================")
    
    // memanggil fungsi yang ada di data class
    dataUser.intro()
}
data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

class User(val name: String, val age: Int)