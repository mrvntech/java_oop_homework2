package homework2.model.document;

public class Book extends Document {
    protected String authorName;
    protected int pageNumber;

    public Book(int id, String publisher, int publishNumber, String authorName, int pageNumber) {
        super(id, publisher, publishNumber);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", pageNumber=" + pageNumber +
                ", id=" + id +
                ", publisher='" + publisher + '\'' +
                ", publishNumber=" + publishNumber +
                '}';
    }
}
