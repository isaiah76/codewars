public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    return name.toLowerCase().startsWith("r") ? name+" plays banjo" : name+" does not play banjo";
  }
}
