package homework2.model;

import homework2.model.Document;

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
