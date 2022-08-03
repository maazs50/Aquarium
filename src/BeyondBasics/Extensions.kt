package BeyondBasics

fun String.hasSpaces(): Boolean{
    val space = find { it == ' ' }
    return space!=null
}

fun main(args: Array<String>){
    var str = "This is an amazing technique"
    println( str.hasSpaces())

    val plant = GreenLeafyPlant(50)
    plant.print()

    val aquariumPlant = plant
    aquariumPlant.print()

    //This will print Aquarium plant, extension function refers the immediate object
    val aquariumPlant2: AquariumPlant = plant
    aquariumPlant2.print()

    val aquariumPlant3: AquariumPlant? = null
    aquariumPlant3.pull()
}

open class AquariumPlant(color: String, private val size: Int)
class GreenLeafyPlant(size:Int): AquariumPlant("Green",size)

fun AquariumPlant.print() = println("Aquraium plant")
fun GreenLeafyPlant.print() = println("Green Leafy plant")

fun AquariumPlant?.pull(){
    this.apply {
        println("Remove $this")
    }
}

