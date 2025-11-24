package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "Моя биометрия",
) {

    fun setNewBio() {
        print("Введите информацию о вашем BIO: ")
        bio = readln()
    }

    fun getUserInfo() {
        println("Информация о пользователе $id")
        println("UserID = $id")
        println("UserLogin = $login")
        println("UserPassword = $password")
        println("UserEmail = $email")
        println("UserBIO = $bio")
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val currentPassword = readln()
        if (currentPassword == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен")
        }
    }
}

fun main() {

    val user = User2(
        id = 1,
        login = "Dmitry",
        password = "Karpov",
        email = "karpov2713@gmail.com",
    )

    user.setNewBio()
    user.changePassword()
    user.getUserInfo()
}