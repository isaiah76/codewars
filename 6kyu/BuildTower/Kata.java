public class Kata
{
  public static String[] towerBuilder(int nFloors)
  {
    String[] tower = new String[nFloors];
    for (int i = 1; i <= nFloors; i++){
      int star = 2 * i - 1;
      int space = nFloors - i;
      
      StringBuilder floor = new StringBuilder();
      // spaces before star
      for (int j = 0; j < space; j++) floor.append(" ");
      // stars
      for (int j = 0; j < star; j++) floor.append("*");
      // spaces after star
      for (int j = 0; j < space; j++) floor.append(" ");
      // add to array
      tower[i-1]= floor.toString();
    }
    return tower;
  }
}
