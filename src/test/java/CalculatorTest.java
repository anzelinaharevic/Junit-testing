import ie.atu.JDBC.calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    calculator cal;

    @BeforeEach
    void setUp() {
        cal = new calculator();
    }

    @Test
    void testaddSuccess() {
        assertEquals(8, cal.add(4, 4));
    }

    @Test
    void testaddFailure() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            cal.add(Integer.MAX_VALUE, 4);
        });
        assertEquals("The value was too big", ex.getMessage());
    }
}
