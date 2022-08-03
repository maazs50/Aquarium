package BeyondBasics

import demo.Book
import demo.eBook

fun main(args: Array<String>){
    println(getBookDetailsFormat())
    //Decomposing
    val (title, author) = getBookDetails()
    println(title)
    println(author)
    println(getBookDetails().first)
    println(getBookDetails().second)
    println("Here is the book $title written by $author")
}

fun getBookDetails(): Pair<String, String>{
    val book = Book("Time management", "brian tracy")
    return book.title to book.author
}

fun getBookDetailsFormat(): Triple<String, String, String>{
    val book = eBook("Time management", "brian tracy","Digital")
    return Triple(book.title ,book.author ,book.format)
}