package designpattern.prototypedesign;

public class Report extends DocumentImpl {

  public Report(String title, String content) {
    super(title, content);
  }

  @Override
  public Document cloneDocument() {
    return new Report(getTitle(), getContent());
  }

  @Override
  public void print() {
    System.out.println("Report Title: " + getTitle());
    System.out.println("Report Content: " + getContent());
  }
}
