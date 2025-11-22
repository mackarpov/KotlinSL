package org.example.lesson5

fun main() {

    println("Для авторизации сложите два числа: $FIRST_DIGIT и $SECOND_DIGIT.")
    print("Введите ответ: ")

    val userAnswer = readln().toInt()

    if (userAnswer == FIRST_DIGIT + SECOND_DIGIT) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}

const val FIRST_DIGIT = 22
const val SECOND_DIGIT = 33