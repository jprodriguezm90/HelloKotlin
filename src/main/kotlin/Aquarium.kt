
fun main3(args: Array<String>) {
//    println(canAddFish(10.0, listOf(3,3,3)))// ---> false
//    println(canAddFish(9.0, listOf(1,1,3), 3))// ---> false
//    println(canAddFish(10.0, listOf(), 7, true))// ---> true
//    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))// ---> true

    funcList()

}
fun canAddFish(tankSize : Double, currentFish : List<Int> , fishSize : Int = 2 , hasDecorations : Boolean = true) : Boolean {
    return if(!hasDecorations)
        (tankSize - (currentFish.sum() + fishSize) ) >= 0.0
    else
        ((tankSize*0.8) - (currentFish.sum() + fishSize) ) >= 0.0
}

fun canAddFish2(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun funcList(){
    val testList = listOf(11,12,13,14,15,16,17,18,19,20)
    println(testList.reversed())

    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red")
    symptoms.contains("red spots")

    println(symptoms.subList(4, symptoms.size))

    val a = listOf(1, 5 , 3).sum()
    println(a)
    val b = listOf("a","b","cc").sumOf{ it.length }
    println(b)

    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["white spots"])

    println(cures.getOrDefault("bloating", "sorry I don't know"))

    cures.getOrElse("bloating"){ "No cure for this" }

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber" , 3)
    inventory.remove("fish net")

}

