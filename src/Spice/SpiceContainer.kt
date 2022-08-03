package Spice

data class SpiceContainer(val label: String)


fun main(args: Array<String>){
    printLabels()
}

fun printLabels(){
    val container = SpiceContainer("Dhaniya")
     println(container)
}
