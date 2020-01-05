package kukulam.module.testing.level.E;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
    tdd
 */
class NumberCalculatorTest {

    private final NumberCalculator calculator = new NumberCalculatorImplementation();

    /**
     * TODO: implement and write test in TDD manner for {@link NumberCalculator}
     */
    @Test
    void shouldReturn0WhenNumbersAreNotProvidedInArray() {
        // given
        int[] givenNumbers = new int[0];
        double expectedAverage = 0;

        // when
        double result = calculator.average(givenNumbers);

        // then
        assertThat(result).isEqualTo(expectedAverage);
    }

    @Test
    void shouldCalculateAverageOfNumbersCorrectly() {
        // given
        int[] givenNumbers = new int[] { 1, 2, 3, 4, 5 };
        double expectedAverage = 3;

        // when
        double result = calculator.average(givenNumbers);

        // then
        assertThat(result).isEqualTo(expectedAverage);
    }

    @Test
    void shouldCalculateSumOfNumbersCorrectly() {
        // given
        int[] givenNumbers = new int[] { 1, 2, 3, 4, 5 };
        int expectedResult = 15;

        // when
        int result = calculator.sum(givenNumbers);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }
}