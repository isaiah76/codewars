public class Kata {
  public static String sumStrings(String a, String b) {
    // zero if empty
    if (a == null || a.isEmpty()) a = "0";
    if (b == null || b.isEmpty()) b = "0";
    
    StringBuilder result = new StringBuilder();
    // pointers
    int i = a.length()-1;
    int j = b.length()-1;
    int carry = 0;
    
    // add from the rightmost digit
    while (i >= 0 || j >= 0 || carry > 0){
      // get the digit (zero if out of bounds)
      int digitA = i >= 0 ? a.charAt(i--) - '0' : 0;
      int digitB = j >= 0 ? b.charAt(j--) - '0' : 0;
      // get the sum
      int sum = digitA + digitB + carry;
      carry = sum / 10;  // for next iteration
      result.append(sum % 10);
    }
    // reverse it since we started from the rightmost digit
    result.reverse();
    // remove leading zeroes
    int start = 0;
    while (start < result.length() && result.charAt(start) == '0'){
      start++;
    }
    // return without leading zeroes and handle zero
    return start == result.length() ? "0" : result.substring(start).toString();
  }
}
