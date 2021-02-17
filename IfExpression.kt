fun main() {
    val openOffice = 7
    val now = 7

    if(openOffice < now) {
        println("Office already open")
    } else if(openOffice == now) {
        println("Wait a minute, Office will be open")
    } else {
        println("Office closed")
    }

    println("========================")

    // if expression sebagai nilai kembalian
    val angka1 = 10
    val angka2 = 20
    val result = if(angka1 > angka2) {
        "Benar, $angka1 lebih besar dari $angka2"
    } else {
        "Salah, $angka1 lebih kecil dari $angka2"
    }

    println(result)
}