class Persist {
	public static int persistence(long n) {
    if (String.valueOf(n).length() == 1) return 0;
    return 1 + persistence(multiply(n));
	}
  
  static long multiply(long n){
    return String.valueOf(n).chars().map(c -> c - '0').reduce(1, (a, b) -> a * b);
  }
}
