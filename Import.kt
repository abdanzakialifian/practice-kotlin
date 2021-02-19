import kotlin.random.Random
import kotlin.math.PI
// as atau alias untuk mengganti nama class/fungsi/variable
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar
// untuk mengimport seluruh class/fungsi/variable
import kotlin.math.*
// import pakcage com.zaki.oop.utils
import com.zaki.oop.utils.sayHello

fun main() {
    val someInt = Random(0).nextInt(1,10)
    println(PI)
    println(cosinus(120.0))
    println(akar(9.0))
    sayHello()
}