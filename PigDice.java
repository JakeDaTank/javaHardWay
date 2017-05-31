import java.util.Scanner;

public class PigDice {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int roll, ptot, ctot, turnTotal;
		String choice = "";
//I am really bad at this game it turns out.
		ptot = 0;
		ctot = 0;

		do {
			turnTotal = 0;
			System.out.println("->Your score: " + ptot);
			do {
				roll = 1 + (int)(Math.random()*6);
				System.out.println("\tYour roll: "+roll);
				if ( roll == 1 ) {
					System.out.println("\t\tRolled a one! End of turn!");
					turnTotal = 0;
				}
				else {
					turnTotal += roll;
					System.out.println("\tYour run: " + turnTotal);
					System.out.print("\t\tWould you like to \"roll\" or \"hold\"? ");
					choice = keyboard.next();
				}
			} while (roll != 1 && choice.equals("roll") );

			ptot += turnTotal;
			System.out.println("->Your score: " + ptot + "\n\t > > > \n\n\t < < < ");

			if (ptot <100) {
				turnTotal = 0;
				System.out.println("<-Computer score: " + ctot);

				do {
					roll = 1 + (int)(Math.random()*6);
					System.out.println("\tComputer roll: " + roll);
					if ( roll ==1 ) {
						System.out.println("\t\tEnd of computer turn.");
						turnTotal = 0;
					}
					else {
						turnTotal += roll;
						System.out.println( "\tComputer run: " + turnTotal);
						if (turnTotal < 20 ) {
							System.out.println("\t\tComputer will roll again.");
						}
					}
				} while ( roll != 1 && turnTotal < 20 && (turnTotal + ctot<100) );

				ctot += turnTotal;
				System.out.println("Computer score: " + ctot + "\n\t < < < \n\n\t > > >");
			}

		} while (ptot < 100 && ctot < 100);

		if ( ptot > ctot ) {
			System.out.println( "You win, gratz!" );
		}
		else {
			System.out.println("You are a looser");
		}
	}
}
