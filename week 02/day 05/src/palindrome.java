import java.util.Scanner;

/**
 * Created by Fekete Imre on 2017.03.24..
 */

public class palindrome {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please type a word, let me create a palindrome: ");
    String usersWord = myScanner.next();
    StringBuilder reversedword = new StringBuilder(usersWord).reverse();
    System.out.println( "Here it is: " + usersWord.concat(reversedword.toString()));
  }
}
