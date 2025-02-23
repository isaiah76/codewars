public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String num = Integer.toString(number);
        char[] nums = num.toCharArray();
        int totalDigit = num.length();
        int sum = 0;  
      
        for (char c : nums){
          int digit = (int) c - '0';  // convert each char to int
          sum += Math.pow(digit, totalDigit);  // sum += digit^totalDigit
        }
        
        return sum == number;
    }
}
