package FizzBazz;

public class FizzBazz {

    private static StringBuilder countingResult = new StringBuilder();

    public static String countFizzBuzz(int input1, int input2) {

        for (int i = input1; i <= input2; i++) {
            if (i % 3 == 0) {
                countingResult.append("Fizz ");
            }
            else {
                countingResult.append(i + " ");
            }
        }
        String countingResultString = countingResult.toString();
        return countingResultString;
    }


}
/*
1. podajesz dwie liczby
2. jeżeli jest podzielina przez 3, Fizz
3. jeżeli jest podzielna  przez 5, Buzz
4. jeżeli jest  podzielna  przez 3 i 5 - FizzBazz

 */
