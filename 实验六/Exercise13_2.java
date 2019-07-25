import java.util.Scanner;

public class Exercise13_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean done = false;
    int number1 = 0;
    int number2 = 0;

    // Enter two integers
    System.out.print("Enter two integers: ");

    while (!done) {
      try {
        String a = input.nextLine();
        number1 = Integer.parseInt(a);
        number2 = input.nextInt();
        done = true;
      }
      catch (NumberFormatException ex) {
        System.out.print("Incorrect input and re-enter two integers: ");
        
      }
    }

    System.out.println("Sum is " + (number1 + number2));
  }
}