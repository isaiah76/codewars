public class MexicanWave {
    public static String[] wave(String str) {
      java.util.List<String> words = new java.util.ArrayList<>();
      for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) == ' ') continue;
        words.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
      }
      return words.toArray(new String[0]);
    }
}
