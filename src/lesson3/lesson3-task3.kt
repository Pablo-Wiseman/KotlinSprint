package lesson3

fun main(){

    val number = 6

    showMultiplicationTable(number)

}
fun showMultiplicationTable(number: Int){
    var ordinalNumbers: Int
    for (i in 1..10){
        ordinalNumbers = i * number
        println("$number × $i = $ordinalNumbers")
    }

}
