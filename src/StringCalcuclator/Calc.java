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
            String properInput = input;

            if (input.startsWith("//[")) {
                String listOfSeparators = input.substring(input.indexOf("//")+2, input.indexOf("\n"));
                properInput = input.substring(input.indexOf("\n")+1, input.length());
                while(!listOfSeparators.isEmpty()){
                    separator = listOfSeparators.substring(listOfSeparators.indexOf("[")+1, listOfSeparators.indexOf("]"));
                    properInput = properInput.replaceAll(separator, ",");
                    listOfSeparators = listOfSeparators.replaceFirst("\\[" + separator + "]","");
                }

            } else if (input.startsWith("//")){
                separator = input.substring(2,3);
                properInput = input.replaceFirst("//" + separator + "\n","")
                        .replaceAll(separator, ",");
            }

            inputWithoutNewLine = properInput.replaceAll("\n", ",");
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
