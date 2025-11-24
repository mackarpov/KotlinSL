package org.example.lesson_11

class Room(
    val cover: String,
    val title: String,
    var listOfUsers: MutableList<User3>,
) {
    fun addUserToRoom(user: User3) {

    }

    fun updateUserStatusInTheRoom(user: User3) {

    }
}

class User3(
    val nickname: String,
    val avatar: String,
    val userStatus: List<String>,
)

fun main() {

    val user = User3("nickname", "avatar", listOf("разговаривает", "микрофон выключен", "пользователь заглушен"))

    val room = Room("cover", "title", mutableListOf(user))
}