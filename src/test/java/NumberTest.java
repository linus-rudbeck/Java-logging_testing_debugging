import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class NumberTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void testEvenNumbers(int number) {
        assertTrue(number % 2 == 0);
    }
}
