package org.example.lesson9

fun main() {

    val listOfIngredients = listOf("укроп", "киви", "шпинат", "минералка", "манго")

    println("В рецепте есть следующие ингредиенты: $listOfIngredients")

    for (i in listOfIngredients) {
        println(i)
    }
}