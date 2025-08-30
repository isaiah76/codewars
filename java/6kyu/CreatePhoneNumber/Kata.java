public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    StringBuilder sb = new StringBuilder();
    for (int i: numbers) sb.append(i);
    sb.insert(0, "(").insert(4, ") ").insert(9, "-");
    return sb.toString();
  }
}
