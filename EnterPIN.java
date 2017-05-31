import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String password, guess;

		password = "cool";
		pin = 12345;

		System.out.println( "WELCOME TO THE BANK OF JAVA." );
		System.out.print( "ENTER YOUR PASSWORD: ");
		guess = keyboard.next();

		while ( ! guess.equalsIgnoreCase("awesome") ) {
			System.out.print( "WRONG PASSWORD, TRY AGAIN.\nENTER YOUR PASSWORD: ");
			guess = keyboard.next();
		}
		System.out.println( "\nPASSWORD CORRECT.");
		System.out.print( "ENTER YOUR PIN: " );
		entry = keyboard.nextInt();

		while ( entry != pin ) {
			System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
			System.out.print( "ENTER YOUR PIN: " );
			entry = keyboard.nextInt();
		}

		System.out.println( "\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $450.17" );
	}
}
// this is really cool
