/**
 * Created by Fekete Imre on 2017.04.03..
 */
public class BlogPostObjects {
  public static void main(String[] args) {

    BlogPost post1 = new BlogPost();
    post1.title = "Lorem Ipsum";
    post1.authorName = "John Doe";
    post1.publicationDate = "2000.05.04";
    post1.text ="Lorem ipsum dolor sit amet.";

    BlogPost post2 = new BlogPost();
    post2.title = "Wait but why";
    post2.authorName ="Tim Urban";
    post2.publicationDate = "2010.10.10.";
    post2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost post3 = new BlogPost();
    post3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    post3.authorName = "William Turton";
    post3.publicationDate = "2017.03.28.";
    post3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\n" +
            "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really\n" +
            " into the whole organizer profile thing.";

      post1.print();
      post2.print();
      post3.print();
  }
}

/*
Create a few blog post objects:
"Lorem Ipsum" titled by John Doe posted at "2000.05.04."
Lorem ipsum dolor sit amet.

"Wait but why" titled by Tim Urban posted at "2010.10.10."
A popular long-form, stick-figure-illustrated blog about almost everything.

"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really
 into the whole organizer profile thing.
 */