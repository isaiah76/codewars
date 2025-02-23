public class RemoveChars {
    public static String remove(String str) {
      StringBuilder result = new StringBuilder(str);
      result.deleteCharAt(0);
      result.deleteCharAt(result.length() -1);
      return result.toString();
    }
}
