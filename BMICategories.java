import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args) {
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

    System.out.print("BMI category: ");
    if(bmi < 15.0 ){
      System.out.println("very severely underweight");
    }
    else if (bmi < 18.5 ) {
      System.out.println("underweight");
    }
    else if (bmi < 18.5){
      System.out.println("underweight");
}
    else if (bmi < 25.0){
      System.out.println("normal weight");
}
    else if (bmi < 30){
      System.out.println("overweight");
}
    else if (bmi < 35){
      System.out.println("moderately obese");
}
    else if (bmi < 40){
      System.out.println("severely obese");
}
    else {
      System.out.println("very severely/\"morbidly\" obese");
    }
  }
}
// it said I was fat.......
