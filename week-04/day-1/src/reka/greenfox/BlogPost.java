package reka.greenfox;

/**
 * Created by User on 2017. 04. 03..
 */
public class BlogPost {
//  Create a BlogPost class that has
//      an authorName
//      a title
//      a text
//      a publicationDate

  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this. publicationDate = publicationDate;

  }

  @Override
  public String toString() {
    return "BlogPost{" +
        "authorName='" + authorName + '\'' +
        ", title='" + title + '\'' +
        ", text='" + text + '\'' +
        ", publicationDate='" + publicationDate + '\'' +
        '}';
  }
}
