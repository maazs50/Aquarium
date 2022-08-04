package FunctionalManipulations

import kotlin.reflect.typeOf

data class Fish1(var name:String)
fun main() {
    fishExamples1()
    higherfunc("It is my life",::println)
    println( someMethod(2, {println("This is your learning phase")}) )
}

fun fishExamples1(){
    val fish = Fish1("splashy")
    val name = with(fish.name){
        capitalize()
    }
    println(name::class.simpleName)
}

inline fun myWith1(name: String, block: String.()-> Unit){
    name.block()
}


inline fun higherfunc( str : String, mycall :(String)-> Unit){
    // inovkes the print() by passing the string str
    mycall(str)
}

inline fun someMethod(a: Int, func: () -> Unit):Int {
    func()
    return 2*a
}