import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static int[] twoSum(int[] numbers, int target){
      Map<Integer, Integer> m = new HashMap<>();
      for (int i = 0; i < numbers.length; i++){
        int c = target - numbers[i];
        if (m.containsKey(c)) return new int[]{m.get(c), i};
        m.put(numbers[i], i);
      }
        return null;
    }
}
