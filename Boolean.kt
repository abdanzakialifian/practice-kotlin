fun main() {
    val officeOpen = 7
    val now = 21
    val officeClose = 20
    val isOpen = now < officeClose

    // conjunction &&
    val resultConjunction = now >= officeOpen && now <= officeClose
    println("Office is open : $resultConjunction")

    println("=================================")

    // disjunction ||
    val resultDisjunction = now >= officeOpen || now <= officeClose
    println("Office is open : $resultDisjunction")

    println("=================================")

    // not !
    if(!isOpen) {
        println("Office closed")
    } else {
        println("Office open")
    }
}