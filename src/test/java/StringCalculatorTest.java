import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    public void beforeEach() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void simpleAddTest() throws Exception {
        assertEquals(0, stringCalculator.add(""));
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void manyNumbresAddTest() throws Exception {
        assertEquals(6, stringCalculator.add("1,2,3"));
    }

    @Test
    public void endLineDelimeterTest() throws Exception {
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void customLineDelimeterTest() throws Exception {
        assertEquals(6, stringCalculator.add("//;\n1;2;3"));
    }

    @Test
    public void negativeNumbersTest() {
        Exception exception = assertThrows(Exception.class, () -> {
            stringCalculator.add("1,-2,-3");
        });

        System.out.println(exception.getLocalizedMessage());

        assertTrue(exception.getLocalizedMessage().contains("-2"));
        assertTrue(exception.getLocalizedMessage().contains("-3"));
    }


    @Test
    public void bigNumbersTest() throws Exception {
        assertEquals(2, stringCalculator.add("2,1001"));
    }


}
