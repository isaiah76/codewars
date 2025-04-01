import java.util.HashMap;

public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase();
    HashMap<Character, Integer> cc = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    for (char c: word.toCharArray()) cc.put(c, cc.getOrDefault(c, 0) + 1);
    for (char c: word.toCharArray()) sb.append(cc.get(c) > 1 ? ")" : "(");
    return sb.toString();
  }
}
