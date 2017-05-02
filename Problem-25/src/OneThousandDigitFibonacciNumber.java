import java.math.BigInteger;

/**
 * Created by jphillips3 on 02/05/2017.
 */
public class OneThousandDigitFibonacciNumber {
    public static void main(String[] args) {
        BigInteger currentNum = BigInteger.ONE;
        BigInteger previousNum = BigInteger.ONE;
        int DigitLength = 1;
        int i = 2;
        while(DigitLength < 1000) {
            BigInteger[] nextFibonacci = getNextFibonacci(currentNum, previousNum);
            i++;
            currentNum = nextFibonacci[0];
            previousNum = nextFibonacci[1];
            DigitLength = (String.valueOf(currentNum)).length();
        }
        System.out.println("The first 1000 digit Fibonacci Number is at location " + i + " in the sequence.");
    }

    public static BigInteger[] getNextFibonacci(BigInteger num, BigInteger previousNum) {
        BigInteger newNum = num.add(previousNum);
        previousNum = num;
        BigInteger[] returnValue = {newNum, previousNum};
        return returnValue;
    }
}
