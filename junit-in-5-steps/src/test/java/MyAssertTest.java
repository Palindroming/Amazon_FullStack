import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "Azure", "Google Cloud", "Oracle Cloud");


    @Test
    public void test(){
        boolean test = todos.contains("AWS");
        assertEquals(true,test);
        assertEquals(3,todos.size());
    }
}
