import java.util.HashSet;
import java.util.ArrayList;

public class Kata {
  public static int[] arrayDiff(int[] a, int[] b) {
    // b elements
    HashSet<Integer> d = new HashSet<>();
    for (int i : b){
      d.add(i);
    }
    // add to arraylist if it doesnt have element from b
    ArrayList<Integer> c = new ArrayList<>();
    for (int i : a){
      if (!d.contains(i)) c.add(i);
    }
    // convert arraylist to array
    int[] result = c.stream().mapToInt(i -> i).toArray();
    return result;
  }
}
