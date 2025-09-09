public class GreetMe{
  public static String greet(String name){
    return String.format("Hello %s", name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!");
  }
}
