package demo

open class Book(var title: String, var author: String) {
    var currentPage: Int = 0
    open fun readPage() {
        currentPage += 1
    }
}

class eBook(title: String, author: String, format: String = "text") : Book(title, author) {
    var wordCount = 0
    override fun readPage() {
        wordCount += 250
    }
}

fun main(args: Array<String>) {
    val eBook = eBook("Think and Grow rich", "Hill")
    for (i in 1..10){
        eBook.readPage()
        println("Page no $i and the word count is ${eBook.wordCount}")
    }
}