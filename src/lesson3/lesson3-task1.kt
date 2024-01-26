package lesson3

const val DAY = "Good afternoon,"
const val NIGHT = "Good evening,"
const val USER_NAME = "Alex"
fun main(){

    println(greetings(DAY))
    println(greetings(NIGHT))
}
fun greetings(dayTime: String): String{
    val greetings: String = if (dayTime == DAY) {
        "$DAY $USER_NAME"
    } else {
        "$NIGHT $USER_NAME"
    }
    return greetings
}