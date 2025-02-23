public class PigLatin {
    public static String pigIt(String str) {
      // split str into words
      String[] words = str.split("\\s+");
      StringBuilder result = new StringBuilder();
      
      for (String word : words){
        // check if its alphabet to avoid symbols
        if (word.matches("[a-zA-Z]+")){
          char[] letters = word.toCharArray();
          char firstLetter = letters[0];  // save the first letter
          StringBuilder wordBuilder = new StringBuilder();
          // add the letters except for first
          for (int i = 1; i < letters.length; i++){
            wordBuilder.append(letters[i]);
          }
          // finally add the firstLetter and ay
          wordBuilder.append(firstLetter).append("ay");
          result.append(wordBuilder).append(" ");
        } else {
          // leave the symbols out
          result.append(word).append(" ");
        }
      }
      return result.toString().trim();
    }
}
