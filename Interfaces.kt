fun main() {

}
// deklarasi interface
// Pada umumnya penamaan sebuah interface dituliskan dengan awalan huruf I kapital.
interface IFly {
    // function
    fun fly()
    // variable tanpa inisialisasi
    val numberOfWings: Int
}

// implementasi interface
// override properti didalam cunstructor
class Birdd(override val numberOfWings: Int) : IFly {
    // override fungsi
    override fun fly() {
        println(" I flying without wings")
    }
}