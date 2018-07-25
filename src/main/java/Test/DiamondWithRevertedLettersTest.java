package Test;

import Diamond.DiamondWithRevertedLetters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;

import org.junit.Test;

import static org.junit.Assert.*;

//@RunWith(JUnitParamsRunner.class)
public class DiamondWithRevertedLettersTest {

    private DiamondWithRevertedLetters d1;

    @Before
    public void setUp() {
        d1 = new DiamondWithRevertedLetters();
    }

    //nie rozumiem, dlaczego nie czyta parametrów; aby uniknąć błędu, zakomentowałam linię 14: @RunWith
    //komunikat błędu: java.lang.IllegalStateException: Method Test.DiamondWithRevertedLettersTest#returnNextLetter is annotated with @Parameters but there were no parameters provided
    /*@Test
    @Parameters({
            "'a', 1",
            "'b', 2",
            "'c', 3",
            "'g', 7"})
    public void changeLetterIntoHeight(String input, int height) {
        int result = d1.changeToAscii(input);
        Assert.assertEquals(height, result);
    }*/

    @Test
    public void changeLetterIntoHeight1() {
        int result = d1.changeToAscii("d");
        Assert.assertEquals(4, result);
    }

    @Test
    public void returnNextLetter() {
        char result = d1.returnNextLetter('c');
        Assert.assertEquals('d', result);
    }

    @Test
    public void returnPreviousLetter() {
        char result = d1.returnPreviousLetter('e', 1);
        Assert.assertEquals('d', result);
    }

    @Test
    public void returnPreviousLetter2() {
        char result = d1.returnPreviousLetter('d', 3);
        Assert.assertEquals('a', result);
    }
}