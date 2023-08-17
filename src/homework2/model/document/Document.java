package homework2.model.document;

abstract public class Document {
    protected int id;
    protected String publisher;
    protected int publishNumber;

    public int getId() {
        return id;
    }

    public Document(int id, String publisher, int publishNumber) {
        this.id = id;
        this.publisher = publisher;
        this.publishNumber = publishNumber;
    }
}

