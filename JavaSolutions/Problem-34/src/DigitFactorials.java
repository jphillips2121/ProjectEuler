/**
 * Created by jphillips3 on 26/10/2017.
 */
public class DigitFactorials {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 3; i <= 10000000; i++) {
            if (isCuriousDigit(i)) {
                total += i;
            }
        }
        System.out.println(total);
    }

    public static boolean isCuriousDigit(int goalNumber) {
        char[] numberArray = String.valueOf(goalNumber).toCharArray();
        int totalFactorial = 0;
        for (char c : numberArray) {
            totalFactorial += factorial(Integer.parseInt(Character.toString(c)));
        }
        if (totalFactorial == goalNumber) {
            return true;
        }
        return false;
    }

    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
