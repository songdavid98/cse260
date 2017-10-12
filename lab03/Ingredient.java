public class Ingredient {

  public String name;
  public String measuringUnit;
  public int caloriesPerUnit;

  public Ingredient() {

  };

  public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
    this.name = name;
    this.measuringUnit = measuringUnit;
    this.caloriesPerUnit = caloriesPerUnit;
  }

  public String getName() {
    return name;
  };

  public String getMeasuringUnit() {
    return measuringUnit;
  }

  public int getCaloriesPerUnit() {
    return caloriesPerUnit;
  };

  public String toString() {
    return name;
  }
}
