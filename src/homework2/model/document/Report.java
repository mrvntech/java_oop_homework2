package homework2.model.document;

import homework2.model.document.Document;
import homework2.model.document.DocumentType;

public class Report extends Document {
    protected int date;

    public Report(String id, String publisher, int publishNumber, int date) {
        super(id, publisher, publishNumber);
        this.date = date;
    }

    @Override
    public DocumentType getDocumentType() {
        return DocumentType.REPORT;
    }
}
