import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Fekete Imre on 2017.03.24..
 */
public class anagram {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("type a word: ");
    String wordOne = myScanner.nextLine();
    System.out.println("type another word: ");
    String wordTwo = myScanner.nextLine();
    System.out.println(isAnagram(wordOne, wordTwo));
  }

  private static boolean isAnagram (String wordOne, String wordTwo) {
    char[] firstArray = wordOne.toCharArray();
    char[] secondArray = wordTwo.toCharArray();
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    String firstWord = new String(firstArray);
    String secondWord = new String(secondArray);
    return firstWord.equals(secondWord);
  }
}
