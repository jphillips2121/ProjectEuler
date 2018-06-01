/**
 * Created by jphillips3 on 25/04/2017.
 */
public class AmicableNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfAmicables(10000));
    }

    public static int divisorSum(int num) {
        int divisorSumTotal = 0;
        for (int i = 1; i <= num/2; i++) {
            if ((num % i) == 0) {
                divisorSumTotal += i;
            }
        }
        return divisorSumTotal;
    }

    public static int sumOfAmicables(int highestNum) {
        int amicableSum = 0;
        for (int i = 1; i < highestNum; i++) {
            if (i == divisorSum(divisorSum(i))) {
                if (i != divisorSum(i)) {
                    amicableSum += i;
                }
            }
        }
        return amicableSum;
    }
}
