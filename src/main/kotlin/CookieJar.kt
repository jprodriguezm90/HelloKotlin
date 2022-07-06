
fun main2i(args: Array<String>) {
    for (i in 1..10){
        var message = getFortuneCookie()
        println("Your fortune is: $message")
        if (message == "Take it easy and enjoy life!")
            break;
    }
}
fun getFortuneCookie() : String {
    val cookieMessages = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday: ")
    var birthday = readLine()?.toIntOrNull()

    println((birthday ?: 1).div(cookieMessages.count()))

    return cookieMessages[(birthday ?: 0).div(cookieMessages.count())]
}

fun main2(args: Array<String>) {
   println("\nYour fortune is: ${getFortuneCookie()}")
}

fun main20(args: Array<String>) {
   var fortune: String
   for (i in 1..10) {
      fortune = getFortuneCookie1()
      println("\nYour fortune is: $fortune")
      if (fortune.contains("Take it easy")) break
   }
}

fun getFortuneCookie1() : String {
   val fortunes = listOf( "You will have a great day!",
      "Things will go well for you today.",
      "Enjoy a wonderful day of success.",
      "Be humble and all will turn out well.",
      "Today is a good day for exercising restraint.",
      "Take it easy and enjoy life!",
      "Treasure your friends, because they are your greatest fortune.")
   print("\nEnter your birthday: ")
   val birthday = readLine()?.toIntOrNull() ?: 1
   return fortunes[birthday.rem(fortunes.size)]
}


fun main21(args: Array<String>) {
    for (i in 1..10){
        var message = getFortuneCookie2(getBirthday())
        println("Your fortune is: $message")
        if (message.contains("Take it easy and enjoy life!")) break;
    }
}
fun getFortuneCookie2(birthday : Int) : String {
    return when (birthday){
        in 1..4 -> "You will have a great day!"
        in 5..8 -> "Things will go well for you today."
        in 9..12 -> "Enjoy a wonderful day of success."
        in 13..16 -> "Be humble and all will turn out well."
        in 17..20 -> "Today is a good day for exercising restraint."
        in 21..24 -> "Take it easy and enjoy life!"
        in 25..31 -> "Treasure your friends because they are your greatest fortune."
        else -> ""
    }
}
fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}
