/**
 * Created by Fekete Imre on 2017.03.23..
 */
public class takes_longer_03 {
  public static void main(String[] args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    StringBuilder correctQuote = new StringBuilder();
    correctQuote.append(quote);
    correctQuote.insert(quote.indexOf("you"), "always takes longer than ");
    quote = correctQuote.toString();
    System.out.println(quote);


  }
}

// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)
