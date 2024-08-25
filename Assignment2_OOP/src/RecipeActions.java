public interface RecipeActions {

    // Adds an ingredient type to the recipe
    void addIngredientTypes(Type ingredientType);

    // Removes a specific ingredient from the recipe
    void removeIngredient(Ingredient ingredient);

    // Displays the full recipe details including ingredients and steps
    void displayRecipe();
}

