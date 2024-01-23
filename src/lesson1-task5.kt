import kotlin.math.round

const val SECONDS: Int = 6480
fun main() {
    val tempSeconds = (SECONDS % (60 * 60 * 24))
    val secondsLeft = tempSeconds % 60
    val minutes = round((tempSeconds % (60 * 60)).toDouble() / 60).toInt()
    val hoursLeft = round((tempSeconds / (60 * 60)).toDouble()).toInt()

    val fullTimeFormat = String.format("%02d:%02d:%02d", hoursLeft, minutes, secondsLeft)


    print(fullTimeFormat)

}