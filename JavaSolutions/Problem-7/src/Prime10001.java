/**
 * Created by jphillips3 on 23/02/2017.
 */
public class Prime10001 {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int num) {
        num = num + 2;
        int divideNum = 2;
        while(!isPrime(num)) {
            num = num + 2;
        }
        return num;
    }

    public static void main(String[] args) {
        int prime = 3;
        int numberInSeq = 10001;
        for (int i = 2; i < numberInSeq; i++) {
            nextPrime(prime);
            prime = nextPrime(prime);
        }
        System.out.println(prime);
    }
}
