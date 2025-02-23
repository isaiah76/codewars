public class Solution {
    public static boolean check(Object[] a, Object x) {
      for (Object o: a) if (x.equals(o)) return true;
      return false;
    }
}
