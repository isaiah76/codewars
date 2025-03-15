public class Kata
{
  public static boolean smallEnough(int[] a, int limit)
  {
    return java.util.Arrays.stream(a).allMatch(n -> n <= limit);
  }
}
