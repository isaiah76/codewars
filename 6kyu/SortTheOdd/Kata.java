import java.util.ArrayList;

public class Kata {
  public static int[] sortArray(int[] array) {
    ArrayList<Integer> odds = new ArrayList<>();
    ArrayList<Integer> oddsIndex = new ArrayList<>();
    
    // check if odd
    for (int i = 0; i < array.length; i++){
      if (array[i] % 2 != 0){
        odds.add(array[i]);
        oddsIndex.add(i);
      }
    }
    
    // sort the odd items in ascending order
    odds.sort(Integer::compareTo);
    
    // replace the odd items with the sorted
    for (int i = 0; i < oddsIndex.size(); i++){
      array[oddsIndex.get(i)] = odds.get(i);
    }
    
    return array;
  }
}
