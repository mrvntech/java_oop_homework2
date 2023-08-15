package homework4.model;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Family {
    private final ArrayList<Person> persons = new ArrayList<Person>();

    private int houseNumber;

    public Family(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPersonsInformation() {
        AtomicReference<String> personsInformation = new AtomicReference<>("{\n");
        persons.forEach(person -> {
            personsInformation.set(personsInformation + personsInformation.toString() + ",\n");
        });
        personsInformation.set("}\n");
        return personsInformation.toString();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public int getPersonNumber() {
        return persons.size();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }
}
