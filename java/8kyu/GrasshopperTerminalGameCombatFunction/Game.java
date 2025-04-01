public class Game {  
  public static int combat(int health, int damage) {
    return health-damage > 0 ? health-damage : 0;
  }
}
