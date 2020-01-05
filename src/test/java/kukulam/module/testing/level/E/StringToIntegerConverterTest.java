package kukulam.module.testing.level.E;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
    tdd
 */
class StringToIntegerConverterTest {

    private final StringToIntegerConverter converter = new StringToIntegerConverterImplementation();

    /**
     *  TODO EXTRA: implement and write test in TDD manner for {@link StringToIntegerConverter}
     */
    @Test
    void shouldConvertStringToIntegerCorrectly() {
        // given
        String givenNumber = "2";
        int expectedNumber = 2;

        // when
        int result = converter.convert(givenNumber);

        // then
        assertThat(result).isEqualTo(expectedNumber);
    }

    @Test
    void shouldReturn0WhenNumberIsIncorrect() {
        // given
        String givenNumber = "2abc";
        int expectedNumber = 0;

        // when
        int result = converter.convert(givenNumber);

        // then
        assertThat(result).isEqualTo(expectedNumber);
    }
}