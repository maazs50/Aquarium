package BeyondBasics

fun main(args: Array<String>){
runCollections()
}

fun runCollections(){
    val allBooks = listOf("Hamlet", "Romeo Juliet", "Half girlfriend")
    val library = mapOf(allBooks to "Shakespear")
    println(library.any{it.key.contains("Hamlet")})
    println(library)
    val moreBooks = mutableMapOf(allBooks to "Shakespear","Robert" to "Rich dad poor dad")
    val book = moreBooks.getOrPut(",Nepoel"){"Think and grow rich"}
    println(book)
    println(moreBooks)
}