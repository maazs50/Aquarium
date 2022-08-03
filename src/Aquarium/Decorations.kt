package Aquarium

data class Decorations(val rocks:String)

data class Decorations2(val rocks:String, val wood:String, val diver:String)

fun main(args: Array<String>){
    makeAquarium()
}

fun makeAquarium() {
    val d1 = Decorations("granite")
    val d2 = Decorations("slate")
    val d3 = Decorations("slate")
    println(d1.equals(d2))
    println(d2.equals(d3))

    val d4 = Decorations2("cyrstal", "wood","diver")
    println(d4)

    //Decomposition
    val (rock,wood,diver) = d4
    println(rock)
    println(wood)
    println(diver)
}
