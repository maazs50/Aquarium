package FunctionalManipulations

class Game {
    var path = mutableListOf(Directions.START)
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = {
        path.add(Directions.END);
        println("Game over $path");
        path.clear();
        false
    }
    fun makeMove(command: String?){
        when(command){
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun move(where: () -> Boolean ){
    where.invoke()
//    where()
}
fun main(args: Array<String>) {
    val game = Game()
    while (true){
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}