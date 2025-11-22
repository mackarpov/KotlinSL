package org.example.lesson9

fun main() {

    val myListOfIngredients = mutableListOf("картофель", "морковь", "курица")

    println("В рецепте есть базовые ингредиенты: $myListOfIngredients")

    print("Желаете добавить еще (да/нет)? ")
    val userAnswer = readln()

    if (POSITIVE_ANSWER.equals(userAnswer, ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? ")
        val userIngredient = readln()

        myListOfIngredients.add(userIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $myListOfIngredients")
    } else {
        return
    }
}

const val POSITIVE_ANSWER = "да"