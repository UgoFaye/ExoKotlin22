fun main() {
    val direction = 3
    val result = when (direction) {
        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "move right"
        else -> "error !"
    }
    println(result)
}
