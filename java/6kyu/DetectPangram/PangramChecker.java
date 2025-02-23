import java.util.HashSet;

public class PangramChecker {
  public boolean check(String sentence){
    // for storing only unique letters which will then be used to check if it has all alphabets
    HashSet<Character> chars = new HashSet<>();
    // convert String sentence to array of characters
    char[] letters = sentence.toCharArray();
    
    // if valid Letter add to the HashSet and convert to lowercase
    for (char c : letters){
      if (Character.isLetter(c)){
        chars.add(Character.toLowerCase(c));
      }
    }
    
    // returns true if 26 which is the number of alphabets
    return chars.size() == 26;
  }
}
