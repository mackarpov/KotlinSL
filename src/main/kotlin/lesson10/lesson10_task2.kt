package org.example.lesson10

fun main() {

    println("Придумайте логин и пароль длиной не менее 4 символов каждый!")

    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    if (checkTheLength(login, password)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные!")
    }
}

fun checkTheLength(login: String, password: String): Boolean {
    return login.length >= NUMBER_OF_SYMBOLS && password.length >= NUMBER_OF_SYMBOLS
}

const val NUMBER_OF_SYMBOLS = 4