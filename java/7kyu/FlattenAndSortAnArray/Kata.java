import java.util.Arrays;

public class Kata {
	public static int[] flattenAndSort(int[][] array) {
    int length = 0;
    for (int[] i: array) length += i.length;
    int[] r = new int[length];
    int index = 0;
    for (int[] i: array){
      for (int j: i){
        r[index++] = j;
      }
    }
    Arrays.sort(r);
    return r;
	}
}
