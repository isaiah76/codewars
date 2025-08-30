import java.util.List;
import java.util.ArrayList;

public class Kata {
  public static List<Object> filterList(final List<Object> list) {
    List<Object> result = new ArrayList<>();
    for (Object i: list) if (!(i instanceof String)) result.add(i);
    return result;
  }
}
