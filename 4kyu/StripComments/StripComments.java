public class StripComments {
	public static String stripComments(String text, String[] commentSymbols) {
    // split the text into newlines
    String[] splitText = text.split("\n");
    StringBuilder result = new StringBuilder();
    // loop through the splitText and symbols
    for (int i = 0; i < splitText.length; i++){
      String word = splitText[i];
      for (String symbol : commentSymbols){
        // check if the symbol is in the text
        int index = word.indexOf(symbol);
        // -1 if its not there and only take up till the symbol
        if (index != -1) word = word.substring(0, index);
      }
      // remove trailing whitespaces with regex
      word = word.replaceAll("\\s+$", "");
      result.append(word);
      // Add newline only if its not the last line
      if (i < splitText.length - 1) result.append("\n");
    }
		return result.toString();
	}
}
