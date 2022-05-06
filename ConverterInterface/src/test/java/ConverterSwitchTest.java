import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    ConverterSwitch conSw;

    @Before
    public void setUp() throws Exception {
        conSw = new ConverterSwitch();
    }

    @Test
    public void convertMonth() {
        String expectedResult = "January";
        String actualResult = conSw.convertMonth(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void convertDay() {
        String expectedResult = "Sunday";
        String actualResult = conSw.convertDay(1);
        assertEquals(expectedResult, actualResult);
    }
}