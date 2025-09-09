public class BumpsTheRoad {
  public static String bumps(final String road) {
    int count = 0;
    for (char c: road.toCharArray()) if (c == 'n') count++;
    return count > 15 ? "Car Dead" : "Woohoo!";
  }
}
