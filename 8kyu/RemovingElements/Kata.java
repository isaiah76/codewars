import java.util.ArrayList;
import java.util.List;

public class Kata {
  public static Object[] removeEveryOther(Object[] arr) {
    List<Object> result = new ArrayList<>();
    for (int i = 0; i < arr.length; i+=2) result.add(arr[i]);
    return result.toArray(new Object[0]);
  }
}
