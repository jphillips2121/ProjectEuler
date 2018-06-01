/**
 * Created by jphillips3 on 09/03/2017.
 */
public class divisibleTriangleNumber {
    public static void main(String[] args) {
        int startNum = 1;
        int nextNum = 2;
        while (getDivisors(startNum) <= 500) {
            startNum += nextNum;
            System.out.println("Number of divisors for " + startNum + " is " + getDivisors(startNum) + ". Last number added was " + nextNum);
            nextNum += 1;
        }
        System.out.println(startNum);
    }

    public static long getDivisors(int num) {
        long divisors = 0;
        for (int i = 2; i*i <= num / 2; i++) {
            if (num % i == 0) {
                divisors += 2;
            }
        }
        return divisors;
    }
}
