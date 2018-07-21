package Palindrom;


import java.util.Scanner;

public class RunnerPalindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj słowo/zdanie do sprawdzenia.");
        String userInput = sc.next();

        String word;
        StringBuilder palindrom = new StringBuilder();

        Palindrom.ifPalindrom(userInput);
    }

}
