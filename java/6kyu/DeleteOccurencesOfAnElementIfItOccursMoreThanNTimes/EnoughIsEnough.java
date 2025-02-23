import java.util.HashMap;
import java.util.ArrayList;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
    // number itself and the frequency count
    HashMap<Integer, Integer> frequency = new HashMap<>();
    ArrayList<Integer> result = new ArrayList<>();
    
    for (int i: elements){
      // get the amount of frequency
      int frequencyCount = frequency.getOrDefault(i, 0);
      // only add if maxOccurences havent reached
      if (frequencyCount < maxOccurrences){
        result.add(i);
        frequency.put(i, frequencyCount+1);
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
