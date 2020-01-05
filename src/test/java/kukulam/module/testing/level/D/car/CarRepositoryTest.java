package kukulam.module.testing.level.D.car;

import kukulam.module.testing.level.D.person.PersonRepositoryTest;
import kukulam.module.testing.level.D.person.PersonsAgeAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.assertj.core.api.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
    advanced tests
 */
class CarRepositoryTest {

    private CarRepository carRepository;

    @BeforeEach
    void beforeEach() {
        carRepository = new CarRepository();
    }

    @AfterEach
    void afterEach() {
        carRepository = null;
    }

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
    @Test
    void shouldFindAllAddedCars() {
        // given
        Car expectedCar = new Car("BMW", 5);

        // when
        carRepository.add(expectedCar);

        // and
        Car[] foundCars = carRepository.findAll();

        // then
        assertThat(foundCars.length).isEqualTo(1);
        assertThat(foundCars).containsExactly(expectedCar);
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
    @Test
    void shouldFindCarsByAge() {
        // given
        Car givenCar1 = new Car("BMW",  5);
        Car givenCar2 = new Car("Mercedes",  5);
        Car givenCar3 = new Car("Audi",  7);
        Car[] expectedCars = new Car[] { givenCar1, givenCar2 };

        int age = 5;

        // when
        carRepository.add(givenCar1);
        carRepository.add(givenCar2);
        carRepository.add(givenCar3);

        // and
        Car[] foundCars = carRepository.findByAge(age);

        // then
        assertThat(foundCars.length).isEqualTo(expectedCars.length);
        assertThat(foundCars).containsExactly(expectedCars);
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
    @Test
    void shouldFindCarsByAgeWithOwnAssertion() {
        // given
        Car givenCar1 = new Car("BMW",  5);
        Car givenCar2 = new Car("Mercedes",  5);
        Car givenCar3 = new Car("Audi",  7);

        int age = 5;

        // when
        carRepository.add(givenCar1);
        carRepository.add(givenCar2);
        carRepository.add(givenCar3);

        // and
        Car[] foundCars = carRepository.findByAge(age);

        // then
        CarAgeAssert.assertThat(foundCars).hasAge(age);
    }

    /**
     * TODO EXTRA: write test for method {@link CarRepository#findByName(String)}
     */
    @Test
    void shouldFindCarsByName() {
        // given
        Car givenCar1 = new Car("BMW",  5);
        Car givenCar2 = new Car("Mercedes",  5);
        Car givenCar3 = new Car("BMW",  7);
        Car[] expectedCars = new Car[] { givenCar1, givenCar3 };

        String name = "BMW";

        // when
        carRepository.add(givenCar1);
        carRepository.add(givenCar2);
        carRepository.add(givenCar3);

        // and
        Car[] foundCars = carRepository.findByName(name);

        // then
        assertThat(foundCars.length).isEqualTo(expectedCars.length);
        assertThat(foundCars).containsExactly(expectedCars);
    }
}