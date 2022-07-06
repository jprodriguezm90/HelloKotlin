
fun main4(args: Array<String>) {
    var message:String
    do{
        print("How is your mood today: ")
        message = whatShouldIDoToday(readLine()!!)
        println("To do: $message")
    }while (!message.contains("Stay home"))
}


fun whatShouldIDoToday(mood: String, weather:String="sunny", temperature:Int=24) : String{

    return when {
        goForAWalk(mood,weather) -> "go for a walk"
        stayInBed(mood,weather,temperature) -> "stay in bed"
        isTooHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun goForAWalk (mood:String, weather:String) = mood == "happy" && weather == "sunny"
fun stayInBed (mood:String, weather:String, temperature:Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isTooHot (temperature:Int) = temperature > 35

