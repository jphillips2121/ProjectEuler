/**
 * Created by jphillips3 on 30/10/2017.
 */
public class DoubleBasePalindromes {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 1000000; i++) {
            if((String.valueOf(i).equals(new StringBuilder(Integer.toString(i)).reverse().toString()))
                    && (Integer.toBinaryString(i).equals(new StringBuilder(Integer.toBinaryString(i)).reverse().toString()))) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
