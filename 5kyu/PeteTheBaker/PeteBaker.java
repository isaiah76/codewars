import java.util.Map;

public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
    // max value for getting the minimum num
    int maxCake = Integer.MAX_VALUE;
    
    // loop through the recipe
    for (Map.Entry<String, Integer> ingredients : recipe.entrySet()){
      String requiredIngredient = ingredients.getKey();
      int requiredAmount = ingredients.getValue();
      
      // check if the ingredient is available based on the recipe
      if (available.containsKey(requiredIngredient)){
        int availableAmount = available.get(requiredIngredient);
        
        // available ingredient / recipe
        int possibleCakes = availableAmount / requiredAmount;
        // get the minimum based on the lowest ingredient available
        maxCake = Math.min(maxCake, possibleCakes);
      } else {
        // if any ingredients is missing
        maxCake = 0; break;
      }
    }
    return maxCake;
  }
}
