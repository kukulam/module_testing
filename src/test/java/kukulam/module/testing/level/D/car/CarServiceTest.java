package kukulam.module.testing.level.D.car;

import kukulam.module.testing.level.D.person.PersonServiceTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/*
    test with mock (self implementation)
 */
class CarServiceTest {

    /**
     * TODO: write test for method {@link CarService#findByAge(int)}
     * 1. initialize/clean {@link CarService} and mock of {@link CarRepository}
     *    with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. For mock creation use {@link org.mockito.Mockito#mock(Class)}.
     * 3. For mock behaviour of method {@link CarRepository#find()} use:
     *    {@link org.mockito.Mockito#when(Object)}
     *    {@link org.mockito.stubbing.OngoingStubbing#thenReturn(Object)}
     * Hint: look at {@link PersonServiceTest#shouldFindAllPersonOlderThanGivenAge()}
     */
    void shouldFindCarsWithGivenAge() {

    }

    /**
     * TODO: write test for method {@link CarService#add(String, int)}
     * 1. initialize/clean {@link CarService} and mock of {@link CarRepository}
     *    with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. For check what was use in {@link CarRepository#add(Car)} use:
     *    {@link org.mockito.Mockito#verify(Object)}
     * Hint: look at {@link PersonServiceTest#shouldAddPersonWithCorrectParams()}
     */
    void shouldAddCarWithCorrectParams() {

    }

    /**
     * TODO EXTRA: write test for method {@link CarService#findByName(String)}
     */
}