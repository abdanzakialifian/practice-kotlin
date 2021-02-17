fun main() {
    val listOfInt = listOf(1,2,3,4,null,6,7,null,9,null)

    // continue
    for (i in listOfInt) {
        if(i == null) continue
        println(i)
    }

    println("==============")

    // break
    for(j in listOfInt) {
        if (j == null) break
        println(j)
    }

    // label

    loop@ for(i in 1.rangeTo(10)) {
        println("Outside Loop")
        for (j in 1.rangeTo(10)) {
            if(j > 5) break@loop
            println("Inside Loop")
        }
    }
}