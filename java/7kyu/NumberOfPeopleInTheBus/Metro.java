import java.util.ArrayList;

class Metro {
  public static int countPassengers(ArrayList<int[]> stops) {
    int p = 0;
    for (int[] s: stops){
      p += s[0];
      p -= s[1];
    }
    return p;
  }
}
