class Solution {
  public static boolean hero(int bullets, int dragons) {
    return (long) dragons * 2 <= bullets ? true : false;
  }
}
