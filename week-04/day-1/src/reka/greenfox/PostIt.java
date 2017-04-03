package reka.greenfox;

/**
 * Created by User on 2017. 04. 02..
 */
public class PostIt {

  String backgroundColor;
  String text;
  String textColor;

  @Override
  public String toString() {
    return "PostIt{" +
        "backgroundColor='" + backgroundColor + '\'' +
        ", text='" + text + '\'' +
        ", textColor='" + textColor + '\'' +
        '}';
  }


  public PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }


}

