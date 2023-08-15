package homework2.model;

import homework2.model.Document;

public class Magazine extends Document {
    protected int month;
    protected int number;

    public Magazine(String id, String publisher, int publishNumber, int month, int number) {
        super(id, publisher, publishNumber);
        this.month = month;
        this.number = number;
    }

    @Override
    public DocumentType getDocumentType() {
        return DocumentType.MAGAZINE;
    }
}
