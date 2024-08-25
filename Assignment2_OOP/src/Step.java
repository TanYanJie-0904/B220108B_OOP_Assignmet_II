import java.util.ArrayList;

public class Step {
    private String stepName;
    private String description;
    private ArrayList<Ingredient> ingredients;

    protected Step(String stepName,String description,ArrayList<Ingredient> ingredients){
        this.stepName=stepName;
        this.description=description;
        this.ingredients = ingredients;
    }


    public void displayStep(int stepNumber){
        String header = "Step " + stepNumber + ": " + stepName;
        System.out.println(header);
        System.out.println("-".repeat(header.length()));
        System.out.println(description);
        System.out.println();
        for(Ingredient ingredient:ingredients) {
            System.out.println(" -" + ingredient);
        }
        System.out.println();
        System.out.println("=".repeat(150));
    }


}
