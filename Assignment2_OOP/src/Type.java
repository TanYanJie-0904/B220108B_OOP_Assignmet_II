import java.util.*;

public class Type {
    private String name;
    private ArrayList<Ingredient> ingredients;

    protected Type(String name){
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public String getTypename(){
        return this.name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return String.format(name);
    }

    public double calculateTotalCalories(){
        double totalCalories=0;
        for(Ingredient ingredient:ingredients){
            totalCalories += ingredient.getCalories();
        }

        return totalCalories;
    }

    public double calculateTotalProtein(){
        double totalProtein=0;
        for(Ingredient ingredient:ingredients){
            totalProtein += ingredient.getProtein();
        }

        return totalProtein;
    }

    public double calculateTotalCarbs(){
        double totalCarbs=0;
        for(Ingredient ingredient:ingredients){
            totalCarbs += ingredient.getCarbs();
        }

        return totalCarbs;
    }

    public void displayIngredient() {
        for (Ingredient ingredient : ingredients) {
            System.out.println(" -" + ingredient);
        }
    }

    public void deleteIngredient(Ingredient ingredient){
        ingredients.remove(ingredient);
    }

    public boolean isEmpty() {
        return ingredients.isEmpty();
    }
}
