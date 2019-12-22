package kukulam.module.testing.level.D.person;

import java.util.List;
import java.util.stream.Collectors;

class PersonService {
    private final PersonRepository repository;

    PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    List<Person> find(int olderThan) {
        return repository.find()
                .stream()
                .filter(person -> person.getAge() > olderThan)
                .collect(Collectors.toList());
    }

    void add(String name, String surname, int age) {
        Person person = new Person(name, surname, age);
        repository.add(person);
    }
}