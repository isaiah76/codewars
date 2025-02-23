import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
      if (str == null || str.length() == 0) return new HashMap<>();
      
      Map<Character, Integer> m = new HashMap<>();
      for (char c: str.toCharArray()) m.put(c, m.getOrDefault(c, 0) + 1);
      return m;
    }
}
