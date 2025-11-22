package org.example.lesson7

fun main() {

    var authorizationCode: Int
    var userCode: Int

    do {
        authorizationCode = (1000..9999).random()
        println("Ваш код авторизации: $authorizationCode")

        print("Введите код авторизации: ")
        userCode = readln().toInt()
    } while (userCode != authorizationCode)

    println("Вы авторизировались!")
}