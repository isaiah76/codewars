import java.util.Arrays;

public class Kata{
  public static int sumOfMinimums(int[][] arr){
    int sum = 0;
    for (int[] i: arr){
      int min = Arrays.stream(i).min().getAsInt();
      sum += min;
    }
    return sum;
  }
}
