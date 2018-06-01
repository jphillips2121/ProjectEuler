import java.util.HashSet;
import java.util.Set;

/**
 * Created by jphillips3 on 08/05/2017.
 */
public class DistinctPowers {
    public static void main(String[] args) {
        Set<Double> sqrdNumbers = new HashSet();
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                sqrdNumbers.add(Math.pow(i, j));
            }
        }
        System.out.println(sqrdNumbers.size());
    }
}
