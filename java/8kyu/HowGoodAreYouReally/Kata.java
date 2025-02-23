public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    if (classPoints.length == 0) return false;
    double sum = 0;
    for (int i: classPoints) sum += i;
    double average = sum / classPoints.length;
    return yourPoints > average;
  }
}
