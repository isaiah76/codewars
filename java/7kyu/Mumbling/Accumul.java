public class Accumul {
    public static String accum(String s) {
      StringBuilder sb = new StringBuilder();
      char[] arr = s.toCharArray();
      for (int i = 0; i < arr.length; i++){
        sb.append(Character.toUpperCase(arr[i]));
        for (int j = 0; j < i; j++){
          sb.append(Character.toLowerCase(arr[i]));
        }
        if (i < arr.length - 1) sb.append('-');
      }
      return sb.toString();
    }
}
