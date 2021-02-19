fun main() {
    val fullNameUser = getNameUser("Abdan")
    println(fullNameUser)
}

// default parameter
fun getNameUser(firstName: String = "Abdan", middleName: String = "Zaki", lastName: String = "Alifian"): String {
    return "Hay perkenalkan nama saya $firstName $middleName $lastName"
}