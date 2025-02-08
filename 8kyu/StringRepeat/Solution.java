public class Solution {
    public static String repeatStr(final int repeat, final String string) {
      StringBuilder result = new StringBuilder();
      for (int i = 1; i <= repeat; i++) result.append(string);
      return result.toString();
    }
}
