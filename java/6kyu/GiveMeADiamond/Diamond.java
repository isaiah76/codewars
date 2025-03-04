class Diamond {
  public static String print(int n) {
    if (n % 2 == 0 || n < 0) return null;
    StringBuilder result = new StringBuilder();
    int m = n / 2;
    for (int i = 0; i < n; i++){
      int str = i <= m ? 2 * i + 1 : (2 * (n - i - 1) + 1);
      int spc = (n - str) / 2;
      result.append(" ".repeat(spc)).append("*".repeat(str)).append("\n");
    }
    return result.toString();
	}
}
