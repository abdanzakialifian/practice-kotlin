fun main() {
    // deklarasi lambda sederhana
    val message = { println("Hello from lambda")}
    message()

    println("=============================")

    // menambahkan parameter pada lambda
    val sayHello = {name: String -> println("Hello drom $name")}
    sayHello("Zaki")

    println("=============================")

    // return type lambda
    val multiply: (Int,Int) -> Int = {number1,number2 -> number1 * number2}
    println(multiply(20,10))

}

