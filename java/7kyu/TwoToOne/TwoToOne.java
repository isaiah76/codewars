import java.util.*;

public class TwoToOne {
    public static String longest (String s1, String s2) {
      String s1s2 = s1+s2;
      TreeSet<Character> e = new TreeSet<>();
      StringBuilder result = new StringBuilder();
      for (char c: s1s2.toCharArray()) e.add(c);
      for (char c: e) result.append(c);
      return result.toString();
    }
}
