public class Multiplication{
  public static int [][] multiplicationTable(int n){
    int[][] result = new int[n][n];
    
    for (int i = 0; i < result.length; i++){
      for (int j = 0; j < result[i].length; j++){
        result[i][j] = (i + 1) * (j + 1);
      }
    }
    
    return result;
  }
}
