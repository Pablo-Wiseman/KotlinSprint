package lesson2

import kotlin.math.pow

fun main(){
    val benefit: Double
    val deposit = 70_000
    val percent = 16.7

    benefit = deposit*(1+percent/100).pow(20)

    println(String.format("%.3f", benefit))
}