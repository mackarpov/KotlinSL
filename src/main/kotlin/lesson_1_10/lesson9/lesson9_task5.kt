package org.example.lesson9

fun main() {

    println("Введите $NUMBER_OF_INGREDIENTS разных ингредиентов вашего меню.")

    val setOfIngredients = mutableSetOf<String>()
    var usersIngredient = ""

    while (setOfIngredients.size < NUMBER_OF_INGREDIENTS) {
        print("Введите ингредиент: ")
        usersIngredient = readln()

        setOfIngredients.add(usersIngredient)
    }

    val sortedSetOfIngredients = setOfIngredients.sorted().joinToString(", ")
    println(sortedSetOfIngredients.replaceFirstChar { it.titlecase() })
}

private const val NUMBER_OF_INGREDIENTS = 5