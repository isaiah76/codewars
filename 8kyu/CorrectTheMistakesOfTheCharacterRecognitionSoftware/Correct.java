public class Correct {
  public static String correct(String string){
    StringBuilder result = new StringBuilder();
    for (char c: string.toCharArray()){
      switch (c){
          case '5': result.append("S"); break;
          case '0': result.append("O"); break;
          case '1': result.append("I"); break;
          default: result.append(c); break;
      }
    }
    return result.toString();
  }
}
