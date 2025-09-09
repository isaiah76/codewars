public class Solution {
    public static int predictAge(int... ages) {
      int sum = 0;
      for (int i: ages) sum += i * i;
      return (int) (Math.sqrt(sum) / 2);
    }
}
