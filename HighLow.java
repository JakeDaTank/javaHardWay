import java.util.Scanner;

public class HighLow {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;
		String tryAgainLow, tryAgainHigh;

		secret = 1 + (int)( 100*Math.random() );
		tryAgainLow = "Sorry, your guess is too low.\nTry again looser\n> ";
		tryAgainHigh = "Sorry, your guess is too high.\nTry again looser\n> ";

		System.out.println( "I'm thinking of a number between 1-100.");
		System.out.println( " I bet you can't guess it!");
		System.out.print( "> ");
		guess = keyboard.nextInt();
		while ( secret != guess) {
			if ( guess < secret) {
				System.out.print( tryAgainLow);
				guess = keyboard.nextInt();
			}
			if ( guess > secret ) {
				System.out.print( tryAgainHigh);
				guess = keyboard.nextInt();
			}
		}
		System.out.println( "You guessed it! " + secret + "Good for you!" );
	}
}
//I tried to add a counter to it but I couldn't get it to work.
