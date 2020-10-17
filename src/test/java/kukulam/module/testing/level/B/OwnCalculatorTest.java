package kukulam.module.testing.level.B;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
    simple test (self implementation)
 */

/**
 * TODO: write own implementation of {@link kukulam.module.testing.level.B.OwnCalculator}
 * Create class OwnCalculatorTest
 * Hint: all necessary examples are in {@link kukulam.module.testing.level.A.IntegerCalculatorTest}
 */
class OwnCalculatorTest {

    @Test
    void shouldAddNumbersCorrectly() {
        // given
        int a = 5;
        int b = 10;
        int c = 2;
        int expectedResult = 17;

        OwnCalculator calculator = new OwnCalculator();

        // when
        int result = calculator.add(a, b ,c);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }
}