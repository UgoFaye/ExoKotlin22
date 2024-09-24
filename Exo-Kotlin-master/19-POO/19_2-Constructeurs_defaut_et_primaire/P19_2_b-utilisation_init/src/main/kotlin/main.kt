fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var time: Int) {
    init {
        time = when {
            time < -128 -> -128
            time > 127 -> 127
            else -> time
        }
    }
}

/*class ByteTimer(var time: Int) {
    init {
        if (time < -128) {
            time = -128
        } else if (time > 127) {
            time = 127
        } else time = time
    }
}
fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}
 */