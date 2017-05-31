import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args ){
    String name;
    int age;
    double weight, income, height;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name?");
    name = keyboard.next();

    System.out.print("Hi," + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println("So you are " + age + ", eh? That's not very old");
    System.out.print("How much do you weigh," + name + "?");
    weight = keyboard.nextDouble();

    System.out.print("So " + name + ", how tall are you in inches?");
    height = keyboard.nextDouble();

    System.out.println("I'm sorry to say " + name + ", but at " + height + " inches, you wont be getting cookies off the fridge.");

    System.out.println(weight + "! Better keep that to yourself I would think?");
    System.out.print("Finally, what is your income, " + name + "?");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println( name + ".");

  }
}
/* Question 1 no since it reades an Int as a double
Question 2 Yes it does since any numeric input is not concidered
a string by the System
Question 3 It is easy to blow up any answer that should be an Int
or double by inserting a string and vica versa for the string
an Int can be blown up by a double however */
