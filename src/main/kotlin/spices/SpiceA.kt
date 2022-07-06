package spices


fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val currySpicy = Curry(spiciness = "spicy")
    println("Spice name: ${currySpicy.name} level: ${currySpicy.heat} color: ${currySpicy.color} ")
    val curryContainer = SpiceContainer(currySpicy)
    println("Label container: ${curryContainer.label}")

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}

sealed class SpiceA(val name: String, private val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {

    val heat: Int
        get() = when(spiciness){
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }
    init {
        //println("Spice name: $name level: ${this.heat}")
    }
    abstract fun prepareSpice()
}

interface Grinder{
    fun grind()
}

interface SpiceColor{
    val color: Color
}

object YellowSpiceColor: SpiceColor{
    override val color = Color.YELLOW
}

class Curry(name:String = "Curry", spiciness: String, color: SpiceColor = YellowSpiceColor ) : SpiceA(name, spiciness, color), Grinder{
    override fun grind() {
        println("spice grinded")
    }
    override fun prepareSpice() {
        grind()
    }
}

data class SpiceContainer(val spice: SpiceA){
    val label = spice.name
}
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF),YELLOW(0xFFFF00);
}