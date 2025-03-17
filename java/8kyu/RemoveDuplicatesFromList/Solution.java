import java.util.Arrays;

public class Solution {
  public static int[] distinct(int[] array){
    return Arrays.stream(array).distinct().toArray();
  }
}
