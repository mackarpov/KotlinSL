package org.example.lesson_11

class Ingredient(
    val ingredientTitle: String,
    val amount: Double,
    val unitOfMeasurement: String,
)

class Recipe(
    val recipeTitle: String,
    val listOfIngredients: MutableList<Ingredient> = mutableListOf(),
) {
    fun addIngredient(ingredient: Ingredient) {
        listOfIngredients += ingredient
    }
}

class Category(
    val categoryTitle: String,
    val listOfRecipes: MutableList<Recipe> = mutableListOf(),
) {
    fun addRecipe(recipe: Recipe) {
        listOfRecipes += recipe
    }
}


fun main() {

    val potato = Ingredient("картофель", 1.0, "кг.")
    val milk = Ingredient("молоко", 0.5, "кг.")
    val butter = Ingredient("масло сливочное", 50.0, "гр.")

    val mashedPotato = Recipe("Картофель пюре")
    mashedPotato.addIngredient(potato)
    mashedPotato.addIngredient(milk)
    mashedPotato.addIngredient(butter)

    val lunches = Category("Обеды")
    lunches.addRecipe(mashedPotato)


}