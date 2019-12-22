package kukulam.module.testing.level.D.person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/*
    test with mock (returns, verify)
 */
public class PersonServiceTest {

    private PersonService personService;
    private PersonRepository personRepositoryMock;

    @BeforeEach
    void beforeEach() {
        personRepositoryMock = mock(PersonRepository.class);
        personService = new PersonService(personRepositoryMock);
    }

    @AfterEach
    void afterEach() {
        personService = null;
        personRepositoryMock = null;
    }

    @Test
    public void shouldFindAllPersonOlderThanGivenAge() {
        // given
        int givenAge = 30;

        List<Person> mockedListOfPerson = Arrays.asList(
                new Person("Luke", "Skywalker", 25),
                new Person("James", "Bond", 50),
                new Person("Jackie", "Chan", 65)
        );

        when(personRepositoryMock.find()).thenReturn(mockedListOfPerson);

        Person[] expectedResult = new Person[] {
                new Person("James", "Bond", 50),
                new Person("Jackie", "Chan", 65)
        };

        // when
        List<Person> result = personService.find(givenAge);

        // then
        assertThat(result).containsExactlyInAnyOrder(expectedResult);
    }

    @Test
    public void shouldAddPersonWithCorrectParams() {
        // given
        String givenName = "James";
        String givenSurname = "Bond";
        int givenAge = 50;

        Person expectedAddedPerson = new Person(givenName, givenSurname, givenAge);

        // when
        personService.add(givenName, givenSurname, givenAge);

        // then
        verify(personRepositoryMock, times(1)).add(expectedAddedPerson);
    }
}
