package library

fun main(array: Array<String>){
    var bookPair = BookPair("Como tener exito solo","El gay de Coro",1990)
    var (title,author,year) = bookPair.getAllInfo()
    println("Here is your book “$title“ written by $author in ${year}.")

    mainBookC()
}

const val maxBorrow = 5

object BookConstant{
    const val BASE_URL = "www.pepito.com"
}


class BookPair (var title: String, var author: String, var year: Int) {
    fun getInfo(): Pair<String, String> {
        return title to author
    }

    fun getAllInfo(): Triple<String, String,Int> {
        return Triple(title , author, year)
    }

    fun canBorrow(countBorrow:Int): Boolean{
        return (countBorrow >= maxBorrow)
    }
    fun printURL(){
        println(BookConstant.BASE_URL + "\\" + title + "\\.html")
    }
    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }
}