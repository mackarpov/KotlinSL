package org.example.lesson7

fun main() {

    print("Введите количество секунд для таймера: ")
    val amountOfSeconds = readln().toInt()

    for (i in amountOfSeconds downTo 0) {
        Thread.sleep(1000)
        println("До конца осталось: $i секунд")
    }
    println("Время вышло")
}
