fun main() {
    // pemanggilan return type
    println(setUser("Zaki", 21))
    println(calculate(10,10))

    // pemanggilan type unit
    address("Indonesia", "Banjarnegara")
}

// function return type
fun setUser(name: String, age: Int): String {
    return "Hello My name is $name and I age is $age years old"
}
// function return type menggunakan expression body
fun calculate(valueA: Int, valueB: Int) = valueA * valueB

// function unit type / tidak function yang tidak mengembalikan nilai
fun address(country: String, city: String) {
    println("Hay saya tinggal di negara $country tepatnya di kota $city")
}