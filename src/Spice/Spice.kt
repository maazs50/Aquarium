package Spice

class Spice1(var name:String, var spiciness: String = "mild") {
    init {
        println("Spice name $name Spiciness level $spiciness")
    }
    val heat
        get() = when(spiciness){
            "mild" -> "5"
            else -> "0"
        }
}