package org.example.lesson5

import java.util.Calendar

fun main() {

    print("Введите год вашего рождения: ")
    val userYearOfBirth = readln().toInt()
    val userAge = Calendar.getInstance().get(Calendar.YEAR) - userYearOfBirth

    if (userAge >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    }
}

const val AGE_OF_MAJORITY = 18