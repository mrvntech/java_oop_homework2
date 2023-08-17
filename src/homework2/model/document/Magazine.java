package homework2.model.document;

import homework2.model.document.Document;
import homework2.model.document.DocumentType;

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
