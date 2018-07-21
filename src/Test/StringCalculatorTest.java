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
    public void anyNumbersInInputReturnTheirSum() {
        String input = "1,2,3,4";
        int result = Calc.Sum(input);
        Assert.assertEquals(10, result);
    }

    @Test
    public void newLineSeparatorInInputReturnTheirSum() {
        String input = "1\n2,4";
        int result = Calc.Sum(input);
        Assert.assertEquals(7, result);
    }

    @Test
    public void userCanDefineOwnSeparator() {
        String input = "//;\n1;8";
        int result = Calc.Sum(input);
        Assert.assertEquals(9, result);
    }
    //aby zdefiniować separator w stringu wejściowym będzie coś takiego: "//;\n1;2" (suma 3)

    @Test(expected = IllegalArgumentException.class)
    public void checkingNegativesInInput() {
        String input = "//;\n-1;8;-9;-5;";
        int result = Calc.Sum(input);
    }

    @Test
    public void shouldIllegalArgumentException() {
        String input = "//;\n-1;8;-9;-5;";
        try {
            int result = Calc.Sum(input);
            fail("Operation should result in IllegalArgumentException");
        }
        catch(IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Arugment cannot be a negative number. Negative numbers detected: [-1, -9, -5]");
        }
    }
}