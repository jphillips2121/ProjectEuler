/**
 * Created by jphillips3 on 15/02/2017.
 */
//Problem 4

public class palindromeProd {
    public static void main(String[] args) {
        int maxNum = 0;
        int iValue = 0;
        int jValue = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                if ((isPalindrome(i*j) == true) & (i*j > maxNum)) {
                    maxNum = i*j;
                    iValue = i;
                    jValue = j;
                }
            }
        }
        System.out.println("The largest palindrome product is " + iValue + " x " + jValue + " = " + maxNum);
    }

    //Checks if number is a palindrome or not
    public static boolean isPalindrome(int num) {
        String newNum = Integer.toString(num);
        newNum = new StringBuilder(newNum).reverse().toString();
        int newNumInt = Integer.parseInt(newNum);
        if (newNumInt == num) {
            return true;
        }
        else {
            return false;
        }
    }

}
