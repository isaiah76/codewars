class Solution {
  public static String camelCase(String input) {
    return input.replaceAll("(?=[A-Z])", " ").trim();
  }
}
