class Kata {
  public static String countingSheep(int num) {
    StringBuilder br = new StringBuilder();
    for (int i = 1; i <= num; i++) br.append(i+" sheep...");
    return br.toString();
  }
}
