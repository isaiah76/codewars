import java.util.ArrayList;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
      if (seconds == 0) return "now";
      // how many seconds there is for each
      final int secondsYear = 31536000;
      final int secondsDay = 86400;
      final int secondsHour = 3600;
      final int secondsMinute = 60;
      // get the years,days,hours, and minutes
      int years = seconds / secondsYear;
      seconds %= secondsYear;
      int days = seconds / secondsDay;
      seconds %= secondsDay;
      int hours = seconds / secondsHour;
      seconds %= secondsHour;
      int minutes = seconds / secondsMinute;
      seconds %= secondsMinute;
      // format the string
      ArrayList<String> result = new ArrayList<>();
      if (years > 0) result.add(years + " year" + (years > 1 ? "s" : ""));
      if (days > 0) result.add(days + " day"  + (days > 1 ? "s" : ""));
      if (hours > 0) result.add(hours + " hour" + (hours > 1 ? "s" : ""));
      if (minutes > 0) result.add(minutes + " minute" + (minutes > 1 ? "s" : ""));
      if (seconds > 0) result.add(seconds + " second" + (seconds > 1 ? "s" : ""));
      // if there is only one in the arraylist
      if (result.size() == 1) return result.get(0);
      // add and and ,
      return String.join(", ", result.subList(0, result.size() - 1)) +
      (result.size() > 1 ? " and " : "") +
      result.get(result.size() - 1);
    }
}
