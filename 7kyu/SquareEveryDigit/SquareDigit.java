public class SquareDigit {
  public int squareDigits(int n) {
    StringBuilder result = new StringBuilder();
    String num = Integer.toString(n);
    
    for (char digit : num.toCharArray()){
      result.append(Character.getNumericValue(digit) * Character.getNumericValue(digit));
    }
    return Integer.parseInt(result.toString());
  }
}
