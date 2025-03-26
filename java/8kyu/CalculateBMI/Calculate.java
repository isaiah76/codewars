public class Calculate {
  public static String bmi(double weight, double height) {
    return weight / (height * height) <= 18.5 ? "Underweight" :
           weight / (height * height) <= 25.0 ? "Normal" :
           weight / (height * height) <= 30.0 ? "Overweight" : "Obese";
  }
}
