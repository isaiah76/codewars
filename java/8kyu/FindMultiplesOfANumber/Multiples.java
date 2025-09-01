public class Multiples {
    public static int[] find(int base, int limit) {
      int[] result = new int[limit / base];
      for (int i = 0; i < limit / base; i++) result[i] = base * (i + 1);
      return result;
    }
}
