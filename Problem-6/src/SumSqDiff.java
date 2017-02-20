/**
 * Created by jphillips3 on 20/02/2017.
 */
public class SumSqDiff {
    public static int sumSq(int num) {
        int count = 0;
          for (int i = 1; i <= num; i++) {
            count += i*i;
        }
        return count;
    }

    public static int sqSum(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            count += i;
        }
        return count * count;
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(sqSum(num) - sumSq(num));
    }
}
