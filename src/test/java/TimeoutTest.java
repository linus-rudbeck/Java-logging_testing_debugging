import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class TimeoutTest {
    @Test
    public void testTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(50);
        });
    }
}