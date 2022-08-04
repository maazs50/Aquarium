package FunctionalManipulations

data class Fish(var name:String)

fun main() {
fishExamples()
}

fun fishExamples(){
    val fish = Fish1("splashy")
    val name = with(fish.name){
        capitalize()
    }
    println(name)
    println(fish.run { name }) // returns last statement
    println(fish.apply { this.name = "fancy" }) // return the object
    println(fish.let { it.name.capitalize()}
        .let { it + "fish" })
    println(fish)
}

fun myWith(name: String, block: String.()-> Unit){
    name.block()
}