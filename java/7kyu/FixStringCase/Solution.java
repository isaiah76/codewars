public class Solution {
    public static String solve(final String str) {
      int upper = 0, lower = 0;
      
      for (char c: str.toCharArray()){
        if (Character.isUpperCase(c)) upper++;
        if (Character.isLowerCase(c)) lower++;
      }
      
      return (upper > lower) ? str.toUpperCase() : str.toLowerCase();
    }
}
