package designpattern.prototypedesign;

public class Resume extends DocumentImpl {

    public Resume(String title, String content) {
        super(title, content);
    }
    
    @Override
    public Document cloneDocument() {
        return new Resume(getTitle(), getContent());
    }

    @Override
    public void print() {
        System.out.println("Resume Title: " + getTitle());
        System.out.println("Resume Content: " + getContent());
    }
}
