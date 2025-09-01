public class Kata {
  public static String tripleTrouble(String one, String two, String three) {
    StringBuilder sb = new StringBuilder();
    int len = Math.min(one.length(), Math.min(two.length(), three.length()));
    for (int i = 0; i < len; i++){
      sb.append(one.charAt(i));
      sb.append(two.charAt(i));
      sb.append(three.charAt(i));
    }
    return sb.toString();
  }
}
