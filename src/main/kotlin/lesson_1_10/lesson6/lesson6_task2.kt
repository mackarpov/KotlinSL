package org.example.lesson6

fun main() {

    print("Введите количество секунт для таймера: ")

    val amountOfSeconds = readln().toLong()

    Thread.sleep(amountOfSeconds * 1000)

    println("Прошло $amountOfSeconds секунд.")
}