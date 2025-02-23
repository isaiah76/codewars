public class Kata {
    public static String expandedForm(int num) {
        String number = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        // loop through each digit in the number
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);

            // if digit is not zero then append that digit
            if (digit != '0') {
                result.append(digit);
                
                // append zeroes
                for (int j = i+1; j < number.length(); j++) {
                    result.append("0");
                }

                // append the + if i is not the last digit and not zero
                if (i != number.length() - 1) {
                    result.append(" + ");
                }
            }
        }
        // remove the extra + in the last part
        if (result.toString().endsWith(" + ")) {
            result.setLength(result.length() - 3);
        }
        return result.toString();
    }
}
