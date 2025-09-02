public class Factorial {

  public int factorial(int n) throws IllegalArgumentException{
    if (n < 0 || n > 12) throw new IllegalArgumentException();
    if (n == 0 || n == 1) return 1;
    return n * factorial(n - 1);
  }
}
