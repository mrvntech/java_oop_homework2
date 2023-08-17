package homework4.controller;

import homework4.model.Person;
import homework4.view.PersonView;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;

public class PersonController {
    public static final HashMap<Integer, Person> persons = new HashMap<Integer, Person>();

    public static Person createPerson() {
        int id;
        while (true) {
            id = PersonView.getId();
            if (!checkPersonExisted(id)) break;
            else System.out.println("this id already existed");
        }
        int age = PersonView.getAge();
        String fullName = PersonView.getFullName();
        String job = PersonView.getJob();
        Person person = new Person(fullName, age, job, id);
        persons.put(person.getId(), person);
        return person;
    }

    public static boolean checkPersonExisted(int id) {
        return persons.get(id) != null;
    }
}
