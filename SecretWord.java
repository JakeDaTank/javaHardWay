import java.util.Scanner;

public class SecretWord{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess;

    System.out.print("What's the secret word? ");
    guess = keyboard.next();

    if ( guess.equals(secret) || guess.equals("damnit")) {
      System.out.println("You guessed it");
    }
    else {
      System.out.println("No, your guess of " + guess + "was wrong." );
    }

    if( guess == secret ) {
      System.out.println("This shouldn't ever show");
    }
  }
}
