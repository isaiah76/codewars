public class Kata{
  public static int[] evenNumbers(int[] arr, int n){
    if (arr == null || arr.length == 0) return new int[0];
    int[] result = new int[n];
    int index = n - 1;
    for (int i = arr.length - 1; i >= 0 && index >= 0; i--){
      if (arr[i] % 2 == 0) result[index--] = arr[i];
    }
    return result;
  }  
}
