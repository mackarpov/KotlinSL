package org.example.lesson8

fun main() {

    val arrayOfIngredients = arrayOf("мороженое", "молоко", "малина", "бананы", "корица")

    print("Какой ингредиент вы хотите найти? ")
    val userIngredient = readln()

    if (userIngredient in arrayOfIngredients) {
        println("Ингредиент [$userIngredient] в рецепте есть")
        return
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}