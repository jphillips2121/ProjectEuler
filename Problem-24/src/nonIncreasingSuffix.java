/**
 * Created by jphillips3 on 26/04/2017.
 *
 * This class returns the String value of numerous separate values for a non increasing suffix string for Problem-24 of Project Euler.
 */

public class nonIncreasingSuffix {
    public String sequence = "";
    public int previousValue = 0;
    public String nonIncreasingSuffixString = "";
    public String pivotPoint = "";
    public String pivotPointLocation = "none";
    public String successorLocation;

    public nonIncreasingSuffix(String sequence) {
        this.sequence = sequence;
        for (int i = sequence.length() - 1; i >= 0; i--) {
            int currentValue = Character.getNumericValue(sequence.charAt(i));
            if (currentValue >= previousValue) {
                nonIncreasingSuffixString += Integer.toString(currentValue);
                previousValue = currentValue;
            }
            else {
                pivotPoint = Integer.toString(currentValue);
                pivotPointLocation = String.valueOf(i);
                break;
            }
        }
        this.nonIncreasingSuffixString = new StringBuilder(nonIncreasingSuffixString).reverse().toString();
        successorLocation = getLocationOfSuccessorLetter(sequence, pivotPoint, pivotPointLocation);


    }

    public static String getLocationOfSuccessorLetter(String sequence, String pivotPoint, String pivotPointLocation) {
        /**
         * NOTE: This method does not work for numbers with more than one of the same value (i.e: 0125330).
         * It only works with numbers that don't share numbers (i.e: 0123456789) such as the question asks.
         */
        int targetNumber = Integer.parseInt(pivotPoint) + 1;
        for (int j = targetNumber; j <= 9; j++) {
            int loopEnd = sequence.length();
            for (int i = Integer.parseInt(pivotPointLocation) + 1; i < sequence.length(); i++) {
                int num = Character.getNumericValue(sequence.toCharArray()[i]);
                if (j == Character.getNumericValue(sequence.toCharArray()[i])) {
                    return String.valueOf(i);
                }
            }
        }
        return "Error, no successor number found.";
    }
}
