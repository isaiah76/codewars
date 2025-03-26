public class GrassHopper {
    public static int summation(int n) {
      if (n == 1) return 1;
      return n + summation(n-1);
    }
}
