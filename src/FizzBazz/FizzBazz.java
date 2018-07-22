package FizzBazz;

public class FizzBazz {

    public static String countFizzBuzz(int input1, int input2) {
        StringBuilder countingResult = new StringBuilder();

        for (int i = input1; i <= input2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                countingResult.append("FizzBazz\n");
            }
            else if (i % 3 == 0 || Integer.toString(i).contains("3")) {
                countingResult.append("Fizz\n");
            }
            else if (i % 5 == 0 || Integer.toString(i).contains("5")) {
                countingResult.append("Bazz\n");
            }
            else {
                countingResult.append(i + "\n");
            }
        }
        return countingResult.toString();
    }


}

