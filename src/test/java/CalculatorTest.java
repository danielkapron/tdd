import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
// assertions to metody statyczne, wiec dlaczego import static

import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("Test kalkulatora")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeEach
    public void beforeEach(){  // Przed testem
        System.out.println("before each");
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEach(){  // Po teście
        System.out.println("after each");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @Test
    @DisplayName("Test dodawania")
    public void additionTest() {

        int result = calculator.add(1, 2);

        assertEquals(3, calculator.add(1, 2));
        assertNotEquals(3, calculator.add(2, 2));

        System.out.println(calculator.getValue());
    }
        @Test
        @DisplayName("Test odejmowania")
        public void subtractionTest() {

            int result2 = calculator.subtraction(1, 2);

            assertEquals(-1, calculator.subtraction(1, 2));
            assertNotEquals(-1, calculator.subtraction(1, 5));

            System.out.println(calculator.getValue());

        }

        @Test
        @DisplayName("Test dzielenia")
        @Disabled("logika w trakcie implementacji")
        public void divisionTest(){

        }


    }
