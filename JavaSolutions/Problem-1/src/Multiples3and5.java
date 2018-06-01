/**
 * Created by jphillips3 on 14/02/2017.
 */
public class Multiples3and5 {
        public static void main(String[] args) {
            int count = 0;
            //Loops 1 to 1000 
            for (int i = 1; i < 1000; i++) {
                if ((i % 3 == 0) || (i % 5 == 0)) {
                    count += i;
                }
            }
            System.out.println(count);
        }
}
