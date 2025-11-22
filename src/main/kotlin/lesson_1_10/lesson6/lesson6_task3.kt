package org.example.lesson6

fun main() {

    print("Введите количество секунт для таймера: ")

    var amountOfSeconds = readln().toInt()

    while (amountOfSeconds > 0) {
        println("Осталось секунд: ${amountOfSeconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}