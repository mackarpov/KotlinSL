package org.example.lesson8

fun main() {

    print("Сколько ингредиентов будет в вашем рецепте? ")
    val numberOfIngredients = readln().toInt()
    val arrayOfIngredients = Array(numberOfIngredients){""}
    var nameOfIngredient = ""

    for (i in 0 until numberOfIngredients) {
        print("Какой ваш ${i + 1}-й ингредиент? ")
        nameOfIngredient = readln()
        arrayOfIngredients[i] = nameOfIngredient
    }

    print("Ваш рецепт: ${arrayOfIngredients.joinToString(", ")}")
}