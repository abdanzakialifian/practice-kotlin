fun main() {
    val toyota = Carss("Kijang", 2014)
    println(toyota.getCarsInfo)

    println("========================================")

    val humanObject = Humann("Zaki",21,70.0)
    println(humanObject.getInfoHuman)

}

class Carss(val name: String, val productionYears: Int)

// extension properties
val Carss.getCarsInfo: String
get() {
    return """
        Nama Mobil: $name
        Tahun Pembuatan: $productionYears
    """.trimIndent()
}

// contoh extension properti 2

class Humann(val name: String, val age: Int, val weight: Double)
val Humann.getInfoHuman: String
get() {
    return """
        Nama: $name
        Umur: $age
        Berat Badan: $weight
    """.trimIndent()
}