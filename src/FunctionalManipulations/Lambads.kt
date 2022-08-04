package FunctionalManipulations

fun main() {
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println( numbers.divideBy3())
}


fun List<Int>.divideBy3() : List<Int>{
    return this.filter {num ->
        num % 3 == 0
    }
}