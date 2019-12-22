package kukulam.module.testing.level.C;

import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.IterableAssert;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

/*
    collections, assertions, throws exception
 */
class CollectionHandlerTest {

    private CollectionHandler collectionHandler;

    @BeforeEach
    void beforeEach() {
        collectionHandler = new CollectionHandler();
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Start running tests from class " + CollectionHandlerTest.class.getName());
    }

    @AfterEach
    void afterEach() {
        collectionHandler = null;
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Stop running tests from class " + CollectionHandlerTest.class.getName());
    }

    /**
     * Example of assertions. Usage of:
     * {@link Assertions#assertThat(int)}
     * {@link IterableAssert#isNull()}
     * {@link IterableAssert#containsExactly(Object[])}
     */
    @Test
    void shouldMergeTwoCollectionsWithCorrectOrder() throws Exception {
        // given
        Collection<String> women = Arrays.asList("Betty", "Caroline");
        Collection<String> men = Arrays.asList("James", "Henry");
        String[] expectedResult = new String[] { "Betty", "Caroline", "James", "Henry" };

        // when
        Collection<String> result = collectionHandler.add(women, men);

        // then
        assertThat(result).isNotNull();
        assertThat(result.isEmpty()).isFalse();
        assertThat(result.size()).isEqualTo(4);
        assertThat(result).containsExactly(expectedResult);
    }

    /**
     * TODO: write test for method {@link CollectionHandler#create(String...)} when parameters are not provided
     * 1. Rename test1 to be more descriptive.
     * 2. Test method {@link CollectionHandler#create(String...)} without parameters.
     * 3. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link IterableAssert#isNull()}
     * Hint: look at {@link #shouldMergeTwoCollectionsWithCorrectOrder}
     */
    @Test
    void test1() {
        // given

        // when

        // then
    }

    /**
     * TODO: write test for method {@link CollectionHandler#create(String...)} when parameters are provided
     * 1. Rename test2 to be more descriptive.
     * 2. Test method {@link CollectionHandler#create(String...)} with at least 3 parameters.
     * 3. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link IterableAssert#isNotNull()}
     * {@link IterableAssert#containsExactly(Object[])}
     * Hint: look at {@link #shouldMergeTwoCollectionsWithCorrectOrder}
     */
    @Test
    void test2() {
        // given

        // when

        // then
    }

    /**
     * Example how to assert exceptions, usage of {@link Assertions#assertThatThrownBy(ThrowableAssert.ThrowingCallable)}.
     */
    @Test
    void shouldThrowExceptionWhenOneOfTheParametersIsNull() {
        // given
        Collection<String> women = Arrays.asList("Betty", "Caroline");
        Collection<String> men = null;

        // when && then
        assertThatThrownBy(() -> collectionHandler.add(women, men))
                .isInstanceOf(CollectionHandler.InvalidArgumentsException.class)
                .hasMessage("Invalid arguments, params cannot be null");
    }


    /**
     * TODO: write test for method {@link CollectionHandler#create(String...)} when one of parameters is blank ("")
     * 1. Rename test3 to be more descriptive.
     * 2. Test method {@link CollectionHandler#create(String...)} with at least one blank parameter.
     * 3. In section 'then', please use assertions:
     * {@link Assertions#assertThatThrownBy(ThrowableAssert.ThrowingCallable)}
     * {@link AbstractThrowableAssert#isInstanceOf(Class)}
     * {@link AbstractThrowableAssert#hasMessage(String)}
     * Hint: look at {@link #shouldThrowExceptionWhenOneOfTheParametersIsNull}
     */
    @Test
    void test3() {
        // given

        // when

        // then
    }

    /**
     * TODO EXTRA: write all possible tests for {@link CollectionHandler#common(Collection, Collection)}
     */
}