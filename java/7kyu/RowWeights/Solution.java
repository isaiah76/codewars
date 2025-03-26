import java.util.stream.IntStream;

public class Solution{
    public static int[] rowWeights (final int[] weights){
        int team1 = IntStream.range(0, weights.length)
                             .filter(i -> i % 2 == 0)
                             .map(i -> weights[i])
                             .sum();

        int team2 = IntStream.range(0, weights.length)
                             .filter(i -> i % 2 != 0)
                             .map(i -> weights[i])
                             .sum();
        return new int[]{team1, team2};
    }
}
