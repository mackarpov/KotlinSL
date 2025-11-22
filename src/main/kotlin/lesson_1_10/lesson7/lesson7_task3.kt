package org.example.lesson7

fun main() {

    println("Введите максимальное число прогрессии: ")

    val maxNumberOfProgression = readln().toInt()
    val userProgression: IntProgression = FIRST_PROGRESSION_NUMBER..maxNumberOfProgression step STEP_OF_PROGRESSION

    for (i in userProgression) {
        println(i)
    }
}

const val FIRST_PROGRESSION_NUMBER = 0
const val STEP_OF_PROGRESSION = 2