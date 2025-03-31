package designpattern.prototypedesign;

interface Document extends Cloneable {

  Document cloneDocument();

  void print();
}

public abstract class DocumentImpl implements Document {

  private String title;
  private String content;

  public DocumentImpl(String title, String content) {
    this.title = title;
    this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public abstract Document cloneDocument();
}
