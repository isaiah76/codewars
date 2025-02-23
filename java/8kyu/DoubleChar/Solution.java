public class Solution{
  public static String doubleChar(String s){
    StringBuilder result = new StringBuilder();
    for (char i: s.toCharArray()) result.append(i).append(i);
    return result.toString();
  }
}
