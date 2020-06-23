package telran.data;

public class Book implements Printable {

    private String title;
    private String author;
    static int numPages;

    {
        System.out.println("I'm book");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title +", by " + author);
    }
}
