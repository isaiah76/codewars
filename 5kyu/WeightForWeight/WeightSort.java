import java.util.Arrays;

public class WeightSort {	
	public static String orderWeight(String strng) {
    if (strng == null || strng.isEmpty()) return "";
    // extract and clean the numbers
    String[] nums = strng.trim().replaceAll("//s+", " ").split(" ");
    
    // sort lexicographically with comparators
    Arrays.sort(nums, (a, b) -> {
      // compare two weights and sort based on that
      int weightA = 0;
      for (char c : a.toCharArray()){
        weightA += Character.getNumericValue(c);
      }
      int weightB = 0;
      for (char c : b.toCharArray()){
        weightB += Character.getNumericValue(c);
      }
      // sort
      return weightA != weightB ? weightA - weightB : a.compareTo(b);
    });
    return String.join(" ", nums);
	}
}
