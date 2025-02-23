import java.util.Arrays;

public class Remover {
  public static int[] removeSmallest(int[] numbers) {
    if (numbers.length == 0) return new int[0];
    
    int[] sorted = Arrays.copyOf(numbers, numbers.length);
    Arrays.sort(sorted);
    int[] result = new int[numbers.length-1];
    boolean isRemoved = false;
    int index = 0;
    for (int i: numbers){
      if (i == sorted[0] && !isRemoved){
        isRemoved = true;
        continue;
      }
      result[index++] = i;
    }
    return result;
  }
}
