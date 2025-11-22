package org.example.lesson7

fun main() {

    print("Введите количество знаков в пароле (не меньше $MIN_SIZE_OF_PASSWORD): ")
    val amountOfCharacters = readln().toInt()

    if (amountOfCharacters < MIN_SIZE_OF_PASSWORD) {
        println("Ваш пароль меньше $MIN_SIZE_OF_PASSWORD символов, пропробуйте еще раз.")
        return
    }

    val digitsRange = 0..9
    val lowercaseLettersRange = 'a'..'z'
    val capitalLettersRange = 'A'..'Z'
    val complexRangeOfSymbols = (digitsRange + lowercaseLettersRange + capitalLettersRange).shuffled()
    var complexPassword = digitsRange.random().toString() +
            lowercaseLettersRange.random() + capitalLettersRange.random()

    for (i in 4..amountOfCharacters) {
        complexPassword += complexRangeOfSymbols[i]
    }
    println(complexPassword)
}

const val MIN_SIZE_OF_PASSWORD = 6