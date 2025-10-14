package org.example.lesson10

fun main() {

    var userWin = 0

    do {
        userWin += runTournament()

        print("Хотите продолжить (Да/Нет)? ")
        val userAnswer = readln()

    } while (userAnswer.equals("Да", ignoreCase = true))

    println("Пользователь выиграл $userWin партии!")
}

fun rollTheDice(): Int = (1..6).random()

fun runTournament(): Int {
    println("Ход игрока!")
    val humanNumber = rollTheDice()
    println("Число на кубике: $humanNumber")

    println("Ход компьютера!")
    val computerNumber: Int = rollTheDice()
    println("Число на кубике: $computerNumber")

    when {
        humanNumber > computerNumber -> {
            println("Победило человечество!\n")
            return 1
        }
        humanNumber < computerNumber -> {
            println("Победила машина!\n")
            return 0
        }
        else -> {
            println("Победила дружба!\n")
            return 0
        }
    }
}