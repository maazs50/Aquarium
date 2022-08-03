package Aquarium

abstract class AquariumFish {
    abstract var color: String
}

interface FishAction{
    fun eat()
}

class Shark() : AquariumFish(), FishAction {
    override var color: String = "gray"
    override fun eat() {
        println("Hunt and eat fishes")
    }
}

class Plecostomus() : AquariumFish(), FishAction{
    override var color: String = "Gold"
    override fun eat() {
        println("Eat algae")
    }
}