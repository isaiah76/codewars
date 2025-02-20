public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      if (input == null || input.length == 0) return new int[0];
      int[] result = {0,0};
      for (int i: input){
        if (i > 0){
          result[0]++;
        }else{
          result[1]+=i;
        }
      }
      return result;
    }
}
