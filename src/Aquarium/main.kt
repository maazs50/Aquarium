package Aquarium

fun main(args: Array<String>){
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length}\nWidth: ${myAquarium.width}\nHeight ${myAquarium.height}")
    myAquarium.height = 80
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(20,15,30)

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("My Aquarium2: ${myAquarium2.volume} liters with "+
            "width ${myAquarium2.width} "+
            "length ${myAquarium2.length} "+
            "height ${myAquarium2.height}")
}

fun makeFish(){
    val shark = Shark()
    val plecostomus = Plecostomus()
    println("Shark ${shark.color} Plecostomus ${plecostomus.color}")
    shark.eat()
    plecostomus.eat()
}
