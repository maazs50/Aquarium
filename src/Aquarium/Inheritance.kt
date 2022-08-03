package Aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val fish = Plecostomus1()
    println("Fish color is ${fish.color}")
    fish.eat()
}

interface FishColor {
    val color: String
}

interface FishAction1 {
    fun eat()
}

class Plecostomus1() :
    FishColor by GoldColor,
    FishAction1 by PrintFishAction("Algae")

//Interface delegation
object GoldColor : FishColor {
    override val color: String = "gold"
}

//Interface delegation
class PrintFishAction(val food:String) : FishAction1{
    override fun eat() {
        println("Eats $food")
    }
}