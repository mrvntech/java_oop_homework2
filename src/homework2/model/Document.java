package homework2.model;

abstract public class Document {
    protected String id;
    protected String publisher;
    protected int publishNumber;

    public Document(String id, String publisher, int publishNumber) {
        this.id = id;
        this.publisher = publisher;
        this.publishNumber = publishNumber;
    }

    public boolean equals(Document document) {
        return this.id.equals(document.id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }
    public abstract DocumentType getDocumentType();
}

