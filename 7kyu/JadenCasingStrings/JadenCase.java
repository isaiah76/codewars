public class JadenCase {
	public String toJadenCase(String phrase) {
    if (phrase == null || phrase.isEmpty()) return null;
    
    StringBuilder result = new StringBuilder();
    boolean capitalize = true;
    
    for (char c : phrase.toCharArray()){
      if (Character.isLetter(c) && capitalize){
        result.append(Character.toUpperCase(c));
        capitalize = false;
      } else {
        result.append(Character.toLowerCase(c));
      }
      if (c == ' ') capitalize = true;
    }
    return result.toString();
	}
}
