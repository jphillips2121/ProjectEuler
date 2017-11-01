/**
 * Created by jphillips3 on 01/11/2017.
 */
public class ChampernownesConstant {
    public static void main(String[] args) {
        String fractionalDigits = "0";
        int i = 1;
        while (fractionalDigits.length() <= 1000000) {
            fractionalDigits = fractionalDigits + String.valueOf(i);
            i += 1;
        }
        int total = Character.getNumericValue(fractionalDigits.charAt(1))
                * Character.getNumericValue(fractionalDigits.charAt(10))
                * Character.getNumericValue(fractionalDigits.charAt(100))
                * Character.getNumericValue(fractionalDigits.charAt(1000))
                * Character.getNumericValue(fractionalDigits.charAt(10000))
                * Character.getNumericValue(fractionalDigits.charAt(100000))
                * Character.getNumericValue(fractionalDigits.charAt(1000000));
        System.out.println(total);
    }
}
