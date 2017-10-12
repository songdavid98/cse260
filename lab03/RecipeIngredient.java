public class RecipeIngredient extends Ingredient {

  public float quantity;

  public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
    this.name = name;
    this.measuringUnit = measuringUnit;
    this.caloriesPerUnit = caloriesPerUnit;
    this.quantity = quantity;
  }

  public float getQuantity() {
    return quantity;
  }

  public String toString() {
    return Float.toString(quantity) + " " + measuringUnit + " of " + name;
  }
}
