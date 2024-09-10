fun main() {
    val maison = "slytherin"
    val result = when (maison) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "maison invalide"
    }
    println(result)
}