/**
 * Created by jphillips3 on 14/02/2017.
 */
public class evenFibs {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int newNum = 2;
        int count = 0;
        while(newNum < 4000000) {
            if(newNum % 2 == 0) {
                count += newNum;
            }
            num1 = num2;
            num2 = newNum;
            newNum = num1 + num2;
        }
        System.out.println(count);
    }
}
