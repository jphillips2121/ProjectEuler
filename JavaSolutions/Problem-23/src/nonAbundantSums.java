import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jphillips3 on 25/04/2017.
 * Solution here is to sum all numbers in range and subtract sum of all abundant numbers resulting in sum of all non abundant numbers.
 */
public class nonAbundantSums {
    public static void main(String[] args) {
        List<Integer> abundantNumbers = new ArrayList<>();
        List<Integer> range = IntStream.range(1, 28124).boxed().collect(Collectors.toList());

        for (int i = 12; i <= 28123; i++) {
            if (isAbundantNumber(i)) {
                abundantNumbers.add(i);
            }
        }

        Set<Integer> AbundantNumberSum = GetAbundantNumberSum(abundantNumbers);
        BigInteger totalAbundantNumberSum = BigInteger.ZERO;

        for (int num : AbundantNumberSum) {
            if (num > 28123) {
                break;
            }
            totalAbundantNumberSum = totalAbundantNumberSum.add(BigInteger.valueOf(num));
        }

        BigInteger totalRangeSum = BigInteger.ZERO;
        for (int num : range) {
            totalRangeSum = totalRangeSum.add(BigInteger.valueOf(num));
        }
        //System.out.println(totalRangeSum);
        //System.out.println(totalAbundantNumberSum);

        System.out.println("The total sum of integers which is not the sum of two abundant numbers is " + totalRangeSum.subtract(totalAbundantNumberSum));

    }

    public static int getDivisorTotal(int num) {
        int divisorSumTotal = 0;
        for (int i = 1; i <= num/2; i++) {
            if ((num % i) == 0) {
                divisorSumTotal += i;
            }
        }
        return divisorSumTotal;
    }

    public static boolean isAbundantNumber(int num) {
        if (getDivisorTotal(num) > num) {
            return true;
        }
        return false;
    }

    public static Set<Integer> GetAbundantNumberSum(List<Integer> abundantNumbers) {
        Set<Integer> sumOfAllAbundantNumbers = new HashSet<>();
        for (int i = 0; i < abundantNumbers.size(); i++) {
            for (int j = 0; j < abundantNumbers.size(); j++) {
                sumOfAllAbundantNumbers.add(abundantNumbers.get(i) + abundantNumbers.get(j));
            }
        }
        return sumOfAllAbundantNumbers;
    }
}
