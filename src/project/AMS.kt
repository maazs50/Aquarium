package demo

import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
    eagerExample()
}

fun eagerExample(){
    val decorations = listOf("rock","pagoda","plastic plant","alligator","flowerpot")
    val eager = decorations.filter { decor -> decor[0] == 'p' }
    println(eager)
    // apply lazy filter
    val filtered = decorations.asSequence().filter { it[0]=='p' }
    println(filtered)
    println(filtered.toList())
    //apply map lazily
    val lazyMap = decorations.asSequence().map {
        it
    }
    println(lazyMap)
    println(lazyMap.first())
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if (shouldChangeWater(day)){
        println("Should change water today")
    }
    if (canAddFish(20.00, listOf(3,2,3,6))){
        println("Can add fish")
    }else{
        println("Can't add fish")
    }

}


fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}


fun fishFood(day: String): String {
    return when(day){
        "Sunday" ->  "plankton"
        "Monday" ->  "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        else -> "fasting"
    }
}


fun shouldChangeWater(day: String, temp: Int = 22, dirty: Int = 20): Boolean{
    return when{
        isTooDirty(dirty) -> true
        isTooHot(temp) -> true
        isSunday(day) -> true

        else -> false
    }
}
//One line functions(Helper functions)
fun isTooDirty(dirty: Int) = dirty > 30
fun isTooHot(temperature: Int) = temperature > 30
fun isSunday(day: String) = day == "Sunday"

fun canAddFish(gallons: Double,
                fishes: List<Int>,
                fishSize: Int = 2,
                hasDecorations: Boolean = true): Boolean{
    return (gallons * (if (hasDecorations) 0.8 else 1.0) >= (fishes.sum() + fishSize))
}