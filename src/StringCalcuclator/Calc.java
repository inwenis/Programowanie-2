package StringCalcuclator;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public static int Sum(String input) {
        int sum;
        String[] inputTab;
        if (input.equals("")) {
            return 0;
        }

        else {
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


            if(inputWithoutNewLine.contains("-")) {
                List<String> listWithNegatives = new ArrayList<>();
                for (int i = 0; i < inputTab.length; i++) {
                    if (Integer.parseInt(inputTab[i]) < 0) {
                        listWithNegatives.add(inputTab[i]);
                    }
                }
                throw new IllegalArgumentException("Arugment cannot be a negative number. Negative numbers detected: " + listWithNegatives);
            }

            sum = Integer.parseInt(inputTab[0]);
            for (int i = 1; i < inputTab.length; i++) {
                if (Integer.parseInt(inputTab[i])<1000){
                    sum += Integer.parseInt(inputTab[i]);
                }
            }
            return sum;
        }
    }


}
