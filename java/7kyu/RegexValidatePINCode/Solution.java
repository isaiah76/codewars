public class Solution {

  public static boolean validatePin(String pin) {    
    if (pin.length() != 4 && pin.length() != 6){
      return false;
    }
    for (char c : pin.toCharArray()){
      if (!Character.isDigit(c)){
        return false;
      }
    }
    return true;
  }
}
