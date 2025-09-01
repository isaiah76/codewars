public class Kata {
  public static int save(int[] sizes, int hd) {
    int sum = 0, count = 0;
    for (int i: sizes){
      if (sum + i > hd) return count;
      sum += i;
      count++;
    }
    return count;
  }
}
