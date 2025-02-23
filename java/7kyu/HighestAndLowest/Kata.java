public class Kata {
  public static String highAndLow(String numbers) {
    String[] nums = numbers.split(" ");
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    for (String i: nums){
      int num = Integer.parseInt(i);
      if (num > max) max = num;
      if (num < min) min = num;
    }
    
    return max + " " + min;
  }
}
