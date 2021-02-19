fun main() {
    // named argument
    val fullName = getFullName(lastName = "Alifian", firstName = "Zaki", middleName = "Alifian")
    println(fullName)
}

fun getFullName(firstName: String, middleName: String, lastName: String): String {
    return "Hallo My name is $firstName $middleName $lastName"
}