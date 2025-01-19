public class Solution {
    public static String camelCase(String str) {
      if (str == "" || str.isEmpty()){
        return "";
      }
      str = str.trim();
      
      // split the sentence into words and handle multiple whitespaces
      String[] words = str.split("\\s+");
      StringBuilder result = new StringBuilder();
      
      for (int i = 0; i < words.length; i++){
        String word = words[i];
        // append and capitalize first letter of the word
        result.append(Character.toUpperCase(word.charAt(0)));
        // append the rest
        for (int j = 1; j < word.length(); j++){
          result.append(word.charAt(j));
        }
      }
      return result.toString();
    }
}
