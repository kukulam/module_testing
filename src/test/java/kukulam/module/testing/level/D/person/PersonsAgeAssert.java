package kukulam.module.testing.level.D.person;

import org.assertj.core.api.AbstractAssert;

public class PersonsAgeAssert extends AbstractAssert<PersonsAgeAssert, Person[]> {
    public PersonsAgeAssert(Person[] people) {
        super(people, PersonsAgeAssert.class);
    }

    public static PersonsAgeAssert assertThat(Person[] actual) {
        return new PersonsAgeAssert(actual);
    }

    public void hasAge(int age) {
        for (int i = 0; i < actual.length; i++) {
            if (actual[i].getAge() != age) {
                failWithMessage("Expected person's age to be <%s> but was <%s>", age, actual[i].getAge());
            }
        }
    }
}
