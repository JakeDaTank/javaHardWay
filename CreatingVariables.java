public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, day, year;
    double seconds, e, checking;
    String firstName, lastName, title, mounth;

    x = 10;
    y = 400;
    age = 24;
    day = 28;
    year = 2017;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Jacob";
    lastName  = "Paul";
    title = "The Magnifitastic";
    mounth = "May";

    System.out.println( "The date is " + day + " " + mounth + " " + year);
    System.out.println( "The variable x contains " + x);
    System.out.println( "The value " + y + " is stored in the variable y");
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e);
    System.out.println( "Hopefully you have more than $" + checking + "!");
    System.out.println( "My name's " + title + " " + firstName + lastName);
  }
}
