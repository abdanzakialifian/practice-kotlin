fun main() {
    println(multiply(10,10))

    println("==========================")

    val numberOfRange = 1.rangeTo(10)
    val eventNumbers = numberOfRange.filter(::isFilter)
    println(eventNumbers)

    println("==========================")

    val eventNumbers2 =  numberOfRange.filter(Int::odd)
    println(eventNumbers2)

    println("==========================")

    println(::messages.name)
    println(::messages.get())
    ::messages.set("Zaki")
    println(::messages.get())
}
// function references
val multiply: (Int,Int) -> Int = ::count
fun count(valueA: Int, valueB: Int): Int = valueA * valueB

// function references
fun isFilter(number: Int) = number % 2 == 0

// extension function
fun Int.odd() = this % 2 == 1

// property references
var messages = "Abdan Zaki Alifian"