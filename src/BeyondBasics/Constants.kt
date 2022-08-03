package BeyondBasics

class Book{
    companion object{
        const val MAX_BOOKS = 5
    }
    fun canBorrow(count: Int): Boolean{
        return count < MAX_BOOKS
    }

}

fun main(args: Array<String>) {
    val book = Book()
    if (book.canBorrow(5)){
        println("Can borrow book")
    }else{
        println("Max limit done")
    }
}