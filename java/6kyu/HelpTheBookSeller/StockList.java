import java.util.HashMap;
import java.util.Map;

public class StockList { 	
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
    if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
    
    Map<String, Integer> category = new HashMap<>();
    StringBuilder result = new StringBuilder();
    
    for (String s: lstOfArt){
      category.put(s.substring(0, 1), category.getOrDefault(s.substring(0, 1), 0) + 
                   Integer.parseInt(s.replaceAll("\\D+", "")));
    } 
    
    for (int i = 0; i < lstOf1stLetter.length; i++){
      result.append("(").append(lstOf1stLetter[i]).append(" : ")
                    .append(category.getOrDefault(lstOf1stLetter[i], 0))
                    .append(")");
      if (i != lstOf1stLetter.length - 1) result.append(" - ");
    }
    
		return result.toString();
	}
}
