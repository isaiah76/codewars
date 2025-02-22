import java.util.Arrays;;

class Solution {
  static int stray(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[0] != numbers[1] ? numbers[0] : numbers[numbers.length-1];
  }
}
