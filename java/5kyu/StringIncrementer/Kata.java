import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.math.BigInteger;

public class Kata {
  public static String incrementString(String str) {
    String nonNumeric = "", numeric = "", result;
    // split into any characters and digits
    String regex = "^(.*?)(\\d*)$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(str);
    // split the string if pattern
    if (matcher.find()) nonNumeric = matcher.group(1); numeric = matcher.group(2);
    // check if theres numeric
    if (!numeric.isEmpty()) {
      // handle large numbers
      int originalLength = numeric.length();
      BigInteger num = new BigInteger(numeric).add(BigInteger.ONE);
      String newNumeric = num.toString();
      // add leading zeros if new numeric is shorter
      if (newNumeric.length() < originalLength) {
        int zerosToAdd = originalLength - newNumeric.length();
        newNumeric = String.format("%0" + zerosToAdd + "d", 0) + newNumeric;
        }
      result = nonNumeric + newNumeric;
      } else {
      // add 1 if no numeric
      result = nonNumeric + "1";
    }
    return result;
  }
}
