import java.util.*;

public class SmileFaces {
  public static int countSmileys(List<String> arr) {
    int numSmiley = 0;
    
    for (String smiley : arr) {
      if (smiley.length() >= 2) {
        char[] c = smiley.toCharArray();
        
        if ((c[0] == ':' || c[0] == ';')) {
          if (c[c.length - 1] == ')' || c[c.length - 1] == 'D') {
            if (c.length == 2 || (c.length == 3 && (c[1] == '-' || c[1] == '~'))) {
              numSmiley++;  
            }
          }
        }
      }
    }
    
    return numSmiley;
  }
}
