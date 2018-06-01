import java.math.BigInteger;
import java.util.ArrayList;
import static oracle.jrockit.jfr.events.Bits.intValue;

/**
 * Created by jphillips3 on 02/05/2017.
 *
 * Analysis suggests that prime numbers can have up to d-1 repeating decimal digits
 * Therefore this program will calculate the largest prime number 'n' < 1000 that has 'n-1' repeating decimal digits when 1/n
 * This is known as a full reptend prime
 */

public class reciprocalCycles {
    public static void main(String[] args) {
        int biggestReptendPrime = 0;
        for (int i = 1; i <= 1000; i++) {
            ArrayList<BigInteger> listOfModulos = new ArrayList<>();
            for (int j = 1; j < i; j++) {
                BigInteger result = BigInteger.valueOf(10).pow(j);
                result = result.mod(BigInteger.valueOf(i));
                if (listOfModulos.contains(result)) {
                    break;
                }
                else {
                    listOfModulos.add(result);
                }
            }
            if (listOfModulos.size() == i - 1) {
                biggestReptendPrime = i;
            }
        }
        System.out.println("The largest Reptend Prime, and therefore the longest reciprocal cycle denominator is " + biggestReptendPrime + ".");
    }

}
