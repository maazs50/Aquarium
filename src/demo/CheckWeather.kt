package demo

fun main(args: Array<String>){
    println(whatShouldIDoToday("Happy", "Sunny"))
    println("Sad")
    print("How do you feel?")
    print(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24): String{
    return when{
        isTooHotCW(temperature) -> "Go for walk"
        isSadRainyCold(mood,weather,temperature) -> "stay in bed"
        isHappySunny(mood,weather) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isTooHotCW(temperature: Int) = temperature > 35
fun isHappySunny(mood: String,weather: String) = mood =="Happy" && weather =="Sunny"
fun isSadRainyCold(mood: String,weather: String,temperature: Int) = mood == "Sad" && weather == "rainy" && temperature == 0