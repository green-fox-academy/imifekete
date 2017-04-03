/**
 * Created by Fekete Imre on 2017.04.03..
 */
public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public void print() {
    System.out.println(this.title);
    System.out.println();
    System.out.println(this.text);
    System.out.println();
    System.out.println(this.publicationDate);
    System.out.println(this.authorName);
  }
}


/*
Create a BlogPost class that has
an authorName
a title
a text
a publicationDate

 */