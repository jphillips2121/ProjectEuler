/**
 * Created by jphillips3 on 16/02/2017.
 */
public class smallestMultiple {
    public static void main(String[] args) {
        boolean multiplied = false;
        int num = 0;
        int multiples = 20;
        while (!multiplied) {
            num += multiples;
            int count = 0;
            for (int i = 1; i <= multiples; i++) {
                if (num % i == 0) {
                    count += 1;
                    if (count == multiples) {
                        multiplied = true;
                        break;
                    }
                }
            }
        }
        System.out.println(num);
    }
}
