package homework4.model;

public class Person {
    private String fullName;
    private int age;
    private String job;
    private int id;

    public Person(String fullName, int age, String job, int id) {
        this.fullName = fullName;
        this.age = age;
        this.job = job;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int hashCode() {
        return id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        return hashCode() == obj.hashCode();
//    }
}
