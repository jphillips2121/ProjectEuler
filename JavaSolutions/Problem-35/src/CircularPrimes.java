import java.util.ArrayList;
import java.util.List;

/**
 * Created by jphillips3 on 30/10/2017.
 */
public class CircularPrimes {
    public static List<String> strVariations = new ArrayList<String>();

    public static void main(String[] args) {
        //Set to 4 to account for all circular primes under 10
        int totalCircularPrimes = 4;
        for (int i = 10; i <= 1000000; i++) {
            if (isPrime(i)) {
                if (isCircularPrime(i)) {
                    totalCircularPrimes++;
                }
                strVariations.clear();
            }
        }
        System.out.println(totalCircularPrimes);
    }

    public static boolean isCircularPrime(int num) {
        String strNum = String.valueOf(num);
        for (int i = 0; i < strNum.length(); i++) {
            if (!isPrime(Integer.parseInt(strNum.substring(i) + strNum.substring(0,i)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}