package Palindrom;

import java.io.IOException;

public class Palindrom {

    String word; // do you need this? +method parameter has the same name - this might be confusing
    String printedCommunicate; // same here - do you need this?
    static StringBuilder palindrom = new StringBuilder(); // carefull suing static fields, you could create a new string builder inside of ifPalindrom()
    // this static field might give you troubles while testing
    

    // rename to isPalindrom?
    // you should not use NullPointerException -> this is a exception thrown by JVM as a last resort
    // you can use a more specific exception like InvalidParameter
    public static String ifPalindrom(String word) throws NullPointerException {
        if (word == null) {
            throw new NullPointerException();
        }
        else {
            String removedSpace = word.replaceAll(" ", "").toLowerCase(); // good clear name
            for (int i = 0; i < removedSpace.length(); i++) {
                palindrom = palindrom.append(removedSpace.charAt(removedSpace.length() - 1 - i)); // this not a palindom, this is a reversed word
            }
            String palindrom1 = palindrom.toString();

            //if you rename palindrom1 to reversedWordTrimmed and removedSpace to wordTrimmed this would be:
            // if (wordTrimmed.equals(reversedWordTrimmed)) which I think is pretty clear
            // you could even extract a method reverse() and then it would be:
            // if (wordTrimmed.equals(reverse(wordTrimmed))) which is also preety nice
            if (removedSpace.equals(palindrom1)) {
                System.out.println("To palindrom"); //this is ok for testing but in production code avoid printing from internal of funcitons
                return "To palindrom"; //maybe return boolean?
            } else {
                System.out.println("To nie palindrom");
                return "To nie palindrom";
            }
        }
    }
}
