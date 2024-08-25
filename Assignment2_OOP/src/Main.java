import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Creating Ingredients inside the Meat & Diary group
        Ingredient chicken = new Ingredient("chicken thighs",8,"pieces",177,24,0);
        Ingredient cheddarCheese = new Ingredient("shredded cheddar cheese",16,"ounces",114,7,0.4);
        Ingredient mozzarellaCheese = new Ingredient("shredded mozzarella cheese",16,"ounces",72,7,1);

        //Creating the Ingredient types call Meat & Diary
        Type meatAndDiary = new Type("Meat & Diary");
        //Adding the ingredients into this type
        meatAndDiary.addIngredients(chicken);
        meatAndDiary.addIngredients(cheddarCheese);
        meatAndDiary.addIngredients(mozzarellaCheese);


        //Creating Ingredients inside the Fresh Produce
        Ingredient broccoli = new Ingredient("broccoli florets",4,"cups",31,1,3.6);
        Ingredient onion = new Ingredient("onion (diced)",1,"large",60,1.7,14);

        //Creating the Ingredient types call Fresh Produce
        Type freshProduce = new Type("Fresh Produce");
        //Adding the ingredients into this type
        freshProduce.addIngredients(broccoli);
        freshProduce.addIngredients(onion);


        //Creating Ingredients inside the Pantry Items
        Ingredient macaroni = new Ingredient("elbow macaroni",1,"pound",1683,59,340);
        Ingredient tomatoes = new Ingredient("crushed tomatoes",1,"can",128,6.4,28);
        Ingredient barbecueSauce = new Ingredient("barbecue sauce",1,"cup",480,2.3,114);

        //Creating the Ingredient types call Pantry Items
        Type pantryItems = new Type("Pantry Items");
        //Adding the ingredients into this type
        pantryItems.addIngredients(macaroni);
        pantryItems.addIngredients(tomatoes);
        pantryItems.addIngredients(barbecueSauce);


        //Creating Ingredients inside the Spices & Herbs
        Ingredient paprika = new Ingredient("smoked paprika",1,"tablespoon",27,1,4);
        Ingredient garlicPowder = new Ingredient("garlic powder",1,"teaspoon",10,0.5,2.3);
        Ingredient onionPowder = new Ingredient("onion powder",1,"teaspoon",8,0.2,1.9);
        Ingredient pepper = new Ingredient("black pepper",0.5,"teaspoon",6,0,4.4);
        Ingredient parsley = new Ingredient("fresh parsley (chopped)",0.25,"cup",21.6,1.78,3.8);

        //Creating the Ingredient types call Spices & Herbs
        Type spices = new Type("Spices & Herbs");
        //Adding the ingredients into this type
        spices.addIngredients(paprika);
        spices.addIngredients(garlicPowder);
        spices.addIngredients(onionPowder);
        spices.addIngredients(pepper);
        spices.addIngredients(parsley);


        //Creating smokey BBQ Chicken Recipe
        Recipe smokeyBBQchicken = new Recipe("Smoky BBQ Chicken with Baked Macaroni and Cheese and Steamed Broccoli","This Smokey BBQ Chicken with Baked Macaroni and Cheese and Steamed Broccoli is a delicious and satisfying family dinner that's easy to prepare.");
        //Add the types into Smokey BBQ Chicken Recipe
        smokeyBBQchicken.addIngredientTypes(meatAndDiary);
        smokeyBBQchicken.addIngredientTypes(freshProduce);
        smokeyBBQchicken.addIngredientTypes(pantryItems);
        smokeyBBQchicken.addIngredientTypes(spices);
        smokeyBBQchicken.setCookingTime(30);


        //Adding the ingredients needed for each step
        //step1
        ArrayList<Ingredient> step1Ing = new ArrayList<>();
        step1Ing.add(chicken);
        step1Ing.add(paprika);
        step1Ing.add(garlicPowder);
        step1Ing.add(onionPowder);
        step1Ing.add(pepper);
        smokeyBBQchicken.addStep(" Prepare the Chicken","In a large bowl, combine the chicken thighs, smoked paprika, garlic powder, onion powder, and black pepper.\nToss to coat the chicken evenly.",step1Ing);

        //step2
        ArrayList<Ingredient> step2Ing = new ArrayList<>();
        step2Ing.add(chicken);
        smokeyBBQchicken.addStep("Cook the Chicken","Preheat the oven to 400°F.\nArrange the seasoned chicken thighs on a baking sheet and bake for 35-40 minutes, or until the chicken is cooked through and the skin is crispy.",step2Ing);

        //step3
        ArrayList<Ingredient> step3Ing = new ArrayList<>();
        step3Ing.add(macaroni);
        step3Ing.add(cheddarCheese);
        step3Ing.add(mozzarellaCheese);
        step3Ing.add(tomatoes);
        step3Ing.add(parsley);
        smokeyBBQchicken.addStep("Prepare the Macaroni and Cheese","Bring a large pot of salted water to a boil.\nAdd the elbow macaroni and cook according to package instructions.\nDrain the macaroni and return it to the pot.\nAdd the shredded cheddar and mozzarella cheeses, the can of crushed tomatoes, and 1/4 cup of the chopped parsley.\nStir to combine and melt the cheese.",step3Ing);

        //step4
        ArrayList<Ingredient> step4Ing = new ArrayList<>();
        step4Ing.add(broccoli);
        smokeyBBQchicken.addStep("Steam the Broccoli", "In a large steamer pot, steam the broccoli florets for 5-7 minutes, or until tender.",step4Ing);

        //step5
        ArrayList<Ingredient> step5Ing = new ArrayList<>();
        step5Ing.add(barbecueSauce);
        step5Ing.add(onion);
        smokeyBBQchicken.addStep("Make the BBQ Sauce","In a small saucepan, heat the barbecue sauce over medium heat.\nAdd the diced onion and cook for 5 minutes, or until the onion is softened.",step5Ing);

        //step6
        ArrayList<Ingredient> step6Ing = new ArrayList<>();
        step6Ing.add(chicken);
        step6Ing.add(macaroni);
        step6Ing.add(broccoli);
        step6Ing.add(parsley);
        smokeyBBQchicken.addStep(" Assemble and Serve","Serve the smoky BBQ chicken, baked macaroni and cheese, and steamed broccoli on plates.\nGarnish the chicken with the remaining chopped parsley.",step6Ing);


        //Creating another Recipe
        //Creating the Ingredient types
        Type meatAndDiary2 = new Type("Meat & Diary");
        //Creating and adding Ingredients inside the Type
        Ingredient turkey = new Ingredient(" turkey breast, cubed",1.5,"pounds",712,30.1,0);
        meatAndDiary2.addIngredients(turkey);


        Type freshProduce2 = new Type("Fresh Produce");
        Ingredient sweetPotatoes = new Ingredient("sweet potatoes, peeled and cut into 1-inch cubes",2,"medium",100,2,23);
        Ingredient bellPeppers = new Ingredient("bell peppers, cut into 1-inch pieces",2,"unit",31,1,6);
        Ingredient greens = new Ingredient("mixed greens",4,"cups",9,0.8,0.7);
        freshProduce2.addIngredients(sweetPotatoes);
        freshProduce2.addIngredients(bellPeppers);
        freshProduce2.addIngredients(greens);


        Type pantryItems2 = new Type("Pantry Items");
        Ingredient teriyakiSauce = new Ingredient("Hawaiian-style teriyaki sauce",0.25,"cups",320,0,64);
        Ingredient oliveOil = new Ingredient("olive oil",2,"tablespoons",119,0,0);
        Ingredient honey = new Ingredient("honey",1,"tablespoons",63.84,0.06,17.3);
        pantryItems2.addIngredients(teriyakiSauce);
        pantryItems2.addIngredients(oliveOil);
        pantryItems2.addIngredients(honey);


        Type spices2 = new Type("Spices & Herbs");
        Ingredient ginger = new Ingredient("ground ginger",0.5,"teaspoon",6.25,0.16,1.27);
        Ingredient blackPepper = new Ingredient("ground black pepper",0.25,"teaspoon",6,0,4.4);
        spices2.addIngredients(garlicPowder);
        spices2.addIngredients(ginger);
        spices2.addIngredients(blackPepper);


        Recipe hawaiianTurkey  = new Recipe("Hawaiian Turkey Kabobs with Bell Peppers, Grilled Sweet Potatoes, and Mixed Greens Salad","This Hawaiian-inspired turkey kabob meal is a delicious and colorful dish that's perfect for a family dinner. It's a simple recipe that comes together quickly with just a few steps. Start by marinating the turkey in a sweet teriyaki sauce, then thread it onto skewers with bell peppers. Roast some sweet potato cubes in the oven while the kabobs grill, and toss a fresh salad to round out the meal. This whole dinner can be prepared in under 45 minutes, making it an easy weeknight option.");
        hawaiianTurkey.addIngredientTypes(meatAndDiary2);
        hawaiianTurkey.addIngredientTypes(freshProduce2);
        hawaiianTurkey.addIngredientTypes(pantryItems2);
        hawaiianTurkey.addIngredientTypes(spices2);
        hawaiianTurkey.setCookingTime(45);




        //Adding the ingredients needed for each step
        //step1
        ArrayList<Ingredient> TurkeyStep1Ing = new ArrayList<>();
        TurkeyStep1Ing.add(turkey);
        TurkeyStep1Ing.add(bellPeppers);
        TurkeyStep1Ing.add(teriyakiSauce);
        hawaiianTurkey.addStep("Prepare the kabob ingredients","In a large bowl, combine the cubed turkey breast, bell pepper pieces, and Hawaiian-style teriyaki sauce.\nToss to coat evenly.",TurkeyStep1Ing);

        //step2
        ArrayList<Ingredient> TurkeyStep2Ing = new ArrayList<>();
        TurkeyStep2Ing.add(sweetPotatoes);
        TurkeyStep2Ing.add(oliveOil);
        TurkeyStep2Ing.add(garlicPowder);
        TurkeyStep2Ing.add(blackPepper);
        hawaiianTurkey.addStep(" Roast the sweet potatoes","Preheat oven to 400°F.\nToss the sweet potato cubes with 1 tablespoon of olive oil, garlic powder, and black pepper.\nSpread in a single layer on a baking sheet and roast for 20-25 minutes, or until tender.",TurkeyStep2Ing);

        //step3
        ArrayList<Ingredient> TurkeyStep3Ing = new ArrayList<>();
        TurkeyStep3Ing.add(turkey);
        TurkeyStep3Ing.add(oliveOil);
        TurkeyStep3Ing.add(honey);
        hawaiianTurkey.addStep("Assemble and grill the kabobs","Thread the turkey and bell pepper pieces onto skewers.\nBrush the kabobs with the remaining 1 tablespoon of olive oil and 1 tablespoon of honey.",TurkeyStep3Ing);

        //step4
        ArrayList<Ingredient> TurkeyStep4Ing = new ArrayList<>();
        TurkeyStep4Ing.add(greens);
        TurkeyStep4Ing.add(ginger);
        hawaiianTurkey.addStep("Prepare the salad", "In a large bowl, toss the mixed greens with the remaining ground ginger.",TurkeyStep4Ing);

        //step5
        ArrayList<Ingredient> TurkeyStep5Ing = new ArrayList<>();
        hawaiianTurkey.addStep("Make the BBQ Sauce","In a small saucepan, heat the barbecue sauce over medium heat.\nAdd the diced onion and cook for 5 minutes, or until the onion is softened.",TurkeyStep5Ing);


        //hawaiianTurkey.removeIngredient(sweetPotatoes);
        //hawaiianTurkey.deleteIngredientType(meatAndDiary2);
        //smokeyBBQchicken.displayRecipe();
        smokeyBBQchicken.displayRecipe();


        // Compare recipes based on total calories
        if (smokeyBBQchicken.compareTo(hawaiianTurkey) > 0) {
            System.out.println("\nThe " + smokeyBBQchicken.getName() + "(" + String.format("%.2f", smokeyBBQchicken.calculateTotalCalories()) + " kcal)"+" has more calories than " + hawaiianTurkey.getName() + "(" + String.format("%.2f", hawaiianTurkey.calculateTotalCalories()) + " kcal)" + ".");
        } else if (smokeyBBQchicken.compareTo(hawaiianTurkey) < 0) {
            System.out.println("\nThe " + hawaiianTurkey.getName() + "(" + String.format("%.2f", hawaiianTurkey.calculateTotalCalories()) + " kcal)" +" has more calories than " + smokeyBBQchicken.getName() + "(" + String.format("%.2f", smokeyBBQchicken.calculateTotalCalories()) + " kcal)" + ".");
        } else {
            System.out.println("\nBoth recipes have the same calories.");
        }

        // Sort recipes by calories
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(smokeyBBQchicken);
        recipes.add(hawaiianTurkey);






    }
}