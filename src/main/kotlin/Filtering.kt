import java.util.*
import kotlin.random.Random.Default.nextInt

fun main5(args: Array<String>) {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    spices.filter { it.contains("curry")}.sortedByDescending { it.length }
    spices.filter { it[0] == 'c' && it[it.length-1] == 'e' }
    spices.filter { it.startsWith('c') && it.endsWith('e') }
    spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }

    spices.take(3).filter { it[0] == 'c' }
    spices.take(3).filter { it.startsWith('c') }

    val rollDice0 = { Random().nextInt(12) + 1}
    var sides = 12
    val rollDice: (Int) -> Int = { nextInt(1,sides) }
    val rollDice2 = {sides: Int ->  nextInt(1,sides) }
    val rollDice3: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    gamePlay(12,rollDice3)
    gamePlay2(rollDice3(12))
}
fun gamePlay(sides:Int , operation: (Int) -> Int){
    println("result: ${operation(sides)}")
}
fun gamePlay2(operation:Int) {
    println("result: $operation")
}