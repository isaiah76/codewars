public class Kata {
    public static String encrypt(final String text, final int n) {
        // if text is empty or n is negative return text
        if (text == null || text.isEmpty() || n <= 0) {
            return text;
        }
        
        // split the odds and evens until n
        String result = text;
        for (int i = 0; i < n; i++) {
            // build the string, odd+even concatenated
            StringBuilder encrypted = new StringBuilder();
            // odd
            for (int j = 1; j < result.length(); j += 2) {
                encrypted.append(result.charAt(j));
            }
            // even
            for (int j = 0; j < result.length(); j += 2) {
                encrypted.append(result.charAt(j));
            }
            result = encrypted.toString();
        }
        return result;
    }
    
    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.isEmpty() || n <= 0) {
            return encryptedText;
        }
        
        String result = encryptedText;
        for (int i = 0; i < n; i++) {
            StringBuilder decrypted = new StringBuilder(result.length());
            int midPoint = result.length() / 2;  // get the midpoint of the encryptedText
            
            for (int j = 0; j < result.length() / 2; j++) {
                // add characters from even position
                decrypted.append(result.charAt(midPoint + j));
                if (j < midPoint) {
                    // add characters from odd position
                    decrypted.append(result.charAt(j));
                }
            }
            
            // if length of encryptedText is odd, add the last character
            if (result.length() % 2 != 0) {
                decrypted.append(result.charAt(midPoint + midPoint));
            }
            result = decrypted.toString();
        }
        return result;
    }
}
