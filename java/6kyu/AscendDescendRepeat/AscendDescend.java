public class AscendDescend {
  public static String ascendDescend(int length, int minimum, int maximum) {
    if (length <= 0) return "";
    if (minimum > maximum) return "";
    
    if (minimum == maximum) {
        StringBuilder sb = new StringBuilder(length);
        String numStr = String.valueOf(minimum);

        if (numStr.length() == 0 && length > 0) { 
            return "";
        }
        if (numStr.length() == 0) { 
            return "";
        }
        
        while (sb.length() < length) {
            sb.append(numStr);
        }
        return sb.substring(0, length);
    }

    int r = maximum - minimum;
    int cycle = 2 * r; 
    
    StringBuilder s = new StringBuilder(length + 16);
    int numCount = 0;

    while (s.length() < length) {
        int pos = numCount % cycle;
        int val;
        if (pos <= r) {
            val = minimum + pos;
        } else { 
            val = maximum - (pos - r);
        }
        s.append(val);
        numCount++;
    }

    return s.substring(0, length);
  }
}
