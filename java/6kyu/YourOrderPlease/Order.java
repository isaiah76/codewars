import java.util.Arrays;

public class Order {
  public static String order(String words) {
    if (words == null || words.isEmpty()) return "";
    String[] word = new String[words.trim().split(" ").length];
    
    for (String s: Arrays.asList(words.trim().split(" "))){
      for (char c: s.toCharArray()){
        if (Character.isDigit(c)) {
          int pos = Character.getNumericValue(c) - 1;
          word[pos] = s;
        }
      }
    }
    
    return String.join(" ", word);
  }
}
