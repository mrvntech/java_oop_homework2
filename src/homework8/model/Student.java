package homework8.model;

public class Student {
    private Student fullName;
    private int age;

    public Student(Student fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }

}
