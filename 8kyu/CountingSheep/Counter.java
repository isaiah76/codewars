public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
      int result = 0;
      if (arrayOfSheeps == null || arrayOfSheeps.length == 0) return result;
      for (int i = 0; i < arrayOfSheeps.length; i++){
        result += (arrayOfSheeps[i] != null && arrayOfSheeps[i]) ? 1 : 0;
        }
      return result;
    }
}
