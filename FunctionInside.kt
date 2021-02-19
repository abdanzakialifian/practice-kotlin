fun main() {
    println(sum(-5,-2,-3))
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int{
    fun validate(number: Int): Int {
        return if (number < 0) {
            number * -1
        } else {
            number
        }
    }

    val numbers1 = validate(valueA)
    val numbers2 = validate(valueB)
    val numbers3 = validate(valueC)

    return numbers1 + numbers2 + numbers3
//    return "Hasil dari $valueA + $valueB + $valueC = ${valueA + valueB + valueC}"
}