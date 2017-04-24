/**
 * Created by jphillips3 on 21/04/2017.
 * This answer is deliberately longer than intended
 * I wanted the ability to print out all numbers between 1 to 1000 if desired as well
 */
public class numberLetterCounts {
    public static void main(String[] args) {

        int totalLength = 0;
        int maxNum = 1000;
        for (int i = 1; i <= maxNum; i++) {
            if (i < 10) {
                totalLength += (oneDigit(i).length());
            }
            if (i >= 10 && i < 100) {
                totalLength += (twoDigit(i).length());
            }

            if (i >= 100 && i < 1000) {
                totalLength += (threeDigit(i).length());
            }

            if (i >= 1000 && i < 10000) {
                totalLength += (fourDigit(i).length());
            }
        }
        System.out.println(totalLength);

    }

    public static String oneDigit(int num) {
        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        //Takes the num value and returns the index of the 'unit' value
        int unitLocation = ((Integer.toString(num)).length()) - 1;
        //Finds the 'unit' value and returns it in word format
        int intValue = Character.getNumericValue((Integer.toString(num)).charAt(unitLocation));
        if (intValue == 0) {
            return "";
        }
        else {
            return ones[intValue - 1];
        }
    }

    public static String twoDigit(int num) {
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        //Finds the location of the unit value and ten value. I.e: in 76, 7 is the 'tenValue' and 6 is the 'UnitValue'
        int unitLocation = ((Integer.toString(num)).length()) - 1;
        int intValue = Character.getNumericValue((Integer.toString(num)).charAt(unitLocation));
        int tenValue = Character.getNumericValue((Integer.toString(num)).charAt(unitLocation - 1));

        if (tenValue == 0) {
            return oneDigit(intValue);
        }
        if (tenValue == 1) {
            return teens[intValue];
        }
        else {
            return tens[tenValue - 2] + oneDigit(num);
        }
    }

    public static String threeDigit(int num) {
        int unitLocation = ((Integer.toString(num)).length()) - 1;
        int intValue = Character.getNumericValue((Integer.toString(num)).charAt(unitLocation));
        int tenValue = Character.getNumericValue((Integer.toString(num)).charAt(unitLocation - 1));
        int hundredValue = Character.getNumericValue((Integer.toString(num)).charAt(unitLocation - 2));
        if (num % 100 == 0) {
            return oneDigit(hundredValue) + "hundred";
        }
        else if (tenValue == 0) {
            return oneDigit(hundredValue) + "hundredand" + oneDigit(intValue);
        }
        else {
            return oneDigit(hundredValue) + "hundredand" + twoDigit((10*tenValue) + intValue);
        }
    }

    public static String fourDigit(int num) {
        //Method is deliberately unfinished due to the problem only requiring numbers up to and including 1000.
        if (num % 1000 == 0) {
            return "onethousand";
        }
        else {
            return "unfinishedMethod";
        }
    }
}
