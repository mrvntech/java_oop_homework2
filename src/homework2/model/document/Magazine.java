package homework2.model.document;

public class Magazine extends Document {
    protected String month;
    protected int number;

    public Magazine(int id, String publisher, int publishNumber, String month, int number) {
        super(id, publisher, publishNumber);
        this.month = month;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "month='" + month + '\'' +
                ", number=" + number +
                ", id=" + id +
                ", publisher='" + publisher + '\'' +
                ", publishNumber=" + publishNumber +
                '}';
    }
}
