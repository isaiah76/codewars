import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    public static List<String> number(List<String> lines){
      List<String> result = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) result.add(i, (i+1) + ": " + lines.get(i));
      return result;
    }
}
