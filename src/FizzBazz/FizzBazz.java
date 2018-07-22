package FizzBazz;

public class FizzBazz {

    public static String countFizzBuzz(int input1, int input2) {
        StringBuilder countingResult = new StringBuilder();

        for (int i = input1; i <= input2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                countingResult.append("FizzBazz ");
            }
            else if (i % 3 == 0) {
                countingResult.append("Fizz ");
            }
            else if (i % 5 == 0) {
                countingResult.append("Bazz ");
            }
            else {
                countingResult.append(i + " ");
            }
        }
        return countingResult.toString();
    }


}

