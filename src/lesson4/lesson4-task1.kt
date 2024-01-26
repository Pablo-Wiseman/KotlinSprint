package lesson4


const val TOTAL_TABLES = 13
fun main(){

    val isBookedToday = 13
    val isBookedTomorrow = 9

    println(
        "Vacant tables for today: ${if (isBookedToday == TOTAL_TABLES) "No" else "Yes"}\n" +
        "Vacant tables for tomorrow: ${if (isBookedTomorrow == TOTAL_TABLES) "No" else "Yes"}"
    )


}
