public class StringUtils {  
  public static String toAlternativeString(String string) {
    StringBuilder sb = new StringBuilder();
    for (char c: string.toCharArray()){
      sb.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
    }
    return sb.toString();
  }
}
