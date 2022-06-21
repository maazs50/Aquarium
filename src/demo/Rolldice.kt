package demo

import java.util.Random

fun main(args: Array<String>){
    rollDice()
}

fun rollDice(){
    val rollDice = {Random().nextInt(12)}
    println(rollDice.toString())
}