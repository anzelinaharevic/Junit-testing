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
        assertEquals(20, cal.add(4, 16));
    }

    @Test
    void testaddFailure() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            cal.add(Integer.MAX_VALUE, 4);
        });
        assertEquals("The value was too big", ex.getMessage());
    }

    @Test
    void testsubtractSuccess() {
        assertEquals(7, cal.subtract(12,5));
    }

    @Test
    void testsubtractFailure() {
        Exception ex = assertThrows(IllegalStateException.class, () ->{cal.subtract(8,10);});
        assertEquals("Negative results are not allowed", ex.getMessage());
    }

    @Test
    void testdivideSuccess() {
        assertEquals(2, cal.divide(20,10));
    }

    @Test
    void testdivideFailure() {
        Exception ex = assertThrows(ArithmeticException.class, () -> {cal.divide(100,0);});
        assertEquals("Cannot divide by zero", ex.getMessage());
    }

    @Test
    void testMultiplySuccess()
    {
        assertEquals(10, cal.multiply(5,2));
    }

    @Test
    void testMultiplyFailure()
    {
        Exception ex = assertThrows(UnsupportedOperationException.class, () ->{cal.multiply(Integer.MAX_VALUE, 2);});
        assertEquals("Overflow", ex.getMessage());
    }
}
