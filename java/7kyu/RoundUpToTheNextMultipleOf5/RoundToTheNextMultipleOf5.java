package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {
  public static int roundToNext5(int number) {
    return (int) (Math.ceil(number / 5.0) * 5);
  }
}
