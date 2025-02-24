public class Kata{
  public static int grow(int[] x){
    int r = 1;
    for (int i: x) r *= i != 0 ? i : 0;
    return r;
  }
}
