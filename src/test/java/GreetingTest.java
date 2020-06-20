import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    public void beforeEach(){
        greeting = new Greeting();
    }

    @Test
    public void helloJanTest(){
        assertEquals("Witaj, Jan.", greeting.greet("Jan"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void helloNullOrEmpty(String name){
        assertEquals("Witaj, przyjacielu.", greeting.greet(name));
    }

    @Test
    public void helloArrayTest(){
        assertEquals("Witaj, Jan i Karolina.", greeting.greet(new String[] {"Jan", "Karolina"}));
    }

    @Test
    public void helloMultipleNameTest(){
        assertEquals("Witaj, Jan, Wojciech, Karolina i Marta.", greeting.greet("Jan", "Wojciech", "Karolina", "Marta"));
    }

}
