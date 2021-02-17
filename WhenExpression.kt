import kotlin.random.Random

fun main() {
    val value = 9

    // cara penggunaan when expressions
    val result = when(value) {
        6 -> {
            println("Six")
            "numbmer is 6"
        }
        7 -> {
            println("Seven")
            "number is 7"
        }
        8 -> {
            println("Eight")
            "number is 8"
        }
        else -> {
            println("undefined")
            "number cannot be reached"
        }
    }
    println(result)

    println("============================")


    // when is
    val instance = "ZAKI"
    when(instance) {
        is String -> println("The value has a String type")
        !is String -> println("The value not a String type")
    }

    println("============================")

    // when range
    val values = 2
    val ranges = 1..10
    when(values) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    println("============================")

    // menangkap subjek
    val regisNumber = when(val regis = getRegisterNumber()) {
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(regisNumber)
}

fun getRegisterNumber() = Random.nextInt(100)