public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    
    if (words.length == 0){
      return "Must have atleast one or more words";
    } else {
      for (int i = 0; i < words.length; i++){
        if (words[i].length() >= 5){
          words[i] = new StringBuilder(words[i]).reverse().toString();
        }
      }
    }
    return String.join(" ", words);
  }
}
