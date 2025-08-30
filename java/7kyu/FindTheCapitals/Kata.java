import java.util.Arrays;
import java.util.stream.*;

public class Kata{
  public static int[] capitals(String s){
    return IntStream.range(0, s.length()).filter(i -> Character.isUpperCase(s.charAt(i))).toArray();
  }
}
