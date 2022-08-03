package Aquarium

import kotlin.math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    open var volume
        get()= width * height * length/1_000
        set(value) {
            height * (value/1000) / (width*length)
        }
    //Inline function
//    fun volume() = (width * height * length)/1000
    open var water = volume * 0.9
    //Secondary constructor
    constructor(numberOfFish: Int): this(){
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank / (length*width)).toInt()
    }
}


//Inheritance
class TowerTank(): Aquarium(){
    override var volume: Int
        get() = (width*height*length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }
    override var water = volume * 0.8

}