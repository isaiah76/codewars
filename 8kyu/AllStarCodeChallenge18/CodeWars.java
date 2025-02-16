public class CodeWars {
  public static int strCount(String str, char letter) {
    int num = 0;
    for (char c: str.toCharArray()) if (c == letter) num++;
    return num;
  }
}
