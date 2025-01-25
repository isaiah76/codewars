public class Snail {
    public static int[] snail(int[][] array) {
      // return if 0x0
      if (array == null || array.length == 0 || array[0].length == 0) return new int[0];
      
      int n = array.length;
      int[] result = new int[n*n];
      
      int index = 0;
      int top = 0;
      int right = n-1;
      int bottom = n-1;
      int left = 0;
      
      while (top <= bottom && left <= right){
        // left to right top row
        for (int i = left; i <= right; i++){
          result[index++] = array[top][i];
        }
        top++;
        
        // top to bottom right column
        for (int i = top; i <= bottom; i++){
          result[index++] = array[i][right];
        }
        right--;
        
        // right to left bottom row
        for (int i = right; i >= left; i--){
          result[index++] = array[bottom][i];
        }
        bottom--;
        
        // bottom to top left column
        for (int i = bottom; i >= top; i--){
          result[index++] = array[i][left];
        }
        left++;
      }
      return result;
   } 
}
