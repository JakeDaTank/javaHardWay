import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print("How old are you? ");
    age = keyboard.nextInt();

    System.out.println("You are: ");
    if (age < 13 ) {
      System.out.println("\ttoo young to create a Facebook");
    }
    if (age < 16) {
      System.out.println("\too young to get a driver's licence");
    }
    if (age < 18 ) {
      System.out.println("\ttoo young to get a tattoo");
    }
    if (age < 21 ) {
      System.out.println("\ttoo yound to drink alcohol");
    }
    if (age < 35 ) {
      System.out.println("\ttoo you to run for President of the U.S.");//I didn't know that
        System.out.println("\t\t(How sad!)");
    }
    if (age >= 65 ) {
      System.out.println("\tYou are old enough to retire!");
    }

  }
}
