import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
      Arrays.sort(arr);
      return new int[]{arr[0], arr[arr.length-1]};
    }
}
