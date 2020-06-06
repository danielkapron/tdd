import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;


public class AssumptionsDemoTest {


    @Test
    public void testOnlyOnCiServer(){
        assumeTrue("CI".equals(System.getenv("ENV")));
    }

    @Test
    public void testOnlyDeveloperWorkstation(){
        assumeTrue("DEV".equals(System.getenv("ENV")), () -> "Aborting test: Not a developer workstation");
    }

    @Test
    public void testInAllEnviornmentions(){
        assumingThat("CI".equals(System.getenv("ENV")), () -> {
            Calculator calculator = new Calculator();
            assertEquals(3, calculator.add(3,0));
        });
        System.out.println("Test on all enviornments");

        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(3,3));

    }


}
