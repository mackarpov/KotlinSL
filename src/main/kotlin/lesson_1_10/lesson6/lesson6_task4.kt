package org.example.lesson6

fun main() {

    var numberOfAttempts = 5

    println("Нужно угадать число в промежутке от $MINIMUM_DIGIT до $MAXIMUM_DIGIT")
    println("У Вас $numberOfAttempts попыток!")

    do {
        print("Введите ваше число: ")
        val userNumber = readln().toInt()

        when (userNumber) {
            HIDDEN_NUMBER -> {
                println("Это была великолепная игра!")
                return
            }
            else -> println("Неверно! Осталось ${--numberOfAttempts} попытки")
        }
    } while (numberOfAttempts > 0)

    println("Было загадано число: $HIDDEN_NUMBER")
}

const val MINIMUM_DIGIT = 1
const val MAXIMUM_DIGIT = 9
private const val HIDDEN_NUMBER = 2

