package lesson2

fun main() {

    val totalEmployeesCount = 80
    val newHiredEmployee = 30
    val tenuredEmployee = 50

    val newHiredEmployeeSalary = 20000
    val tenuredEmployeeSalary = 50000


    val expensesForTenuredEmployees = tenuredEmployee * tenuredEmployeeSalary
    val expensesForNewHiredEmployees = newHiredEmployee * newHiredEmployeeSalary
    val totalExpenses = expensesForTenuredEmployees + (newHiredEmployee * newHiredEmployeeSalary)
    val averageSalaryPerOneEmployee = (expensesForTenuredEmployees + expensesForNewHiredEmployees) / totalEmployeesCount

    println(expensesForTenuredEmployees)
    println(totalExpenses)
    println(averageSalaryPerOneEmployee)
}