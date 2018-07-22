package Test;

import FizzBazz.FizzBazz;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBazzTest {

    @Test
    public void choosingThreesOutOfTwoNumbers() {
        int input1 = 1;
        int input2 = 2;
        String result = FizzBazz.countFizzBuzz(input1, input2);
        Assert.assertEquals("1\n2\n", result);
    }

    @Test
    public void choosingThrees() {
        int input1 = 1;
        int input2 = 4;
        String result = FizzBazz.countFizzBuzz(input1, input2);
        Assert.assertEquals("1\n2\nFizz\n4\n", result);
    }

    @Test
    public void choosingThreesAndFives() {
        int input1 = 1;
        int input2 = 10;
        String result = FizzBazz.countFizzBuzz(input1, input2);
        Assert.assertEquals("1\n2\nFizz\n4\nBazz\nFizz\n7\n8\nFizz\nBazz\n", result);
    }

    @Test
    public void choosingNumbersDividedSimultaneouslyBy3AndFive() {
        int input1 = 10;
        int input2 = 16;
        String result = FizzBazz.countFizzBuzz(input1, input2);
        Assert.assertEquals("Bazz\n11\nFizz\n13\n14\nFizzBazz\n16\n", result);
    }
}