public class Kata {
  public static int findEvenIndex(int[] arr) {
    int sum = 0, leftSum = 0;
    for (int i: arr) sum += i;
    for (int i = 0; i < arr.length; i++){
      if (leftSum == sum - leftSum - arr[i]) return i;
      leftSum += arr[i];
    }
    return -1;
  }
}
