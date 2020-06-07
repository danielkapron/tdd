import org.junit.jupiter.api.*;

public class RepeatedTestDemoTest {


    @BeforeEach
    public void beforeEach(TestInfo testInfo, TestReporter testReporter, RepetitionInfo repetitionInfo){
    int currentRepetition = repetitionInfo.getCurrentRepetition();
    int totalRepetition = repetitionInfo.getTotalRepetitions();
    String methodName = testInfo.getDisplayName();

        testReporter.publishEntry(String.format("Wykonywany test %d z %d dla %s", currentRepetition, totalRepetition, methodName));
    }

    @RepeatedTest(value = 10, name = "{displayName} {currentRepetition}")
    @DisplayName("Test wielokrotny")
    public void repeatedTest(TestInfo testInfo, TestReporter testReporter, RepetitionInfo repetitionInfo){
        testReporter.publishEntry(testInfo.getDisplayName());
        testReporter.publishEntry(repetitionInfo.getCurrentRepetition() + "");
        testReporter.publishEntry(repetitionInfo.getTotalRepetitions() + "");
    }






}
