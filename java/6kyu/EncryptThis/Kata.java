public class Kata {
    public static String encryptThis(String text) {
      if (text == null || text.isEmpty()) return "";
      StringBuilder sb = new StringBuilder();
      String[] words = text.split("\\s+");
      for (int i = 0; i < words.length; i++){
        String word = words[i];
        // ascii
        sb.append((int) word.charAt(0));
        if (word.length() > 2) {
          // last letter
          sb.append(word.charAt(word.length() - 1));
          // rest of the letters
          sb.append(word.substring(2, word.length() - 1));
          // second letter
          sb.append(word.charAt(1));
        } else if (word.length() == 2){
          sb.append(word.charAt(1));
        }
        if (i != words.length - 1) sb.append(" ");
      }
      return sb.toString();
    }
}
