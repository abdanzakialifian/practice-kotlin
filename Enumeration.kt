fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    // pemanggilan untuk mendapatkan daftar objek enum
    val colors = enumValues<Color>()
    colors.forEach {
        println(it)
    }

    println("====================")

    // mendapatkan nama dari objek enum
    val color = enumValueOf<Color>("RED")
    println("Color is $color")

    println("====================")

    // mendapatkan popsisi index di enum
    println("Position BLUE is ${colorBlue.ordinal}")

    println("====================")

    // mengecek instance dari kelas enum itu sendiri
    val colorz = Color.GREEN

    when(colorz) {
        Color.RED  -> println("Color is RED")
        Color.GREEN -> println("Color is GREEN")
        Color.BLUE -> println("Color is BLUE")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("Value is RED")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("Value is GREEN")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("Value is BLUE")
        }
    };

    abstract fun printValue()
}
