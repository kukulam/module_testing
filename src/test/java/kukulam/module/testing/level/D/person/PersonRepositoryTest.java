package kukulam.module.testing.level.D.person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonRepositoryTest {

    private PersonRepository personRepository;

    @BeforeEach
    void beforeEach() {
        personRepository = new PersonRepository();
    }

    @AfterEach
    void afterEach() {
        personRepository = null;
    }

    @Test
    public void shouldFindAllAddedPeople() {
        // given
        Person givenPerson = new Person("Luke", "Skywalker", 25);

        // when
        personRepository.add(givenPerson);

        // and
        Person[] foundPeople = personRepository.findAll();

        // then
        assertThat(foundPeople.length).isEqualTo(1);
        assertThat(foundPeople).containsExactly(givenPerson);
    }

    @Test
    public void shouldFindPeopleByAge() {
        // given
        Person givenPerson1 = new Person("Luke", "Skywalker", 40);
        Person givenPerson2 = new Person("James", "Bond", 40);
        Person givenPerson3 = new Person("Jackie", "Chan", 50);

        int age = 40;

        // when
        personRepository.add(givenPerson1);
        personRepository.add(givenPerson2);
        personRepository.add(givenPerson3);

        // and
        Person[] foundPeople = personRepository.findByAge(age);

        // then
        assertThat(foundPeople.length).isEqualTo(2);
        assertThat(foundPeople).containsExactly(givenPerson1, givenPerson2);
    }

    @Test
    public void shouldFindPeopleByAgeWithOwnAssertion() {
        // given
        Person givenPerson1 = new Person("Luke", "Skywalker", 40);
        Person givenPerson2 = new Person("James", "Bond", 40);
        Person givenPerson3 = new Person("Jackie", "Chan", 50);

        int age = 40;

        // when
        personRepository.add(givenPerson1);
        personRepository.add(givenPerson2);
        personRepository.add(givenPerson3);

        // and
        Person[] foundPeople = personRepository.findByAge(age);

        // then
        PersonsAgeAssert.assertThat(foundPeople).hasAge(40);
    }
}