import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class MyBeforeAfterTest {

    @BeforeEach
    public void beforeEach(){

        System.out.println("Before Each Test Method");

    }


    @Test
    public void test1(){
        System.out.println("test1");
    }
}
