public class AbbreviateTwoWords {
  public static String abbrevName(String name) {
    String[] s = name.split(" ");
    return (s[0].charAt(0) + "." + s[1].charAt(0)).toUpperCase();
  }
}
