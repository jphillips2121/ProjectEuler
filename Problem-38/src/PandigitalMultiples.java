import java.util.Arrays;

/**
 * Created by jphillips3 on 01/11/2017.
 */
public class PandigitalMultiples {
    public static void main(String[] args) {
        for (int i = 100; i < 100000; i++) {
            isConcateningMultiples("", i, 0);
        }
    }

    public static boolean isConcateningMultiples(String currentNum, int num, int i) {
        if (currentNum.length() > 9) {
            return false;
        }
        else if (currentNum.length() < 9) {
            i += 1;
            String currentNums = String.valueOf(currentNum) + String.valueOf(num * i);
            return isConcateningMultiples(currentNums ,num, i);
        }
        else {
            return isPandigital(currentNum);
        }
    }

    public static boolean isPandigital(String strNum) {
        if (strNum.length() != 9) {
            return false;
        }
        char[] charNum = strNum.toCharArray();
        Arrays.sort(charNum);
        for (int i = 0; i < charNum.length; i++) {
            if (!((i+1) == Character.getNumericValue(charNum[i]))) {
                return false;
            }
        }
        System.out.println(strNum);
        return true;
    }
}
