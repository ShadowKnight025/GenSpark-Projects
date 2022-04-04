import com.projects.Main;
import org.junit.jupiter.api.*;

import javax.print.DocFlavor;

public class MainTest {

    @BeforeEach
    void setup()
    {
        System.out.println("Starting test...");
    }

    @Test
    void testrandomnumber()
    {
        assert(Main.random_number >= 0 && Main.random_number <= 20): "Invalid random number given!" + Main.random_number;
    }

}
