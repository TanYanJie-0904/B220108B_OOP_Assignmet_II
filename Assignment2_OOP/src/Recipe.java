import java.util.*;

public class Recipe implements RecipeActions, NutritionalInfo, Comparable<Recipe> {
    private String name;
    private String description;
    private ArrayList<Type> ingredientTypes;
    private ArrayList<Step> steps;
    private int cookingTime;

    protected Recipe(String name, String description){
        this.name=name;
        this.description=description;
        this.ingredientTypes=new ArrayList<>();
        this.steps=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public void addIngredientTypes(Type ingredientType){
        ingredientTypes.add(ingredientType);
    }

    public void deleteIngredientType(Type ingredientType){
        ingredientTypes.remove(ingredientType);
    }

    @Override
    public void removeIngredient(Ingredient ingredient) {
        for (Type ingredientType : ingredientTypes) {
            // Iterate over the ingredients in the current Type
            ArrayList<Ingredient> ingredientsToRemove = new ArrayList<>();
            for (Ingredient ingr : ingredientType.getIngredients()) {
                if (ingr.getName().equals(ingredient.getName())) {
                    ingredientsToRemove.add(ingr); // Collect ingredients to remove
                }
            }

            // Remove the ingredients that match
            for (Ingredient ingr : ingredientsToRemove) {
                ingredientType.deleteIngredient(ingr);
            }

            // If the Type has no more ingredients, remove it from the ingredientTypes list
            if (ingredientType.isEmpty()) {
                ingredientTypes.remove(ingredientType);
                break; // Exit loop after removal to avoid ConcurrentModificationException
            }
        }
    }

    public void displayIngredientDetails() {
        for (Type ingredientType : ingredientTypes) {
            System.out.println(ingredientType.getTypename());
            ingredientType.displayIngredient();
            System.out.println("\n");
        }
    }

    @Override
    public double calculateTotalCalories() {
        double totalCalories=0;
        for (Type ingredients : ingredientTypes) {
            totalCalories += ingredients.calculateTotalCalories();
        }

        return totalCalories;
    }

    @Override
    public double calculateTotalProtein() {
        double totalProtein=0;
        for(Type ingredients : ingredientTypes){
            totalProtein += ingredients.calculateTotalProtein();
        }

        return totalProtein;
    }

    @Override
    public double calculateTotalCarbs() {
        double totalCarbs=0;
        for(Type ingredients : ingredientTypes){
            totalCarbs += ingredients.calculateTotalCarbs();
        }

        return totalCarbs;
    }

    //Hardcode tools
    public String getTools(){
        return "Bowl, Oven, Pot, Saucepan, Plates";
    }

    public void setCookingTime(int time){
        this.cookingTime = time;
    }

    public int getCookingTime(){
        return cookingTime;
    }

    public void addStep(String name, String description,ArrayList<Ingredient> ingredients){
        steps.add(new Step(name,description,ingredients));
    }

    @Override
    public int compareTo(Recipe other){
        return Integer.compare((int)this.calculateTotalCalories(), (int)other.calculateTotalCalories());
    }

    @Override
    public void displayRecipe(){
        int stepNumber = 1;

        System.out.println("\n" + "Recipe Name:" + getName() + "\n");
        System.out.println("Description:" + getDescription() + "\n");
        System.out.println("Cooking Time:" + getCookingTime()+ " minutes\n");
        System.out.println("Ingredients:");
        System.out.println("-".repeat(13));
        displayIngredientDetails();
        System.out.println("Total calories: " + String.format("%.2f", calculateTotalCalories()));
        System.out.println("Total Weight of Protein: " + String.format("%.2f", calculateTotalProtein()) + " g");
        System.out.println("Total Weight of Carbs: " + String.format("%.2f", calculateTotalCarbs()) + " g");
        System.out.println("Required Tools: " + getTools() + "\n" );
        System.out.println("=".repeat(150));
        for(Step step:steps){
            step.displayStep(stepNumber++);
        }

    }

}
