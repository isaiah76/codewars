import java.util.List;
import java.util.ArrayList;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
    List<Integer> result = new ArrayList<>();
    for (int i: numbers) if (i % divider == 0) result.add(i);
    return result.stream().mapToInt(i -> i).toArray();
  }
}
