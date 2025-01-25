public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    if (seconds > 359999) return "";
    // 3600 is the total number of seconds in an hour
    return String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, seconds % 60);
  }
}
