package org.example.lesson6

fun main() {

    var amountOfAttempts = 3

    println("Для входа в приложение докажите, что Вы не бот!")

    while (amountOfAttempts > 0) {
        val numbersForCase = (FIRST_DIGIT..SECOND_DIGIT).shuffled().take(2)
        val firstNumber = numbersForCase[0]
        val secondNumber = numbersForCase[1]

        println("Сложите два числа: $firstNumber и $secondNumber ")
        print("Введите свой ответ: ")
        val userDecision = readln().toInt()

        when (userDecision) {
            firstNumber + secondNumber -> {
                println("Добро пожаловать!")
                return
            }

            else -> {
                amountOfAttempts--
                if (amountOfAttempts == 0) break
                println("Неверно. Попробуйте еще раз")
            }
        }
    }
    println("Доступ запрещен")
}

const val FIRST_DIGIT = 1
const val SECOND_DIGIT = 9