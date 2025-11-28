package org.example.lesson_11

class Ingredient(
    val title: String,
    val amount: String,
    val unitOfMeasurement: String,
)

class Recipe(
    val title: String,
    val listOfIngredients: List<Ingredient> = emptyList(),
    val imageUrl: String,
    val cookingMethod: List<String>,
)

class Category(
    val title: String,
    val listOfRecipes: List<Recipe> = emptyList(),
    val imageUrl: String,
    val description: String,
)
