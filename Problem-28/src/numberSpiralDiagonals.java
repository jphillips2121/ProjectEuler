import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created by jphillips3 on 05/05/2017.
 */
public class numberSpiralDiagonals {
    public static void main(String[] args) {
        int i = 1;
        int multiple = 2;
        int arrayLength = 1001;
        int arrayHeight = 1001;
        int maximumNumber = arrayHeight * arrayLength;
        ArrayList<Integer> diagonals = new ArrayList();
        while (i <= maximumNumber) {
            for (int j = 1; j <= 4; j++) {
                i += multiple;
                if (i <= maximumNumber) {
                    diagonals.add(i);
                }
                if (j == 4) {
                    multiple += 2;
                }
            }
        }
        System.out.println(diagonals);
        int total = 1;
        for (int num : diagonals) {
            total += num;
        }
        System.out.println(total);
    }
}
