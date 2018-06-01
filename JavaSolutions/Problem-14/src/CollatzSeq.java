/**
 * Created by jphillips3 on 20/04/2017.
 */
public class CollatzSeq {
    public static long collatzLength(long num) {
        //This method returns the number of terms to reduce num to 1 using the Collatz Sequence
        long length = 1;
        while (num != 1) {
            if ((num % 2) == 0) {
                num = num / 2;
                length += 1;
            } else {
                num = (3 * num) + 1;
                length += 1;
            }
        }
        return length;
    }

    public static void main (String[] args) {
        //Loops through numbers 1 to 1,000,000 and records longest Collatz Chain
        long longestChain = 1;
        long longestChainNum = 1;
        for (int i = 1; i <= 1000000; i++) {
            if (collatzLength(i) > longestChain) {
                longestChain = collatzLength(i);
                longestChainNum = i;
            }
        }
        System.out.println("Longest Chain is " + longestChain + " which is for the number " + longestChainNum);

    }

}

