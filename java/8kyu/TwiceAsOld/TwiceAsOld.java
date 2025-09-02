public class TwiceAsOld {
    public static int twiceAsOld(int dadYears, int sonYears) {
      return dadYears >= 2 * sonYears ? dadYears - 2 * sonYears : 2 * sonYears - dadYears;
    }
}
