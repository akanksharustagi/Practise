import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AllTest {
    Calculator calculator;
    @Before
    public void Setup(){
        calculator= new Calculator();
    }
    @Test
    public void sumTest(){
        int expect = 6;
        int outcome= calculator.sum(2,4);
        Assert.assertEquals(expect, outcome);
    }
    @Test
    public void sumTest2(){
        int expected = -2;
        int outcome = calculator.sum(2 ,-4);
        Assert.assertEquals(expected, outcome);
    }
@Test
    public void cubeTest(){
        int expectations  = 8;
        int output = Cube.cube(2);
        Assert.assertEquals(expectations, output);
    System.out.println("All test working");
}
@Test
    public void divideTest(){
        Assert.assertEquals(4, calculator.divide(8,2));
}
@Test (expected = RuntimeException.class, timeout = 200)
    public void divideby0(){
        Assert.assertEquals(0, calculator.divide(2,0));
}
}
