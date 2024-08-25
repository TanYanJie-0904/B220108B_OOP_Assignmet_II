public class Ingredient {
    private String name;
    private double quantity;
    private String unit;
    private double caloriesPerUnit;
    private double proteinPerUnit;
    private double carbsPerUnit;

    protected Ingredient(String name, double quantity, String unit, double caloriesPerUnit, double proteinPerUnit, double carbsPerUnit){
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.caloriesPerUnit = caloriesPerUnit;
        this.proteinPerUnit = proteinPerUnit;
        this.carbsPerUnit = carbsPerUnit;
    }

    public String getName(){
        return this.name;
    }

    public double getQuantity(){
        return this.quantity;
    }

    public String getUnit(){
        return this.unit;
    }

    public double getCalories(){
        return quantity * caloriesPerUnit;
    }

    public double getProtein(){
        return quantity * proteinPerUnit;
    }

    public double getCarbs(){
        return quantity *carbsPerUnit;
    }

    @Override
    public String toString() {
        String s = this.quantity + " " + unit + " " + name + " (" + caloriesPerUnit + " kcal per " + unit + ")";
        return s;
    }

}
