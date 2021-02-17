fun main() {
    // deklarasi list biasa
    val anyList = listOf(1,2,3,"Zaki", 'A', true)
    println(anyList)

    println("================================================")

    // memasukkan data class kedalam list
    val dataClass = listOf(1,3,5, SetData("Zaki", 21))
    println(dataClass)

    println("================================================")

    // mengakses posisi list menggunakan indexing
    println(anyList[3])

    println("================================================")

    // membuat list yang mutable (bisa rubah nilainya dll)
    val listMutable = mutableListOf("Zaki", 2, 4, true, 'A')
    // manipulasi data list mutable
    listMutable.add('B')
    listMutable.add(2,3)
    listMutable.remove(true)
    listMutable[0] = 1
    listMutable.addAll(4, listOf(5,6,7,8))
    println(listMutable)
}

data class SetData(val name: String, val age: Int)