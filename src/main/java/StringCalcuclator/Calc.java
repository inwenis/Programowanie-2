package StringCalcuclator;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public static int Sum(String input) { // by convention method names in java are lower case https://google.github.io/styleguide/javaguide.html#s5.2.3-method-names
        int sum; // no need to declare sum here as it is used far below only
        String[] inputTab;
        if (input.equals("")) {
            return 0;
        }

        // by convention we write if else like this in java:
        // if () {
        //     ...
        // } else {
        //     ...
        // }
        // you can decide on other conventions but you have to stick to it

        else {
            String separator;
            String inputWithoutNewLine;
            String properInput = input;

            if (input.startsWith("//[")) { // could be extracted to hasMultipleCustomSeparators() method
                String listOfSeparators = input.substring(input.indexOf("//")+2, input.indexOf("\n")); // +2 is little magic, you can replace it with "//".length, maybe that would be clearer?
                properInput = input.substring(input.indexOf("\n")+1, input.length()); // what does proper input means? maybe it should be renames to `numbers`
                // wow, this method of extracting custom separators is really interesting!
                // this could be extracted to a method for better readability
                while(!listOfSeparators.isEmpty()){
                    separator = listOfSeparators.substring(listOfSeparators.indexOf("[")+1, listOfSeparators.indexOf("]"));
                    properInput = properInput.replaceAll(separator, ",");
                    listOfSeparators = listOfSeparators.replaceFirst("\\[" + separator + "]","");
                }

            } else if (input.startsWith("//")){ // could be extracted to hasSingleCustomSeparator()
                separator = input.substring(2,3);
                properInput = input.replaceFirst("//" + separator + "\n","") // did you try to write a test for: //-\n1-2-3?
                        .replaceAll(separator, ",");
            }

            inputWithoutNewLine = properInput.replaceAll("\n", ",");
            inputTab = inputWithoutNewLine.split(","); // what does `inputTab` mean?

            // method extract? validateInput() or something similar?
            if(inputWithoutNewLine.contains("-")) {
                List<String> listWithNegatives = new ArrayList<>();
                for (int i = 0; i < inputTab.length; i++) {
                    if (Integer.parseInt(inputTab[i]) < 0) {
                        listWithNegatives.add(inputTab[i]);
                    }
                }
                // typo: Argument
                throw new IllegalArgumentException("Arugment cannot be a negative number. Negative numbers detected: " + listWithNegatives);
            }

            // why adding first number outside of loop?
            sum = Integer.parseInt(inputTab[0]); // did you test input: "1000,1,2", result should be 3, but will be 1003
            for (int i = 1; i < inputTab.length; i++) { // can be replaced with foreach
                if (Integer.parseInt(inputTab[i])<1000){
                    sum += Integer.parseInt(inputTab[i]);
                }
            }
            return sum;
        }
    }


}
