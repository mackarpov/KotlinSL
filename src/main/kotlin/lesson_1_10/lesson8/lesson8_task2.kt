package org.example.lesson8

fun main() {

    val arrayOfIngredients = arrayOf("мороженое", "молоко", "малина", "бананы", "корица")

    print("Какой ингредиент вы хотите найти? ")
    val userIngredient = readln()

    for (i in arrayOfIngredients){
        if (userIngredient == i) {
            println("Ингредиент [$userIngredient] в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}