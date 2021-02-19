fun main() {
    // run
    val number = 20
    val result = number.run {
        val value1 = 10
        val value2 = this
        "Hasil dari $value1 * $value2 adalah ${value1 * value2}"
    }
    println(result)


    println("====================")

    // with
    val nameUser = mutableListOf("Zaki", "Dini", "Samiya")
    val result2 = with(nameUser) {
        println("'with' is called argument $this")
        println("size in value is ${this.size}")
    }

    println("====================")

    // apply
    val students = Student().apply {
        name = "Zaki"
        age = 21
    }
    println(students)

    println("====================")

    // let
    val letType: String? = null
    letType?.let {
        println("text length ${it.length}")
    } ?: run {
        println("message is null")
    }

    println("====================")

    // also
    val helloLanguage = "Hello Kotlin"
    val alsoResult = helloLanguage.also {
        println("value length -> ${it.length}")
    }
    println("text -> $alsoResult")
}

data class Student(var name: String ="Dini", var age: Int=20)