import java.util.ArrayList;
import java.util.List;

/**
 * Created by jphillips3 on 02/11/2017.
 */
public class SubStringDivisibility {
    public static List<Long> pandigitalNumbers = new ArrayList<>();
    public static int[] listOfPrimes = {2,3,5,7,11,13,17};
    public static void main(String[] args) {
        permutation("", "0123456789");
        long total = 0L;
        for (Long l : pandigitalNumbers) {
            if (isDivisibleByPrimes(l)) total += l;
        }
        System.out.println(total);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if ((n == 0 && Long.parseLong(prefix) > 1000000000L)) {
            pandigitalNumbers.add(Long.parseLong(prefix));
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    private static boolean isDivisibleByPrimes(Long num) {
        String numStr = String.valueOf(num);
        for (int i = 1; i <= 7; i++) {
            String threeDigitString = (new StringBuilder().append(numStr.charAt(i)).append(numStr.charAt(i+1)).append(numStr.charAt(i+2))).toString();
            if (!((Integer.parseInt(threeDigitString) % listOfPrimes[i-1]) == 0)) {
                Math.abs(-3);
                return false;
            }
        }
        return true;
    }
}
