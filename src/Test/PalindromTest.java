package Test;

import Palindrom.Palindrom;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {

    @Test
    public void ifPalindromTest(){
       String resultFromMethod = Palindrom.ifPalindrom("kajak");
       assertEquals(resultFromMethod, "To palindrom");

    }

}