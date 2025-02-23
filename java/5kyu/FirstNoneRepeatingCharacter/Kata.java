public class Kata {
    public static String firstNonRepeatingLetter(String s) {
        // convert to lowercase for case sensitive
        String lower = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            boolean isRepeated = false;
            for (int j = 0; j < s.length(); j++) {
                // skip if same index
                if (i == j) continue;
                
                // compare if repeated
                if (lower.charAt(i) == lower.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            
            // if a character is not found as repeated return
            if (!isRepeated) {
                return String.valueOf(s.charAt(i));
            }
        }
        
        // no non repeated character found
        return "";
    }
}
