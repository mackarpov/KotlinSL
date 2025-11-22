package org.example.lesson8

fun main() {

    val arrayOfIngredients = arrayOf("укроп", "киви", "шпинат", "минералка", "манго")
    val newUserIngredient: String

    for (i in arrayOfIngredients) println(i)

    print("Какой ингредиент вы хотите заменить? ")
    val userIngredient = readln()
    val indexOfIngredient = arrayOfIngredients.indexOf(userIngredient)

    if (indexOfIngredient == -1) {
        println("Такого ингредиента нет в списке")
        return
    } else {
        print("Какой ингредиент вы хотите добавить? ")
        newUserIngredient = readln()
        arrayOfIngredients[indexOfIngredient] = newUserIngredient
    }

    println("Готово! Вы сохранили следующий список:")
    for (i in arrayOfIngredients) println(i)
}