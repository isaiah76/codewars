import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

class Permutations {
    public static List<String> singlePermutations(String s) {
      HashSet<String> permutations = new HashSet<>();
      if (s == null || s.length() == 0) return new ArrayList<>();
      permute("", s, permutations);
      return new ArrayList<>(permutations);
    }
    // backtracks for remaining letters
    static void permute(String currentLetter, String s, HashSet<String> permutations){
      int n = s.length();
      if (n == 0){
        permutations.add(currentLetter);
      } else {
        for (int i = 0; i < n; i++){
          permute(currentLetter + s.charAt(i),
                  s.substring(0, i) + s.substring(i + 1, n),
                  permutations);
        }
      }
    }
}
