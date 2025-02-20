  public class Sum
  {
     public int GetSum(int a, int b)
     {
       if (a > b){
         int temp = a;
         a = b;
         b = temp;
       }
       return (b - a + 1) * (a + b) / 2;
     }
  }
