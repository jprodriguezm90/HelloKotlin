import aquarium.*
import aquarium.FishAction
import spices.Spice


fun ClassesTest(args: Array<String>) {
    //buildAquarium()
    //buildSpices()
    //makeFish()
    //delegate()
    main3(args)
}

fun delegate() {
    val pleco = Plecostomus2()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction2{
    fun eat()
}

interface FishColor2{
    val color: String
}

class Plecostomus2(fishColor: FishColor2 = GoldColor): FishAction2 by PrintingFishAction("a lot of algae"), FishColor2 by fishColor

object GoldColor: FishColor2{
    override val color: String = "gold"
}

object RedColor: FishColor2{
    override val color: String = "red"
}

class PrintingFishAction(val food: String): FishAction2{
    override fun eat() {
        println(food)
    }
}

private fun buildAquarium(){
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height} " )

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm" )
    println("Volume: ${myAquarium.volume} liters" )

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)

    println("Small Aquarium Volume: ${smallAquarium.volume} liters" )

    val smallAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2 Volume: ${smallAquarium2.volume} liters " +
            "Length: ${smallAquarium2.length} " +
            "Width: ${smallAquarium2.width} " +
            "Height: ${smallAquarium2.height} " )
}

fun feedFish(fish: FishAction) {
    // make some food then
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \n Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}

fun buildSpices(){
    val mySpice = Spice("curry")
    println("name: ${mySpice.name} " +
            "heat: ${mySpice.heat} " )

    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice("cayenne", spiciness = "spicy")

    val spicelist = spices1.filter {it.heat < 5}
}