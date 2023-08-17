package homework2.model.document;

public class Report extends Document {
    protected String date;

    public Report(int id, String publisher, int publishNumber, String date) {
        super(id, publisher, publishNumber);
        this.date = date;
    }
}
