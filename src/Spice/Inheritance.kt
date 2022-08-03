package Spice

import Aquarium.Colors
import Aquarium.Colors2

abstract class Spice {
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

enum class Color(rgb:Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    YELLOW(0xFFFF00),
}
object YellowSpiceColor : SpiceColor {
    override val color: Color
        get() = Color.YELLOW

}

//Delegation setting default color to spice color
class Curry(spiceColor: SpiceColor = YellowSpiceColor) : Spice(), Grinder, SpiceColor by spiceColor {
    override fun prepareSpice() {
        println("Spices are prepared")
    }

    override fun grind() {
        println("Spices are grinded")
    }

}

fun main(arg: Array<String>) {
    val curry = Curry()
    println("Curry color ${curry.color}")
    curry.prepareSpice()
}