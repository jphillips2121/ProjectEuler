/**
 * Created by jphillips3 on 06/03/2017.
 */
public class sumOfPrimes {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long totalCount = 2L;
        for (int i = 3; i < 2000000; i++) {
            if (isPrime(i)) {
                totalCount += i;
                System.out.println(i);
            }
        }
        System.out.println("Total Count Is: " + totalCount);
    }
}
