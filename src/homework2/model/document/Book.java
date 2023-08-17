package homework2.model.document;

import homework2.model.document.Document;
import homework2.model.document.DocumentType;

public class Book extends Document {
    protected String authorName;
    protected int pageNumber;

    public Book(String id, String publisher, int publishNumber, String authorName, int pageNumber) {
        super(id, publisher, publishNumber);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    @Override
    public DocumentType getDocumentType() {
        return DocumentType.BOOK;
    }
}
