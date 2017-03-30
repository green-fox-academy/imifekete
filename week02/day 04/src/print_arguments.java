import java.util.Scanner;
/**
 * Created by Fekete Imre on 2017.03.23..
 */
public class print_arguments {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("what should I print");
    String print = scanner.nextLine();

    printer (print);
  }
  public static void printer(String computerPrints) {
    System.out.println(computerPrints);
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...