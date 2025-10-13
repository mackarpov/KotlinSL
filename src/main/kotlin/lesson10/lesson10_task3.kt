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

    for (i in 1 .. length) {
        if (i % 2 == 0) {
            userPassword += specialSymbolsRange.random()
        } else {
            userPassword += digitsRange.random()
        }
    }

    return userPassword
}
