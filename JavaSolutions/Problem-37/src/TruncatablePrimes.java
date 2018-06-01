import java.util.ArrayList;
import java.util.List;

/**
 * Created by jphillips3 on 31/10/2017.
 */
public class TruncatablePrimes {

    public static void main(String[] args) {
        List<Integer> truncatablePrimes = new ArrayList<>();
        int i = 10;
        while (truncatablePrimes.size() < 11) {
            if (truncatableLeft(i) && truncatableRight(i)) {
                truncatablePrimes.add(i);
            }
            i += 1;
        }
        int total = 0;
        for (int n : truncatablePrimes) {
            total += n;
        }
        System.out.println(total);
    }

    public static boolean truncatableLeft(int num) {
        if (isPrime(num) && String.valueOf(num).length() == 1) {
            return true;
        }
        else if (isPrime(num) && String.valueOf(num).length() > 1) {
            return truncatableLeft(Integer.parseInt((String.valueOf(num)).substring(1)));
        }
        else {
            return false;
        }
    }

    public static boolean truncatableRight(int num) {
        if (isPrime(num) && String.valueOf(num).length() == 1) {
            return true;
        }
        else if (isPrime(num) && String.valueOf(num).length() > 1) {
            int strLength = String.valueOf(num).length();
            return truncatableRight(Integer.parseInt((String.valueOf(num)).substring(0, strLength - 1)));
        }
        else {
            return false;
        }
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

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
