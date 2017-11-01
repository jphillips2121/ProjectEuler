import java.util.Arrays;

/**
 * Created by jphillips3 on 01/11/2017.
 */
public class PandigitalPrimes {
    public static void main(String[] args) {
        int highestNum = 0;
        for (int i = 2143; i <= 999999999; i++) {
            if (isPandigital(String.valueOf(i)) && isPrime(i)) {
                highestNum = i;
            }
        }
        System.out.println(highestNum);
    }


    public static boolean isPandigital(String strNum) {
        char[] charNum = strNum.toCharArray();
        Arrays.sort(charNum);
        for (int i = 0; i < charNum.length; i++) {
            if (!((i+1) == Character.getNumericValue(charNum[i]))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
