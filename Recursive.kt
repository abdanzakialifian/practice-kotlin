fun main() {
    println(factorial(5))

    println("=================")

    println(factorialFunction(5))
}

// recursive function
fun factorial(n: Int): Int {
    return if( n == 1) {
        n
    } else {
        n * factorial(n-1)
    }
}

// tail reursive
tailrec fun factorialFunction(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if(n == 1) {
        newResult
    } else {
        factorialFunction(n - 1, newResult)
    }
}
