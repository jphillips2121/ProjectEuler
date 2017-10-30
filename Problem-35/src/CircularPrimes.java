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

//public class CircularPrimes {
//
//    public static boolean isPrime(int num) {
//
//        int limit = new Double(Math.sqrt(num) + 1).intValue();
//
//        for (long i = 2; i < limit; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static String rotate(String num, Integer numSize) {
//
//        String rotated;
//
//        if (numSize == 1) {
//            return num;
//        }
//
//        // Rotate array
//        rotated = num.substring(1, numSize) + num.charAt(0);
//
//        return rotated;
//    }
//
//    public static void main(String args[]) {
//
//        Integer limit = 1000000,
//                counter = 0,
//                numLength;
//
//        String test;
//
//        boolean prime = false;
//
//        // Loop through numbers
//        for (int i = 2; i < limit; i++) {
//            test = Integer.toString(i);
//            numLength = test.length();
//
//            // Loop through rotations
//            for (int j = 0; j < numLength; j++) {
//                if (isPrime(Integer.parseInt(test))) {
//                    test = rotate(test, numLength);
//                    prime = true;
//                }
//                else {
//                    prime = false;
//                    break;
//                }
//            }
//            if (prime) {
//                System.out.println(i);
//                counter += 1;
//            }
//        }
//        System.out.println("Answer found: " + counter);
//    }
//}