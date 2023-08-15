package homework7;

public class Teacher {
    private String fullName;
    private int age;
    private String homeTown;
    private int id;

    private Double LC;
    private Double LT;
    private Double TP;

    public Teacher(String fullName, int age, String homeTown, int id, Double LC, Double LT, Double TP) {
        this.fullName = fullName;
        this.age = age;
        this.homeTown = homeTown;
        this.id = id;
        this.LC = LC;
        this.LT = LT;
        this.TP = TP;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                ", id=" + id +
                ", LC=" + LC +
                ", LT=" + LT +
                ", TP=" + TP +
                '}';
    }

    public int getId() {
        return id;
    }

    public Double getPrice() {
        return LC * LT - TP;
    }
}
