package Aquarium.Generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater: WaterSupply(needsProcessing = true){
    fun addChemicalCleaners(){
        needsProcessing = false
    }
}

class FishStoreWater: WaterSupply(needsProcessing = false)

class LakeWater: WaterSupply(needsProcessing = true){
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<T: WaterSupply> (val waterSupply: T){
    fun addWater(){
        //Throws exceeption
        check(!waterSupply.needsProcessing) {"Water needs to be processed"}
        println("adding water from ${waterSupply}")
    }
}

fun genericExample(){
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
    aquarium.addWater()
    val aqua2 = Aquarium(LakeWater())
    aqua2.waterSupply.filter()
}

fun main(args: Array<String>) {
    genericExample()
}