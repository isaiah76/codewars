public class Kata {
  public static String high(String s) {
    String[] words = s.split(" ");
    int highestScore = 0;
    String highestWord = "";
    
    for (String word : words){
      int score = 0;
      
      for (char c : word.toCharArray()){
        score += c - 'a' + 1;  // score for each letter using ASCII values
      }
      
      if (score > highestScore){
        highestScore = score;
        highestWord = word;
      }
    }
    
    return highestWord;
  }
}
