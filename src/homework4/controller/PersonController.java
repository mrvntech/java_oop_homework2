package homework4.controller;

import homework4.model.Person;
import homework4.view.PersonView;

import java.util.HashSet;
import java.util.Optional;

public class PersonController {
    public final HashSet<Person> persons = new HashSet<>();
    private PersonView personView;

    public PersonController(PersonView personView) {
        this.personView = personView;
    }

    public Optional<Person> createPerson() {
        int id = personView.getId();
        int age = personView.getAge();
        String fullName = personView.getFullName();
        String job = personView.getJob();
        Person person = new Person(fullName, age, job, id);
        if (persons.add(person)) return Optional.of(person);
        return Optional.empty();
    }

    public static void main(String[] args) {
        PersonController personController = new PersonController(new PersonView());
        personController.createPerson();
        personController.createPerson();

        personController.persons.forEach(person -> System.out.println(person.toString()));
    }
}
