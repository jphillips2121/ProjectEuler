import java.math.BigInteger;

/**
 * Created by jphillips3 on 25/04/2017.
 */
public class FactorialDigitSum {
    public static void main(String[] args) {

        BigInteger factorialNum = factorial(100);
        System.out.println(sumOfNumbers(factorialNum));
    }



    public static BigInteger factorial(int num) {
        /**
         * Returns factorial value of number
         */
        BigInteger factorialAns = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            BigInteger multiple = BigInteger.valueOf(i);
            factorialAns = factorialAns.multiply(multiple);
        }
        return factorialAns;
    }

    public static int sumOfNumbers(BigInteger num) {
        /**
         * Returns individual numbers of BigInteger added together
         */
        String strNum = num.toString();
        int cumulativeTotal = 0;
        for (char c : strNum.toCharArray()) {
            cumulativeTotal += Character.getNumericValue(c);
        }
        return cumulativeTotal;
    }
}
