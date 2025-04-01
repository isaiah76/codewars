class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
    return operator.equals("add") ? a+b : operator.equals("subtract") ? a-b : operator.equals("multiply") ?
      a*b : a/b;
  }
}
