public class LoveVsFriendship {
  public static int wordsToMarks (String text) {
    return text.chars().map(c -> c - 'a' + 1).sum();
  }
}
