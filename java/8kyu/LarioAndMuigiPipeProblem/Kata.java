public class Kata {
  public static int[] pipeFix(int[] numbers){
    int s = numbers[0];
    int e = numbers[numbers.length - 1];
    int[] r = new int[e - s + 1];
    for (int i = 0; i < r.length; i++) r[i] = s + i;
    return r;
  }
}
