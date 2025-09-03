import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    private MyMath math = new MyMath();



    @Test
   public void testCalculateSum() {
       assertEquals(15,math.calculateSum(new int[]{1,2,3,4,5}));


    }


    @Test
    public void calculateSum_ZeroLenghArray(){
        assertEquals(0,math.calculateSum(new int[]{}));


    }
}
