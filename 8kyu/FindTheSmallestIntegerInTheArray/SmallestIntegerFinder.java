public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      int smallest = Integer.MAX_VALUE;
      for (int i : args){
        if (i < smallest) smallest = i;
      }
      return smallest;
    }
}
