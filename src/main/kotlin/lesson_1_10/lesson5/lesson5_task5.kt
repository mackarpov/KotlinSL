package org.example.lesson5

fun main() {

    val userListOfNumbers = mutableListOf<Int>()
    val mysteriousNumbers = (MINIMUM_DIGIT..MAXIMUM_DIGIT).shuffled().take(3)

    println("Для победы вам надо угадать 3 числа в диапазоне от $MINIMUM_DIGIT до $MAXIMUM_DIGIT")

    for (i in 1..3){
        print("Введите $i-е число в диапазоне от $MINIMUM_DIGIT до $MAXIMUM_DIGIT: ")
        userListOfNumbers.add(readln().toInt())
    }

    val matchingNumbers = userListOfNumbers.intersect(mysteriousNumbers)
    val amountOfMatchingNumbers = matchingNumbers.size

    when (amountOfMatchingNumbers) {
        3 -> println("Вы угадали все числа и выиграли джекпот!!!")
        2 -> println("Вы угадали два числа и выиграли крупный приз!!")
        1 -> println("Вы угадали одно число, вы получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа.")
    }

    println("Магические числа:")
    mysteriousNumbers.forEach { number ->
        print("$number ")
    }
}

private const val MINIMUM_DIGIT = 0
private const val MAXIMUM_DIGIT = 42