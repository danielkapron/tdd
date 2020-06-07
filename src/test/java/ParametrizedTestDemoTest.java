import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class ParametrizedTestDemoTest {

    @ParameterizedTest
    @ValueSource(strings = {"kajak", "rower", "radar"})
    public void palindromeTest(String word){
        //kajak
        //rower
        //radar
// w zwyklym tescie, po bledzie wyrzuca, a w parametrized mozna zrobic wszystkie, nawet jezeli jakis wyrzuci blad
//        assertTrue(isPalindrome("kajak"));
//        assertTrue(isPalindrome("rower"));
//        assertTrue(isPalindrome("radar"));

        assertTrue(isPalindrome(word));

    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {""})
    public void nullOrEmpty(String text){
        assertTrue(isEmpty(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void nullAndEmpty(String text){
        assertTrue(isEmpty(text));
    }

    @ParameterizedTest
    @EnumSource(value = TimeUnit.class)
    public void testWithEnumSource(TimeUnit timeUnit){
        assertNotNull(timeUnit);
    }

    @ParameterizedTest
    @EnumSource(value = TimeUnit.class, mode = EnumSource.Mode.EXCLUDE, names = {"SECONDS", "HOURS"})
    public void testWithEnumSourceWithExclude(TimeUnit timeUnit){
        assertNotNull(timeUnit);
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testWithLocalMethod(String word){
        assertTrue(isPalindrome(word));
    }

    private boolean isPalindrome(String word){

        String reverse = "";
        for (int i = word.length() -1; i >=0; i--){
            reverse += word.charAt(i);
        }
        return reverse.equals(word);
    }

    private boolean isEmpty(String word) {
        if (word == null || word.length() == 0) {
            return true;
        }

        return false;
    }

    static Stream<String> stringProvider(){
        return Stream.of("kajak", "rotor");
    }


}
