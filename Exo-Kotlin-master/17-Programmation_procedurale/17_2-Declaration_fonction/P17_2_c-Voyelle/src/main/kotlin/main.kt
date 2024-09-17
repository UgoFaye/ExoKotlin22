fun isVowel(letter:Char) : Boolean{
 return (letter in listOf('a','e','i','o','u'))
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
