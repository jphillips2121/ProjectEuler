/**
 * Created by jphillips3 on 09/05/2017.
 */
public class DigitFifthPowers {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1000; i < 1000000; i++) {
            if (fifthPowersCheck(i)) {
                total += i;
            }
        }
        System.out.println(total);
    }

    public static boolean fifthPowersCheck(int num) {
        double digitOne = Math.pow((double)Character.getNumericValue(String.valueOf(num).charAt(0)), 5);
        double digitTwo = Math.pow((double)Character.getNumericValue(String.valueOf(num).charAt(1)), 5);
        double digitThree = Math.pow((double)Character.getNumericValue(String.valueOf(num).charAt(2)), 5);
        double digitFour = Math.pow((double)Character.getNumericValue(String.valueOf(num).charAt(3)), 5);
        double addedTotal = digitOne + digitTwo + digitThree + digitFour;
        if (String.valueOf(num).length() > 4) {
            double digitFive = Math.pow((double)Character.getNumericValue(String.valueOf(num).charAt(4)), 5);
            addedTotal += digitFive;
        }
        if (String.valueOf(num).length() > 5) {
            double digitSix = Math.pow((double)Character.getNumericValue(String.valueOf(num).charAt(5)), 5);
            addedTotal += digitSix;
        }

        if (addedTotal == num) {
            return true;
        }
        return false;
    }
}
