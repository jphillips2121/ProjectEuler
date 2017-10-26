import java.util.ArrayList;

/**
 * Created by jphillips3 on 18/08/2017.
 */
public class digitCancellingFraction {
    public static void main(String[] args) {
        double numeratorTotal = 1;
        double denominatorTotal = 1;
        ArrayList<Double> denominators = new ArrayList<>();
        ArrayList<Double> numerators = new ArrayList<>();
        for (double i = 10; i < 100; i++) {
            for (double j = i + 1; j < 100; j++) {
                //Avoids trivial cases (multiples of 10)
                if (!((i % 10 == 0) || (j % 10 == 0))) {
                    if (isCuriousFraction(i, j)) {
                        numerators.add(i);
                        denominators.add(j);
                    }
                }
            }
        }
        for (double nums : numerators) {
            numeratorTotal = numeratorTotal * nums;
        }
        for (double denoms : denominators) {
            denominatorTotal = denominatorTotal * denoms;
        }

        System.out.println(simplifyFractionAndReturnDenominator(numeratorTotal, denominatorTotal));
    }

    /**
     * Determines if there are shared numbers and then runs the multiplication check if so.
     */
    public static boolean isCuriousFraction(double num, double den) {
        boolean isCuriousFraction = false;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (Double.toString(num).charAt(i) == Double.toString(den).charAt(j)) {
                    StringBuilder nsb = new StringBuilder(Double.toString(num));
                    nsb.deleteCharAt(i);
                    double finalNumerator = Double.parseDouble(nsb.toString());
                    StringBuilder dsb = new StringBuilder(Double.toString(den));
                    dsb.deleteCharAt(j);
                    double finalDenominator = Double.parseDouble(dsb.toString());
                    double expectedValue = finalNumerator / finalDenominator;
                    if (isSameMultiply(num, den, expectedValue)) {
                        isCuriousFraction = true;
                    }
                }
            }
        }
        return isCuriousFraction;
    }

    /**
     * Determines if fraction and cancelled fraction are equal.
     */

    public static boolean isSameMultiply(double num, double den, double expectedValue) {
        double actualValue = num / den;
        if (actualValue == expectedValue) {
            return true;
        }
        return false;
    }

    public static int simplifyFractionAndReturnDenominator(double numeratorTotal, double denominatorTotal) {
        int highestDivider = 1;
        for (int i = 2; i < denominatorTotal; i++) {
            if (numeratorTotal % i == 0 && denominatorTotal % i == 0) {
                highestDivider = i;
            }
        }
        return (int)denominatorTotal / highestDivider;
    }
}
