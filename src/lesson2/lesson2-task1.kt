package lesson2

fun main(){

    val totalPoints = arrayOf<Byte>(3,4,3,5)
    val averagePoints = totalPoints.average()
    val averageFormattedPoints = String.format("%.2f",averagePoints)

    println(averageFormattedPoints)


}