package org.example.lesson2

fun main() {

    val numberOfPermanentEmployees = 50
    val salaryOfOnePermanentEmployee = 30000
    val numberOfInterns = 30
    val salaryOfOneIntern = 20000
    val totalSalaryForPermanentEmployees = numberOfPermanentEmployees * salaryOfOnePermanentEmployee
    val totalSalaryCosts = totalSalaryForPermanentEmployees + (numberOfInterns * salaryOfOneIntern)
    val averageSalaryPerEmployee = totalSalaryCosts / (numberOfPermanentEmployees + numberOfInterns)

    println(totalSalaryForPermanentEmployees)
    println(totalSalaryCosts)
    println(averageSalaryPerEmployee)
}