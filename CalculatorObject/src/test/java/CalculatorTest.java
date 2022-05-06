import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void add() {
        int expectedResult = 2;
        int actualResult = calc.add(1, 1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdd() {
        double expectedResult = 5.69;
        double actualResult = calc.add(3.4, 2.3);
        assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void subtract() {
        int expectedResult = -29;
        int actualResult = calc.subtract(23, 52);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtract() {
        double expectedResult = 5.0;
        double actualResult = calc.subtract(5.5, 0.5);
        assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void multiply() {
        int expectedResult = 68;
        int actualResult = calc.multiply(34, 2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiply() {
        double expectedResult = 29.48;
        double actualResult = calc.multiply(6.7, 4.4);
        assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void divide() {
        int expectedResult = 4;
        int actualResult = calc.divide(12, 3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivide() {
        double expectedResult = 4.90;
        double actualResult = calc.divide(10.8, 2.2);
        assertEquals(expectedResult, actualResult, 2);
    }
}