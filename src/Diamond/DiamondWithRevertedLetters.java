package Diamond;

import java.util.Scanner;

//version 2: letters go one after another till the widest part of the diamond; later on they go backwards
public class DiamondWithRevertedLetters {
    public static void main(String[] args) {

        DiamondWithRevertedLetters diamond = new DiamondWithRevertedLetters();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę, która będzie najszerszym poziomem diamentu");
        String input = scanner.next();

        int h = diamond.changeToAscii(input);

        printDiamond(h);

    }


    public int changeToAscii(String input) {
        String inputUpperCase = input.toUpperCase(); //in case a user chooses lower case letter I change every letter to upper case
        char charUpperCase = inputUpperCase.charAt(0);
        int hight = charUpperCase - 64;
        return hight;
    }

    public static void printDiamond(int h) {
        char letter = 'A';
        int hBackUp = h;
        StringBuilder diamondBuilding = new StringBuilder();

        //building top of the diamond
        for (int j = 0; j < h; j++) {

            for (int i = hBackUp; i > 0; i--) {
                diamondBuilding.append(" ");
            }
            hBackUp -= 1;

            int counter = 1;
            for (int k = 1; k <= (2 * (h - hBackUp) - 1); k ++) {
                if (counter == 1 || counter == (2 * (h - hBackUp) - 1)) {
                    diamondBuilding.append(letter);
                    counter++;
                }
                else {
                    diamondBuilding.append(" ");
                    counter++;
                }
            }
            letter = returnNextLetter (letter);
            diamondBuilding.append(System.lineSeparator());
        }

        letter = returnPreviousLetter(letter, 2);
        //building bottom of the diamond
        hBackUp = h - 1;
        for (int m = 0; m < h - 1; m++) {

            for (int n = 0; n < h - hBackUp + 1; n++) {
                diamondBuilding.append(" ");
            }
            hBackUp -= 1;

            //drukowanie piramidy
            int counter = 1;
            for (int p = 2 * hBackUp + 1; p >= 0 ; p--) {
                if (counter == 1 || counter == 2 * hBackUp + 1) {
                    diamondBuilding.append(letter);
                    counter++;
                }
                else {
                    diamondBuilding.append(" ");
                    counter++;
                }
            }
            letter = returnPreviousLetter(letter, 1);
            diamondBuilding.append(System.lineSeparator());
        }

        System.out.println(diamondBuilding.toString());
    }



    public static char returnNextLetter (char letter) {
        String stringLetter = Character.toString(letter);
        int charValue = stringLetter.charAt(0);
        String stringNextLetter = String.valueOf((char) (charValue + 1));
        char nextLetter = stringNextLetter.charAt(0);
        return nextLetter;
    }

    public static char returnPreviousLetter (char letter, int numberOfPositions) {
        String stringLetter = Character.toString(letter);
        int charValue = stringLetter.charAt(0);
        String stringNextLetter = String.valueOf((char) (charValue - numberOfPositions));
        char nextLetter = stringNextLetter.charAt(0);
        return nextLetter;
    }

}