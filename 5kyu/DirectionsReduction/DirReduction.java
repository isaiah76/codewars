import java.util.ArrayList;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        if (arr.length <= 1) return arr;
        
        List<String> result = new ArrayList<>();
      
        for (String direction : arr){
          if (!result.isEmpty() && 
              ((result.get(result.size()-1).equals("NORTH") && direction.equals("SOUTH")) ||
               (result.get(result.size()-1).equals("SOUTH") && direction.equals("NORTH")) ||
               (result.get(result.size()-1).equals("WEST") && direction.equals("EAST")) ||
               (result.get(result.size()-1).equals("EAST") && direction.equals("WEST")))){
            result.remove(result.size() - 1);
          } else {
            result.add(direction);
          }
        }
        return result.toArray(new String[0]);
    }
}
