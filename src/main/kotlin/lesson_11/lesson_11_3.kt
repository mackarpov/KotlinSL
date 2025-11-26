package org.example.lesson_11

class Room(
    val cover: String,
    val title: String,
    val listOfUsers: MutableList<User3> = mutableListOf(),
) {
    fun addUserToRoom(user: User3) {
        listOfUsers += user
    }

    fun updateUserStatusInTheRoom(nickname: String, userStatus: String) {
        val foundUser = listOfUsers.find { it.nickname == nickname }?.userStatus = userStatus
    }
}

class User3(
    val nickname: String,
    val avatar: String,
    var userStatus: String,
)

fun main() {
    val room = Room("Комната", "Красная комната")
    val user1 = User3("Max", "Fenix", "разговаривает")
    val user2 = User3("John", "Cat", "пользователь заглушен")

    room.addUserToRoom(user1)
    room.addUserToRoom(user2)

    room.updateUserStatusInTheRoom("Max", "пользователь заглушен")
    room.updateUserStatusInTheRoom("John", "разговаривает")
}