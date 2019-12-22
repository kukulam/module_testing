package kukulam.module.testing.level.D.person;

import java.util.List;

class PersonRepository {
    List<Person> find() {
        throw new RuntimeException("Try to mock implementation of this method in unit tests.");
    }

    void add(Person person) {
        throw new RuntimeException("Try to mock implementation of this method in unit tests.");
    }
}
