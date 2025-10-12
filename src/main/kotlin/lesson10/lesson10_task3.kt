package org.example.lesson10

fun main() {

    print("Введите количество символов в пароле: ")
    val length = readln().toInt()

    println(makeUserPassword(length))
}

fun makeUserPassword(length: Int): String {
    val digitsRange = 0..9
    val specialSymbolsRange = ' '..'/'
    var userPassword = ""

    do {
        userPassword += "${digitsRange.random()}"

        if (userPassword.length < length) {
            userPassword += "${specialSymbolsRange.random()}"
        }
    } while (userPassword.length < length)

    return userPassword
}
