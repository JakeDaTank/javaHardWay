import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args){
    //This code is broken until I fix it

    Scanner keyboard = new Scanner(System.in);
    double price , salesTax, total;

    System.out.print( "How much is the purchase price? ");
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( " Item price: \t" + price);
    System.out.println( "Sales Tax: \t" + salesTax);
    System.out.println( "Total cost: \t" + total );
  }
}
/* actually I spotted the problem before I even ran the code the
first time and fixed it by myself */
