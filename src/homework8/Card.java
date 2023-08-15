package homework8;

public class Card {
    private int id;
    private int start;
    private int end;
    private int bookId;
    private Student student;

    public Card(int id, int start, int end, int bookId, Student student) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.bookId = bookId;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", start=" + start +
                ", end=" + end +
                ", bookId=" + bookId +
                ", student=" + student.toString() +
                '}';
    }
}
