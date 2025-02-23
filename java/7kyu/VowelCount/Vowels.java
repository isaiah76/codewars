public class Vowels {
  public static int getCount(String str) {
    int count = 0;
    for (char c: str.toCharArray()){
      if ("aeiouAEIOU".indexOf(c) >= 0){
        count++;
      }
    }
    return count;
  }
}
