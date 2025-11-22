package org.example.lesson9

fun main() {

    print("Введите через \", \" 5 ингредиентов вашего блюда: ")

    val stringOfIngredients = readln()
    val listOfIngredients = stringOfIngredients.split(", ")
    val sortedListOfIngredients = listOfIngredients.sorted()

    println(sortedListOfIngredients)
}
