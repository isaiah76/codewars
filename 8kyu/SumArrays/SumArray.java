public class SumArray {
  public static double sum(double[] numbers) {
    if (numbers == null || numbers.length == 0) return 0;
    double sum = 0;
    for (double i : numbers) sum += i;
    return sum;
  }
}
