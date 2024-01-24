package lesson1

import kotlin.math.round

const val SECONDS_PER_MINUTE: Int = 60
const val MINUTES_PER_HOUR: Int = 60
const val HOURS_PER_DAY: Int = 24 //также константа поскольку величина постоянная
fun main() {

    val totalSeconds = 6480
    val tempSeconds = totalSeconds % (SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY)
    val secondsLeft = tempSeconds % SECONDS_PER_MINUTE
    val minutesLeft  = round((tempSeconds % (SECONDS_PER_MINUTE * MINUTES_PER_HOUR)).toDouble() / SECONDS_PER_MINUTE).toInt()
    val hoursLeft = round((tempSeconds / (SECONDS_PER_MINUTE * MINUTES_PER_HOUR)).toDouble()).toInt()

    val fullTimeFormat = String.format("%02d:%02d:%02d", hoursLeft, minutesLeft, secondsLeft)


    print(fullTimeFormat)

}