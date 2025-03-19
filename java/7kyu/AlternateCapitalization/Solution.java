import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public static String[] capitalize(String s) {
        return new String[]{
            IntStream.range(0, s.length()).mapToObj(i -> (i % 2 == 0 ? Character.toUpperCase(s.charAt(i)) : s.charAt(i)) + "").collect(Collectors.joining()),
            IntStream.range(0, s.length()).mapToObj(i -> (i % 2 != 0 ? Character.toUpperCase(s.charAt(i)) : s.charAt(i)) + "").collect(Collectors.joining())
        };
    }
}
