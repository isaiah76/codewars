public class isogram {
    public static boolean  isIsogram(String str) {
      if (str == null) return false;
      java.util.HashSet<Character> unique = new java.util.HashSet<>();
      for (char c: str.toLowerCase().toCharArray()){
        if (!Character.isLetter(c)) continue;
        if (!unique.add(c)) return false;
      }
      return true;
    } 
}
