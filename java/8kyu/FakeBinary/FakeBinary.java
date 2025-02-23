public class FakeBinary {
    public static String fakeBin(String numberString) {
      StringBuilder result = new StringBuilder();
      for (char c: numberString.toCharArray()) result.append(c >= '5' ? '1' : '0');
      return result.toString();
    }
}
