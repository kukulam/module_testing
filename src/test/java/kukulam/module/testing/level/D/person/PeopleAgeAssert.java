package kukulam.module.testing.level.D.person;

import org.assertj.core.api.AbstractAssert;

public class PeopleAgeAssert extends AbstractAssert<PeopleAgeAssert, Person[]> {
    public PeopleAgeAssert(Person[] people) {
        super(people, PeopleAgeAssert.class);
    }

    public static PeopleAgeAssert assertThat(Person[] actual) {
        return new PeopleAgeAssert(actual);
    }

    public void hasAge(int age) {
        for (int i = 0; i < actual.length; i++) {
            if (actual[i].getAge() != age) {
                failWithMessage("Expected person's age to be <%s> but was <%s>", age, actual[i].getAge());
            }
        }
    }
}
