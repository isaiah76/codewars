import java.util.List;
import java.util.ArrayList;

class Kata {
   public static List<String> friend(List<String> x){
     List<String> result = new ArrayList<>(x.size());
     for (String s:x) if (s.length() == 4) result.add(s);
     return result;
   }
}
