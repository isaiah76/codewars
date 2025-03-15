public class Kata{  
  public static String sumStr(String a, String b){ 
    return Integer.toString((a.isEmpty() ? 0 : Integer.parseInt(a)) + (b.isEmpty() ? 0 : Integer.parseInt(b)));
  }
}
