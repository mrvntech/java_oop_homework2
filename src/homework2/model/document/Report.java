package homework2.model.document;

public class Report extends Document {
    protected String date;

    @Override
    public String toString() {
        return "Report{" +
                "date='" + date + '\'' +
                ", id=" + id +
                ", publisher='" + publisher + '\'' +
                ", publishNumber=" + publishNumber +
                '}';
    }

    public Report(int id, String publisher, int publishNumber, String date) {
        super(id, publisher, publishNumber);
        this.date = date;
    }
}
