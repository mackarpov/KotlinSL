package org.example.lesson_11

fun main() {

    val user1 = User(
        id = 1,
        login = "Login1",
        password = "Password1",
        email = "user1@gmail.com"
    )

    val user2 = User(
        id = 2,
        login = "Login2",
        password = "Password2",
        email = "user2@gmail.com"
    )

    println("User1 Id = ${user1.id}")
    println("User1 Login = ${user1.login}")
    println("User1 Password = ${user1.password}")
    println("User1 Email = ${user1.email}")

    println()

    println("User2 Id = ${user2.id}")
    println("User2 Login = ${user2.login}")
    println("User2 Password = ${user2.password}")
    println("User2 Email = ${user2.email}")
}