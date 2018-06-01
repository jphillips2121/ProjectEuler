import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by jphillips3 on 17/08/2017.
 */
public class PandigitalProducts {
    public static void main(String[] args) {
        HashSet pandigitalProducts = new HashSet();

        for (int i = 1; i < 100; i++) {
            /**
             * If i is less than ten only multiply by four digit numbers.
             */
            if (i < 10) {
                for (int j = 1000; j < 10000; j++) {
                    String strNum = Integer.toString(i) + Integer.toString(j) + Integer.toString(i*j);
                    if (strNum.length() == 9) {
                        if (isPandigital(strNum)) {
                            pandigitalProducts.add(i*j);
                        }
                    }
                }
            }
            /**
             * If i is two digits only multiply by three digit numbers.
             */
            if (i >= 10) {
                for (int j = 100; j < 1000; j++) {
                    String strNum = Integer.toString(i) + Integer.toString(j) + Integer.toString(i*j);
                    if (strNum.length() == 9) {
                        if (isPandigital(strNum)) {
                            pandigitalProducts.add(i*j);
                        }
                    }
                }
            }
        }
        List<Integer> pandigitalProductsList = new ArrayList<Integer>(pandigitalProducts);
        int totalValue = 0;
        for (int num : pandigitalProductsList) {
            totalValue += num;
        }
        System.out.println(totalValue);
    }

    /**
     * Determines whether number is Pandigital or not.
     */
    public static boolean isPandigital(String strNum) {
        char[] charNum = strNum.toCharArray();
        Arrays.sort(charNum);
        for (int i = 0; i < charNum.length; i++) {
            if (!((i+1) == Character.getNumericValue(charNum[i]))) {
                return false;
            }
        }
        return true;
    }
}
