package org.example.lesson10

fun main() {

    println("Ход игрока!")
    val humanNumber = getNumber()
    println("Число на кубике: $humanNumber")

    println("Ход компьютера!")
    val computerNumber: Int = getNumber()
    println("Число на кубике: $computerNumber")

    if (humanNumber > computerNumber) {
        println("Победило человечество!")
    } else if (humanNumber < computerNumber) {
        println("Победила машина!")
    } else {
        println("Победила дружба!")
    }
}

fun getNumber(): Int = (1..6).random()