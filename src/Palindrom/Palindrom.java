package Palindrom;

public class Palindrom {

    String word;
    String printedCommunicate;
    static StringBuilder palindrom = new StringBuilder();

    public static String ifPalindrom(String word) {
        String removedSpace = word.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < removedSpace.length(); i++) {
            palindrom = palindrom.append(removedSpace.charAt(removedSpace.length()-1-i));
        }
        String palindrom1 = palindrom.toString();

        if (removedSpace.equals(palindrom1)) {
            System.out.println("To palindrom");
            return "To palindrom";
        }
        else {
            System.out.println("To nie palindrom");
            return "To nie palindrom";
        }
    }
}
