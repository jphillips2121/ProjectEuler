import java.math.BigInteger;

/**
 * Created by jphillips3 on 21/04/2017.
 */
public class LatticePaths {
    /**
     * I'm going to use the Combinations Formula because it's Friday Afternoon and
     * simulating a 20x20 matrix and all lattice paths will make me want to kill myself.
     */
    public static BigInteger factorial(int num) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args) {
        //nmoves is the number of total moves (20 across plus 20 down = 40 moves)
        int nmoves = 40;
        //rmoves is the number of right moves which is 20 if I remember my A-Level statistics correctly
        int rmoves = 20;

        BigInteger numOfPaths = (factorial(nmoves)).divide((factorial(rmoves)).multiply(factorial(nmoves - rmoves)));
        System.out.println(numOfPaths);
    }
}
