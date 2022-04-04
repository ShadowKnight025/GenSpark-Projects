package Main;


import com.projects.Main;
import org.junit.jupiter.api.*;


public class test {

    Main main;

    @BeforeEach
    void setup()
    {
        Main main = new Main();
    }

    @Test
    void userinput()
    {
        assert(main.answer == main.answer): "test failed?";
    }
}
