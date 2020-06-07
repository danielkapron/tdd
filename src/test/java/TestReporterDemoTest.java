import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

public class TestReporterDemoTest {


    @Test
    @DisplayName("Reportowanie pojedynczej wartości")
    public void reportSingleValue(TestReporter testReporter, TestInfo testInfo){
        testReporter.publishEntry("a single value");
        System.out.println();
        System.out.println("a single value");

        testReporter.publishEntry(testInfo.getDisplayName());
    }

    @Test
    public void reportKeyValuePair(TestReporter testReporter){
        testReporter.publishEntry("a key", "a value");
    }

    @Test
    public void reportMultipleKeyValuePairs(TestReporter testReporter){
        Map<String, String> value = new HashMap<>();
        value.put("key1", "value1");
        value.put("key2", "value2");
    }


}
