package Lesson1
fun main(){
    val countOfSelectedItems: Int = 50
    val thanksMessage: String = "Thank you for your purchase"
    val firedEmployees: Int = 1
    var totalCountOfEmployees: Int = 2000
    totalCountOfEmployees = totalCountOfEmployees - firedEmployees

    println("your purchase: $countOfSelectedItems items \n$thanksMessage")
//    println("Employees: $countOfEmployees persons")

    println(totalCountOfEmployees)

}