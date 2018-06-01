/**
 * Created by jphillips3 on 14/02/2017.
 */
public class primeFactor {
    public static int getPrime(long num) {
        boolean isPrime = false;
        int divideNum = 2;
        while(!isPrime) {
            if (num%divideNum == 0) {
                isPrime = true;
            }
            else {
                divideNum += 1;
            }
        }
        return divideNum;
    }

    public static void main(String[] args) {
        long num = 600851475143L;
        int largestPrime = 1;
        while (num > 1) {
            if (getPrime(num) > largestPrime) {
                largestPrime = getPrime(num);
            }
            num = num / getPrime(num);
        }
        System.out.println(largestPrime);

    }
}
