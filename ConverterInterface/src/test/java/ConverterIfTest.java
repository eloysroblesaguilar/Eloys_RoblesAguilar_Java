import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    ConverterIf conIf;

    @Before
    public void setUp() throws Exception {
        conIf = new ConverterIf();
    }

    @Test
    public void convertMonth() {
        String expectedResult = "January";
        String actualResult = conIf.convertMonth(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void convertDay() {
        String expectedResult = "Sunday";
        String actualResult = conIf.convertDay(1);
        assertEquals(expectedResult, actualResult);
    }
}