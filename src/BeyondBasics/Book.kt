package BeyondBasics

import java.util.*

class BookEx(var pages: Int) {
    companion object{
        const val weight  = 1.5
    }
    fun  getTotalWeight() = pages * weight
}

class Puppy(val bookEx: BookEx){
    fun playWithBook(){
        println("Puppy playing with the book....")
        bookEx.tornPages(Random().nextInt(1,6))
    }
}
fun main(args: Array<String>){
    val book = BookEx(336)
    println("Pages in the book ${book.pages} with weight ${book.getTotalWeight().toInt()} grams")
    book.tornPages(5)
    println("Pages in the book ${book.pages} with weight ${book.getTotalWeight().toInt()} grams")
    val myDog = Puppy(book)
    myDog.playWithBook()
    println("Pages in the book ${book.pages} with weight ${book.getTotalWeight().toInt()} grams")
}

fun BookEx.tornPages(pages: Int){
    this.pages -= pages
    this.getTotalWeight()
}