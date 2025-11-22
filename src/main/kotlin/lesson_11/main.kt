package org.example.lesson_11

class User (
    val userID: Int,
    val userLogin: String,
    val userPassword: String,
    val userEmail: String,
)

fun main() {

    val user1 = User(
        userID = 1,
        userLogin = "Login1",
        userPassword = "Password1",
        userEmail = "user1@gmail.com"
    )

    val user2 = User(
        userID = 2,
        userLogin = "Login2",
        userPassword = "Password2",
        userEmail = "user2@gmail.com"
        )

    println("User1 Id = ${user1.userID}")
    println("User1 Login = ${user1.userLogin}")
    println("User1 Password = ${user1.userPassword}")
    println("User1 Email = ${user1.userEmail}")

    println()

    println("User2 Id = ${user2.userID}")
    println("User2 Login = ${user2.userLogin}")
    println("User2 Password = ${user2.userPassword}")
    println("User2 Email = ${user2.userEmail}")
}