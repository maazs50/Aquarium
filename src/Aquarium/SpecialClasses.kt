package Aquarium

object MobiDickWhale{
    fun jump(){
        println("Jump")
    }
    val author = "Herman Melville"
}

enum class Colors(var rgb: Int){
    RED(0xFF0000),
    BLUE(0x00FF00),
    GREEN(0x0000FF)
}
enum class Colors2(){
    RED,
    BLUE,
    GREEN
}

sealed class Seal{
    fun fun1() {
        println("this is a sealed class")
    }
}

class Walrus: Seal()
class Sealion: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal){
        is Walrus -> "Walrus"
        is Sealion -> "Sealion"
    }
}

fun main(args: Array<String>){
    val seal = Sealion()
    println(matchSeal(seal))
    seal.fun1()
    println(Colors2.BLUE)
}