public class Kata {
  public static int[] digitize(long n) {
    char[] c = Long.toString(n).toCharArray();
    int[] reversed = new int[c.length];
    for (int i = 0; i < c.length; i++) reversed[i] = Character.getNumericValue(c[c.length-1-i]);
    return reversed;
  }
}
