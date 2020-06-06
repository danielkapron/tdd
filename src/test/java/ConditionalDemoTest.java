import jdk.jfr.Enabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalDemoTest {


    @Test
    @EnabledOnOs(OS.MAC)
    public void onlyOnMacOs(){
        System.out.println("only on mac");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void onlyOnWindowsOs(){
        System.out.println("only on windows");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void onlyOnJava8(){
        System.out.println("only java8");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    public void onlyOnJava11(){
        System.out.println("only on java11");
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    public void onlyOn64BitArchitecture(){
        System.out.println("Only on 64 bit");
    }


    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = ".*dev.*")
    public void onlyOnDeveloperWorkStation(){
        System.out.println("only on dev");
    }





}
