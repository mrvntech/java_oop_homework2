package homework6.model;

public class Student {
    private String fullName;
    private int age;
    private String homeTown;

    public Student(String fullName, int age, String homeTown) {
        this.fullName = fullName;
        this.age = age;
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }
}
