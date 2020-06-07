import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;
public class Calculator2Test {

    Calculator2 calculator2 = new Calculator2();

    @Test
    @DisplayName("Test funkcji dodawania")
    public void additionTest(){
        assertEquals(3, calculator2.add(1,2));
        assertNotEquals(3, calculator2.add(2,2));
    }

    @Test
    @DisplayName("Test funkcji odejmowania")
    public void substractTest(){
        assertEquals(3, calculator2.substract(5,2));
        assertNotEquals(3, calculator2.substract(5,3));
    }

    @Test
    @DisplayName("Test funkcji dzielenia")
    public void divisionTest(){
        assertEquals(2,calculator2.divide(4,2));
        assertNotEquals(2, calculator2.divide(4,3));
    }

    @Test
    @DisplayName("Test funkcji mnożenia")
    public void multiplication(){
        assertEquals(6.0, calculator2.multiplicate(3.0, 2.0));
        assertNotEquals(6.0, calculator2.multiplicate(3.0, 2.5));
    }


    @Test
    @DisplayName("Test funkcji dzielenia - dzielenie przez 0")
    public void divisionBy0Test() {
        assertThrows(ArithmeticException.class, () -> calculator2.divide(4, 0));
    }


}
