package org.example.lesson6

fun main() {

    println("Для входа в приложение Вам необходимо авторизироваться!")

    print("Создайте Ваш логин: ")
    val userLogin = readln()

    print("Создайте Ваш пароль: ")
    val  userPassword = readln()

    do {
        print("Для входя введите логин: ")
        val login = readln()
        print("Для входа введите пароль: ")
        val password = readln()
    } while (login != userLogin || password != userPassword)

    println("Авторизация прошла успешно")
}