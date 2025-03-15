import java.util.TreeSet;

public class Minimum{
	public static int minValue(int[] values){
    TreeSet<Integer> ud = new TreeSet<>();
    StringBuilder br = new StringBuilder();
    for (int i: values) ud.add(i);
    for (int i: ud) br.append(i);
		return Integer.parseInt(br.toString());
	}
}
