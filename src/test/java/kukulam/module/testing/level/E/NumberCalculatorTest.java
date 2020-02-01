package kukulam.module.testing.level.E;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/*
    tdd
 */
class NumberCalculatorTest {

    private final NumberCalculatorImplementation calculator = new NumberCalculatorImplementation();

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

    @Test
    void shouldReturnFalseWhenNumberIsNotGreaterThan2() {
        // given
        int givenNumber = 1;

        // when
        boolean result = calculator.isPrimeNumber(givenNumber);

        // then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseWhenNumberIsNotPrimeNumber() {
        // given
        int givenNumber = 4;

        // when
        boolean result = calculator.isPrimeNumber(givenNumber);

        // then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnTrueWhenNumberIsPrimeNumber() {
        // given
        int givenNumber = 7;

        // when
        boolean result = calculator.isPrimeNumber(givenNumber);

        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnTheSameValueWhenNumberIsPositive() {
        // given
        int givenNumber = 7;

        // when
        int result = calculator.absoluteValue(givenNumber);

        // then
        assertThat(result).isEqualTo(givenNumber);
    }

    @Test
    void shouldReturnPositiveValueWhenNumberIsNegative() {
        // given
        int givenNumber = -7;
        int expectedNumber = 7;

        // when
        int result = calculator.absoluteValue(givenNumber);

        // then
        assertThat(result).isEqualTo(expectedNumber);
    }

    @Test
    void shouldReturn0WhenGivenNumberIsNegative() {
        // given
        int givenNumber = -1;
        int expectedNumber = 0;

        // when
        int result = calculator.factorial(givenNumber);

        // then
        assertThat(result).isEqualTo(expectedNumber);
    }

    @ParameterizedTest()
    @MethodSource("factorials")
    void shouldReturnCorrectFactorial(int n, int expectedResult) {
        // when
        int result = calculator.factorial(n);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    static Stream<Arguments> factorials() {
        return Stream.of(
                //        n,    expectedResult
                arguments(1,    1),
                arguments(2,    2),
                arguments(3,    6),
                arguments(4,    24),
                arguments(5,    120)
        );
    }

    @Test
    void shouldReturnNullWhenArrayIsEmpty() {
        // given
        int[] givenArray = new int[]{};

        // when
        Integer result = calculator.max(givenArray);

        // then
        assertThat(result).isNull();
    }

    @ParameterizedTest()
    @MethodSource("max")
    void shouldReturnLargestNumberFromArray(int[] array, int expectedResult) {
        // when
        Integer result = calculator.max(array);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    static Stream<Arguments> max() {
        return Stream.of(
                //        array,                         expectedResult
                arguments(new int[] { 1, 2, 3, 4, 5},    5),
                arguments(new int[] { 1, 2, 3, 2, 1},    3),
                arguments(new int[] { 1, -2, 3, 4, -5},  4),
                arguments(new int[] { 6, -2, 3, 4, -5},  6)
        );
    }

}