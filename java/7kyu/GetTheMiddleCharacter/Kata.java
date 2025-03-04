class Kata {
  public static String getMiddle(String word) {
    return word.length() % 2 != 0 ? String.valueOf(word.charAt(word.length() / 2)) 
      : word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
  }
}
