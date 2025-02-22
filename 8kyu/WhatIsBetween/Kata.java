import java.util.ArrayList;

public class Kata {
  public static int[] between(int a, int b) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = a; i <= b; i++) result.add(i);
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
