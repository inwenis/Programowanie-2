package StringCalcuclator;

public class Calc {

    public static int Sum(String input) {
        int sum;
        String[] inputTab;
        if(input.equals("")) {
            return 0;
        }
        else {
            inputTab = input.split(",");
            sum = Integer.parseInt(inputTab[0]);
            for(int i = 1; i < inputTab.length; i++){
                sum+= Integer.parseInt(inputTab[i]);
            }
            return sum;
        }
    }


}
