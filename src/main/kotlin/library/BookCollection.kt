package library

fun mainBookC() {
    var allBooks = setOf("Hamlet", "Romeo y Julieta","Macbeth","La tempestad","El rey Lear","Ricardo III","Mucho ruido y pocas nueces","Julio Cesar")
    var library = mapOf("William Shakespeare" to allBooks)
    library.any { it.value.contains("Hamlet")}

    var moreBooks = mutableMapOf("Paulo Coelho" to "El Alquimista")

    moreBooks.getOrPut("Gabriel Garcia Marquez"){ "Cien años de soledad" }

    println(moreBooks)

}

