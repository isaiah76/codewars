public class ArrayPrinter {
    public static String printArray(Object[] array) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < array.length; i++){
        if (i != array.length - 1) sb.append(array[i] + ",");
        else sb.append(array[i]);
      }
      return sb.toString();
    }
}
