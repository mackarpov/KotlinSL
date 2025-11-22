package org.example.lesson5

fun main() {

    print("Введите имя пользователя для входа в систему: ")
    val userName = readln()

    if (userName == USER_LOGIN) {
        println("Вы зарегистрированный пользователь.")
        print("Введите ваш пароль для входа в систему: ")

        val userPassWord = readln()

        if (userPassWord == USER_PASSWORD) {
            print("Добро пожаловать, $USER_LOGIN!")
        } else {
            println("Пароль неверный.")
            return
        }
    } else {
        println("Вас нет в списке. Предлагаю вам зарегистрироваться")
        return
    }
}

const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"