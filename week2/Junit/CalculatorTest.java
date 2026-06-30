import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {


    @Test
    public void testAddition() {

        Calculator calc = new Calculator();

        int result = calc.add(10,20);

        assertEquals(30,result);
    }


    @Test
    public void testMultiplication() {

        Calculator calc = new Calculator();

        int result = calc.multiply(5,4);

        assertEquals(20,result);
    }

}