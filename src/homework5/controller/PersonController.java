package homework5.controller;

import homework5.model.Person;

import java.util.HashSet;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class PersonController {
    private HashSet<Person> persons = new HashSet<>();

    public Optional<Person> getPersonById(int id) {
        AtomicReference<Optional<Person>> person = new AtomicReference<>(Optional.empty());
        persons.forEach(_person -> {
            if (_person.equals(id)) person.set(Optional.of(_person));
        });
        return person.get();
    }
}
