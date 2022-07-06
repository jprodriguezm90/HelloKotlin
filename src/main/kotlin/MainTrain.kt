
import java.util.*

fun main1(args: Array<String>) {
    var hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)//args[0].toInt()
    //println(hour)
    println (when(hour){
        in 0..11 -> "Good morning, Kotlin"
        in 12..23 -> "Good night, Kotlin"
        else -> ""
    })
    if (hour < 12) println("Good morning, Kotlin")
    else println("Good night, Kotlin" )

    println("${if (hour < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")

    println("Hello ${args[0]}!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is today?")
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (day){
        1 -> println("SUNDAY")
        2 -> println("MONDAY")
        3 -> println("TUESDAY")
        4 -> println("WEDNESDAY")
        5 -> println("THURSDAY")
        6 -> println("FRIDAY")
        7 -> println("SATURDAY")
        else -> println("OTHER")
    }

}
