public class XO {  
  public static boolean getXO (String str) {
    int count = 0;
    for (char c: str.toCharArray()){
      if (Character.toLowerCase(c) == 'x') count++;
      if (Character.toLowerCase(c) == 'o') count--;
    }
    return count == 0;
  }
}
