package Test;

import StringCalcuclator.Calc;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static StringCalcuclator.Calc.Sum;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void emptyInutReturnsZero() {
        String input = "";
        int result = Calc.Sum(input);
        Assert.assertEquals(0, result);
    }
    @Ignore
    @Test
    public void oneNumberInInputReturnsNumber() {
        String input = "1";
        int result = Calc.Sum(input);
        Assert.assertEquals(1, result);
    }

    @Test
    public void twoNumbersInInputReturnsTheirSum() {
        String input = "100,2";
        int result = Calc.Sum(input);
        Assert.assertEquals(102, result);
    }

    @Test
    public void AnyNumbersInInputReturnTheirSum() {
        String input = "1,2,3,4";
        int result = Calc.Sum(input);
        Assert.assertEquals(10, result);
    }

}