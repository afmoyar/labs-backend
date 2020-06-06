package co.edu.unal.software_engineering.labs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
//this is just a comment
@RunWith(SpringRunner.class)
@SpringBootTest
public class ErrorTest {
    @Test
    public void test()
    {
        assertEquals( "hello", "bye" );
    }
    
}