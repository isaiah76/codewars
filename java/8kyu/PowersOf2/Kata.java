public class Kata{
  public static long[] powersOfTwo(int n){
      long[] result = new long[n + 1];
      for (int i = 0; i <= n; i++) result[i] = 1L << i;
      return result;
  }
}
