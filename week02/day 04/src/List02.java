
import java.util.*;

public class List02 {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
    ArrayList<String> order = new ArrayList<>();

    // Join the two lists by matching one girl with one boy in the order list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(order);
  }
}