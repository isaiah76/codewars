public class Maps {
  public static int[] map(int[] arr){
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) result[i] = arr[i] * 2;
    return result;
  }
}
