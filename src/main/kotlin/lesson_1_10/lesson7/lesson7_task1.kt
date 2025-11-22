package org.example.lesson7

fun main() {

    val rangeOfDigits = (0..9).shuffled().take(3)
    val rangeOfChars = ('a'..'z').shuffled().take(3)
    var password = ""

    for (i in rangeOfChars.indices) {
        password = password + "${rangeOfChars[i]}" + "${rangeOfDigits[i]}"
    }
    println(password)
}
