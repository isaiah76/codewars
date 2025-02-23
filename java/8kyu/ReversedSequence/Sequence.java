public class Sequence{
  public static int[] reverse(int n){
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) nums[i] = n-i;
    return nums;
  }
}
