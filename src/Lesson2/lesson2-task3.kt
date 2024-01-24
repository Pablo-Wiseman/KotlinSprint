package lesson2

import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun main() {

    val departure: Duration = 9.hours + 39.minutes
    val duration: Duration = 457.minutes
    val arrival = departure + duration

    println("Train arrives at $arrival")

}