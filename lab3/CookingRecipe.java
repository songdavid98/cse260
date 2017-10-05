import java.util.ArrayList;

public class CookingRecipe {

  public String name;
  public ArrayList<RecipeIngredient> list;

  public CookingRecipe(String name) {
    this.name = name;
    list = new ArrayList<RecipeIngredient>();
  }

  public String getName() {
    return name;
  }

  public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
    RecipeIngredient ri = new RecipeIngredient(
          ingredient.getName(),
          ingredient.getMeasuringUnit(),
          ingredient.getCaloriesPerUnit(),
          quantity);
    for (int i = 0; i < list.size(); i++) {
      if ( list.get(i).getName().equals(ingredient.getName()) ) {
        removeRecipeIngredient(ingredient);
        list.add(ri);
        return;
      }
    }
    list.add(ri);
  }

  public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
    for (int i = 0; i < list.size(); i++) {
      if ( list.get(i).getName().equals(ingredient.getName()) ) {
        return list.get(i);
      }
    }
    return null;
  }

  public RecipeIngredient getRecipeIngredient(String ingredientName) {
    for (int i = 0; i < list.size(); i++) {
      if ( list.get(i).getName().equals(ingredientName) ) {
        return list.get(i);
      }
    }
    return null;
  }

  public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
    for (int i = 0; i < list.size(); i++) {
      if ( list.get(i).getName().equals(ingredient.getName()) ) {
        return list.remove(i);
      }
    }
    return null;
  }

  public RecipeIngredient removeRecipeIngredient(String ingredientName) {
    for (int i = 0; i < list.size(); i++) {
      if ( list.get(i).getName().equals(ingredientName) ) {
        return list.remove(i);
      }
    }
    return null;
  }

  public float calculateCalories() {
    float calorieSum = 0;
    for (RecipeIngredient i : list) {
      calorieSum += ( i.getQuantity() )* i.getCaloriesPerUnit();
    }
    return calorieSum;
  }

  public int getNumberOfIngredient() {
    return list.size();
  }

  public String toString() {
    String returnString = name;
    for (Ingredient i : list) {
      returnString += "\n";
      returnString += i.toString();
    }
    return returnString;
  }

  public static void main(String[] args)  {
	  System.out.println("test");
  }
}
