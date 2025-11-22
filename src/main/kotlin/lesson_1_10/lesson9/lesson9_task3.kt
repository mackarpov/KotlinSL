package org.example.lesson9

fun main() {

    val ingredientsPerDish = listOf(2, 50, 15)

    print("Какое количество порций необходимо? ")
    val numberOfServings = readln().toInt()

    val finalListOfIngredients = ingredientsPerDish.map {
        ingredient -> ingredient * numberOfServings
    }

    println("На $numberOfServings порций вам понадобится: " +
            "Яиц - ${finalListOfIngredients[0]}, " +
            "молока - ${finalListOfIngredients[1]}, " +
            "сливочного масла - ${finalListOfIngredients[2]}")
}