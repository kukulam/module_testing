package kukulam.module.testing.level.D.car;

import kukulam.module.testing.level.D.person.PersonRepositoryTest;
import kukulam.module.testing.level.D.person.PersonsAgeAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.assertj.core.api.*;
import org.junit.jupiter.api.Test;

/*
    advanced tests
 */
class CarRepositoryTest {
    /**
     * TODO: write test for methods {@link CarRepository#findAll()}, {@link CarRepository#add(Car)}
     * 1. Initialize/clean {@link CarRepository} with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. Add couple cars with method {@link CarRepository#add(Car)} in section when
     * 3. Find cars with method {@link CarRepository#findAll()}
     * 4. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     * {@link IterableAssert#containsExactly(Object[])}
     * Hint: look at {@link PersonRepositoryTest#shouldFindAllAddedPeople()}
     * Remember about annotation {@link Test} before test method
     */
    void shouldFindAllAddedCars() {

    }

    /**
     * TODO: write test for methods {@link CarRepository#findByAge(int)} ()}
     * 1. Initialize/clean {@link CarRepository} with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. Add couple cars with method {@link CarRepository#add(Car)} in section given
     * 3. Find cars with method {@link CarRepository#findByAge(int)}
     * 4. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     * {@link IterableAssert#containsExactly(Object[])}
     * Hint: look at {@link PersonRepositoryTest#shouldFindPeopleByAge()}
     * Remember about annotation {@link Test} before test method
     */
    void shouldFindCarsByAge() {

    }

    /**
     * TODO: write the same test for methods {@link CarRepository#findByAge(int)} ()} but use your own assertion
     * 1. Initialize/clean {@link CarRepository} with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. Add couple cars with method {@link CarRepository#add(Car)} in section given
     * 3. Find cars with method {@link CarRepository#findByAge(int)}
     * 4. In section 'then', please use your assertion
     * Hint: look at
     * {@link PersonRepositoryTest#shouldFindPeopleByAgeWithOwnAssertion()}
     * {@link PersonsAgeAssert#hasAge(int)}
     * Remember about annotation {@link Test} before test method
     */
    void shouldFindCarsByAgeWithOwnAssertion() {

    }

    /**
     * TODO EXTRA: write test for method {@link CarRepository#findByName(String)}
     */
}