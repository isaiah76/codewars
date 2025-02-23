public class Kata {
    public static int findShort(String s) {
      String[] words = s.split(" ");
      int shortestWord = Integer.MAX_VALUE;
      for (String i: words) if (i.length() < shortestWord) shortestWord = i.length();
      return shortestWord;
    }
}
