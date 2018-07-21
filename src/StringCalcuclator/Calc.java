package StringCalcuclator;

public class Calc {

    public static int Sum(String input) {
        int sum;
        String[] inputTab;
        if (input.equals("")) {
            return 0;
        } else {
            String separator;
            String inputWithoutNewLine;
            String inputWithoutSeparator = input;

            if (input.startsWith("//")) {
                separator = input.substring(2, 3);
                inputWithoutSeparator = input.replaceFirst("//"+separator+"\n","")
                        .replaceAll(separator, ",");
            }

            inputWithoutNewLine = inputWithoutSeparator.replaceAll("\n", ",");
            inputTab = inputWithoutNewLine.split(",");
            sum = Integer.parseInt(inputTab[0]);
            for (int i = 1; i < inputTab.length; i++) {
                sum += Integer.parseInt(inputTab[i]);
            }
            return sum;
        }
    }


}
