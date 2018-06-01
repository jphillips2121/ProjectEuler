import java.math.BigDecimal;

/**
 * Created by jphillips3 on 21/04/2017.
 */
public class PowerDigitSum {
    public static void main(String args[]) {

        BigDecimal sqrdNumber = new BigDecimal((Math.pow(2,1000)));
        char[] sqrdNumberArray = (sqrdNumber.toString()).toCharArray();

        //Requires language level 5 or above
        int sumOfDigits = 0;
        for (char c : sqrdNumberArray) {
            sumOfDigits += Character.getNumericValue(c);
        }

        System.out.println(sumOfDigits);
    }
}
