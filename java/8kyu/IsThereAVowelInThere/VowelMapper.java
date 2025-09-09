public class VowelMapper {
    public static java.util.List<Object> isVow(java.util.List<Integer> a) {
        java.util.List<Object> result = new java.util.ArrayList<>();
        for (int i : a) {
            char letter = (char) i;
            if ("aeiou".indexOf(letter) != -1) result.add(String.valueOf(letter));
            else result.add(i);
        }
        return result;
    }
}
