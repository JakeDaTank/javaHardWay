import java.util.Scanner;

public class DictionaryOrder {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;

    System.out.print("Please enter a made up Programming Language");
    name = keyboard.nextLine();

    if ( name.toLowerCase().compareTo("c++") < 0 )
      System.out.println( name + " comes before c++" );
    if ( name.toLowerCase().compareTo("c++") == 0 )
      System.out.println( "c++ isn't a made-up language!" );
    if ( name.toLowerCase().compareTo("c++") > 0 )
      System.out.println( name + " comes after c++" );

    if ( name.toLowerCase().compareTo("go") < 0 )
      System.out.println( name + " comes before go" );
    if ( name.toLowerCase().compareTo("go") == 0 )
      System.out.println( "go isn't a made-up language!" );
    if ( name.toLowerCase().compareTo("go") > 0 )
      System.out.println( name + " comes after go" );

    if ( name.toLowerCase().compareTo("java") < 0 )
        System.out.println( name + " comes before java" );
    if ( name.toLowerCase().compareTo("java") == 0 )
        System.out.println( " isn't a made-up language!" );
    if ( name.toLowerCase().compareTo("java") > 0 )
        System.out.println( name + " comes after java" );

    if ( name.toLowerCase().compareTo("lisp") < 0 )
      System.out.println( name + " comes before lisp" );
    if ( name.toLowerCase().compareTo("lisp") == 0 )
      System.out.println( " isn't a made-up language!" );
    if ( name.toLowerCase().compareTo("lisp") > 0 )
      System.out.println( name + " comes after lisp" );

    if ( name.toLowerCase().compareTo("python") < 0 )
      System.out.println( name + " comes before python" );
    if ( name.toLowerCase().compareTo("python") == 0 )
      System.out.println( " isn't a made-up language!" );
    if ( name.toLowerCase().compareTo("python") > 0 )
      System.out.println( name + " comes after python" );

    if ( name.toLowerCase().compareTo("Ruby") < 0 )
      System.out.println( name + " comes before ruby" );
    if ( name.toLowerCase().compareTo("Ruby") == 0 )
      System.out.println( " isn't a made-up language!" );
    if ( name.toLowerCase().compareTo("Ruby") > 0 )
      System.out.println( name + " comes after ruby" );

    if ( name.toLowerCase().compareTo("visualbasic") < 0 )
      System.out.println( name + " comes before " );
    if ( name.toLowerCase().compareTo("visualbasic") == 0 )
      System.out.println( " isn't a made-up language!" );
    if ( name.toLowerCase().compareTo("visualbasic") > 0 )
      System.out.println( name + " comes after " );
  }
}
// I had to watch the videos for this one but I understand how it works
