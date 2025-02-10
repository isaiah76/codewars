import java.util.Arrays;

class Kata{
  public static long sumTwoSmallestNumbers(long[] numbers) {
    Arrays.sort(numbers);
    return numbers[0] + numbers[1];
  }             
}
