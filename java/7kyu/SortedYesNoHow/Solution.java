import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
  public static String isSortedAndHow(int[] array) {
    int[] sortedArr = array.clone();
    Arrays.sort(sortedArr);
    return Arrays.equals(array, sortedArr) ? "yes, ascending" : IntStream.range(0, array.length)
      .allMatch(i -> array[i] == sortedArr[array.length - 1 - i]) ? "yes, descending" : "no";
  }
}
