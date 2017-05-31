import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?");
    keyboard.next();

    System.out.println( "What is 6 multiplied by 7?");
    keyboard.nextInt();

    System.out.println( "Enter a number between 0.0 and 1.0");
    keyboard.nextDouble();

    System.out.println( "Is there anything else you would like to say?");
    keyboard.next();
  }
}
// The second questions blows up when I input a String or a Double
/* The third question blows up when I enter a string because it is
only capable of using an Int or a Double */
