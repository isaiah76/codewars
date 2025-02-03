public class TotalPoints {
    public static int points(String[] games){
      int totalPoints = 0;
      for (String s: games){
        int x = s.charAt(0) - '0';
        int y = s.charAt(2) - '0';
        
        totalPoints += (x > y) ? 3 : (x == y ? 1 : 0);
      }
      return totalPoints;
    }
}
