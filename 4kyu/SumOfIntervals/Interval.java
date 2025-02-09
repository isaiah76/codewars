import java.util.Arrays;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
      if (intervals == null || intervals.length == 0) return 0;
      // sort in ascending order
      Arrays.sort(intervals, (a,b)->{
        if (a[0] != b[0]) {
          // start by first num
          return Integer.compare(a[0], b[0]);
          } else {
          // start with end
          return Integer.compare(a[1], b[1]);
        }
      });
      
      int currentStart = intervals[0][0];
      int currentEnd = intervals[0][1];
      int lengthSum = 0;
      
      for (int i = 1; i < intervals.length; i++){
        if (intervals[i][0] <= currentEnd){
          // if overlap
          currentEnd = Math.max(currentEnd, intervals[i][1]);
        } else {
          // no overlap
          lengthSum += currentEnd - currentStart;
          currentStart = intervals[i][0];
          currentEnd = intervals[i][1];
        }
      }
      
      lengthSum += currentEnd - currentStart;
      return lengthSum;
    }
}
