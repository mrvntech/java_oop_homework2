package homework5.model;

public class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return hashCode() == obj.hashCode();
    }

    public boolean equals(int id) {
        return this.id == id;
    }
}
