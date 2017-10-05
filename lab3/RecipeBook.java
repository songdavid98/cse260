import java.util.ArrayList;

public class RecipeBook {

  public String name;
  public ArrayList<CookingRecipe> recipes;

  public RecipeBook(String bookName) {
    name = bookName;
  }

  public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
    for (CookingRecipe cr : recipes) {
      if (cr.getName().equals(name))
        return null;
    }
    CookingRecipe cr = new CookingRecipe(name);
    for (RecipeIngredient ri : ingredients) {
      cr.list.add(ri);
    }
    return cr;
  }

  public CookingRecipe removeRecipe(String name) {

  }

  public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {

  }

  public CookingRecipe[] findRecipesWithFewIngredients(int number) {

  }

  public CookingRecipe[] findRecipesLowCalories() {

  }
}
