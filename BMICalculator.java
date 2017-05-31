import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inches, pounds, feet, x;

    System.out.print("Your height in feet: ");
    feet = keyboard.nextDouble();
    System.out.print("Your height in inches: ");
    inches = keyboard.nextDouble();
    x = feet * 12 + inches;
    m = x / 39.37;

    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();
    kg = pounds * 0.453592;

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);
  }
}
